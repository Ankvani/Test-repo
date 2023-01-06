package com.sample.MavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OraclesTest {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.driver.chrome","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://profile.oracle.com/");
		
		//Try to login by filling email and password
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='ssousername']")).sendKeys("ankitvani19@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ankitvani19@");
		driver.findElement(By.id("signin_button")).click();
		Thread.sleep(2000);
		WebElement Error = driver.findElement(By.xpath("//span[@id='errormsg']//div"));
		System.out.println("Message : -"+Error.getText());
		System.out.println("You need to create a new Account as you don't have valid Creadentils");
		
		
		
		Thread.sleep(2000);
		if(Error.isDisplayed())
		{
		driver.findElement(By.xpath("//div[@class='cb41w4']//a")).click();
		}
		else
		{
		System.out.println("Please try again letter");
		Thread.sleep(2000);
		driver.close();
		}
		
		//Switched windows from login page to registration page
		Thread.sleep(4000);
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent =it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		//Fill registration details
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement password = driver.findElement(By.id("sView1:r1:0:password::content"));
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement retype = driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		js.executeScript("arguments[0].style.border='2px solid green'",email);
		js.executeScript("arguments[0].style.border='2px solid green'",password);
		js.executeScript("arguments[0].style.border='2px solid green'",retype);
		Thread.sleep(4000);
		email.sendKeys("ankitvani19@gmail.com");
		Thread.sleep(2000);
		password.sendKeys("Welcome@09");
		Thread.sleep(2000);
		retype.sendKeys("Welcome@09");
		driver.findElement(By.xpath("//select[@title='India']")).click();
		driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Ankit");
		driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Vani");
		driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Software Engineer");
		driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("8959518903");
		driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("CapG");
		driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("Datt mandir,Wakad");
		driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Pune");
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.id("sView1:r1:0:state::content")));
		Thread.sleep(4000);
		s.selectByIndex(21);
		Thread.sleep(4000);
		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("411057");
		System.out.println("!!!Congratulations!!!"+"\n"+"Your Account successfully created.");
		Thread.sleep(2000);
		driver.quit();
		}
		}