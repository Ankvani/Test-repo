package com.sample.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver obj = new ChromeDriver();
		System.setProperty("webdriver.driver.chrome","C:\\Driver\\chromedriver.exe");
		obj.manage().window().maximize();
		obj.get("https://www.amazon.in/");
		obj.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@type='email']")).sendKeys("ankitvani19@gmail.com");
		obj.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@type='password']")).sendKeys("Ankitvani19@");
		obj.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		obj.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung"+Keys.ENTER);
		obj.findElement(By.xpath("//li[@id='p_89/Samsung']//i")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//li[@id='p_36/1318506031']//span")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//li[@id='p_n_feature_eight_browse-bin/8561117031']//i")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//span[@class='a-dropdown-container']//span")).click();
		obj.findElement(By.xpath("//a[contains(text(),'Price: Low to High')]")).click();
		Thread.sleep(2000);
		WebElement list= obj.findElement(By.xpath("//span[@class='rush-component s-latency-cf-section']"));
		System.out.println(""+list.getText());
		obj.findElement(By.id("nav-logo-sprites")).click();
		Thread.sleep(2000);
		obj.findElement(By.partialLinkText("Amazon Pay")).click();
		obj.findElement(By.xpath("//div[@id='ViewStatement']//span")).click();
		obj.findElement(By.xpath("//div[@id='cashbacks-tab-desktop']//span")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@value='UPI']//following-sibling::i[1]")).click();
		obj.quit();
	}
}