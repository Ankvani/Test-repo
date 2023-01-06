package com.sample.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotClassTestNGTest {
	WebDriver d = new ChromeDriver();
	
	@BeforeTest
	public void LaunchPortal()
	{
		System.setProperty("webdriver.driver.chrome","C:\\Driver\\chromedriver.exe");
		d.manage().window().maximize();
		d.get("https://www.google.co.in/");
	}

  @Test
  public void GoogleSearchwithRoboClass() throws AWTException, InterruptedException, IOException {
	  
	  	//Use javascript method to Highlight the search bar
	    JavascriptExecutor js =(JavascriptExecutor)d;
		WebElement searchbox = d.findElement(By.xpath("//input[@name='q']"));
		js.executeScript("arguments[0].style.border='2px solid green'",searchbox);
		searchbox.sendKeys("Microsoft"+Keys.ENTER);
				
		//Use Robot classes method******
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		for(int i=0;i<3;i++)
		{
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		for(int j=0;j<4;j++)
		{
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		}
		
		
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Microsoft account")).click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		WebElement wiki = d.findElement(By.xpath("//a[@class='ruhjFe NJLBac fl']")); 
		wiki.click();
		Thread.sleep(2000);
		WebElement content = d.findElement(By.xpath("//li[@class='toclevel-1 tocsection-1']"));
		PrintStream p =new PrintStream(new File("E:\\Output\\wiki\\History.txt"));
		System.setOut(p);
		p.print("History : - "+content.getText());
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
		
		//Take screenshot of Wikipedia content
		TakesScreenshot sc =(TakesScreenshot)d;
		File S=sc.getScreenshotAs(OutputType.FILE);
		File D = new File("E:\\Output\\wiki\\History.png");
		FileUtils.copyFile(S, D);
  		}
  
  
		@AfterTest
		public void Exit()
		{
		d.quit();
		}
}
