package com.sample.MavenProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
public class AmazonTestNGTest {
	WebDriver obj2=new ChromeDriver();	

		@BeforeTest
		public void LaunchApp() throws IOException
		{
			System.setProperty("webdriver.driver.chrome","C:\\Driver\\chromedriver.exe");
			obj2.manage().window().maximize();
			obj2.get("https://www.amazon.in/");
			
		}
			
			public void screenshot(WebDriver webdriver, String path ) throws IOException
			{
				TakesScreenshot scr = ((TakesScreenshot)webdriver);
				File SCRfile = scr.getScreenshotAs(OutputType.FILE);
				File DestFile= new File(path);
				FileUtils.copyFile(SCRfile, DestFile);
			}
	
			@Test
			public void AmazonMobileShopping() throws InterruptedException, FileNotFoundException {
			
			obj2.findElement(By.partialLinkText("Sign in")).click();
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//input[@type='email']")).sendKeys("ankitvani19@gmail.com");
			obj2.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//input[@type='password']")).sendKeys("Ankitvani19@");
			obj2.findElement(By.id("signInSubmit")).click();
			Thread.sleep(2000);
			obj2.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung"+Keys.ENTER);
			obj2.findElement(By.xpath("//li[@id='p_89/Samsung']//i")).click();
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//li[@id='p_36/1318506031']//span")).click();
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//li[@id='p_n_feature_eight_browse-bin/8561117031']//i")).click();
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//span[@class='a-dropdown-container']//span")).click();
			obj2.findElement(By.xpath("//a[contains(text(),'Price: Low to High')]")).click();
			Thread.sleep(2000);
			WebElement list= obj2.findElement(By.xpath("//span[@class='rush-component s-latency-cf-section']"));
			System.out.println("Search results as requested : "+list.getText());
			
			PrintStream myconsole = new PrintStream(new File("E:\\Output\\Mobile_Results.txt"));
			System.setOut(myconsole);
			myconsole.print(""+list.getText());
		}
		
		@Test
		public void AmazonPay() throws InterruptedException, IOException
		{
			obj2.findElement(By.id("nav-logo-sprites")).click();
			Thread.sleep(2000);
			obj2.findElement(By.partialLinkText("Amazon Pay")).click();
			obj2.findElement(By.xpath("//div[@id='ViewStatement']//span")).click();
			obj2.findElement(By.xpath("//div[@id='cashbacks-tab-desktop']//span")).click();
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//input[@value='UPI']//following-sibling::i[1]")).click();
			Thread.sleep(2000);
			WebElement msg = obj2.findElement(By.xpath("//span[contains(text(),'You do not have any')]"));
			Thread.sleep(2000);
			
			PrintStream myconsole = new PrintStream(new File("E:\\Output\\AmazonPay.txt"));
			System.setOut(myconsole);
			myconsole.print("Message from AmazonPay : - "+msg.getText());
			
			this.screenshot(obj2, "E:\\Output\\AmazpnPaytest.png") ; 
			
  		}
		
		@Test
		public void CustomerService() throws InterruptedException, IOException
		{
			Thread.sleep(2000);
			obj2.findElement(By.id("nav-logo-sprites")).click();
			
			if(obj2.findElement(By.xpath("//a[contains(@href,'/help/customer/display.html')]")).isDisplayed())
			{
				obj2.findElement(By.partialLinkText("Customer Service")).click();
				Thread.sleep(2000);
				Orders();
			}
			else
			{
				obj2.findElement(By.id("twotabsearchtextbox")).sendKeys("Customer help"+Keys.ENTER);
				obj2.findElement(By.partialLinkText("Help and customer service")).click();
				Thread.sleep(2000);
				Orders();		
			}
		}
		private void Orders() throws IOException {
			{
				obj2.findElement(By.partialLinkText("Your Orders")).click();
				obj2.findElement(By.xpath("//span[@id='a-autoid-1']//span//span")).click();
				obj2.findElement(By.partialLinkText("2022")).click();
				WebElement Message = obj2.findElement(By.xpath("//div[@id='ordersContainer']//div[2]"));
				
				PrintStream myconsole = new PrintStream(new File("E:\\Output\\CustomerService.txt"));
				System.setOut(myconsole);
				myconsole.println("Message from Amazon Customer service section : "+Message.getText()+"\n\r");
				this.screenshot(obj2, "E:\\Output\\CustomerServicetest.png") ; 
				}
			
				
		}
		@Test
		public void PrimeVideo() throws InterruptedException, IOException
		{
			Thread.sleep(2000);
			obj2.findElement(By.id("nav-logo-sprites")).click();
			obj2.findElement(By.id("twotabsearchtextbox")).sendKeys("Prime video"+Keys.ENTER);
			Thread.sleep(2000);
			obj2.findElement(By.partialLinkText("Prime Video")).click();
			Thread.sleep(2000);
			obj2.findElement(By.id("navSwmHoliday")).click();
			
			PrintStream myconsole = new PrintStream(new File("E:\\Output\\PrimeVideo.txt"));
			System.setOut(myconsole);
			myconsole.println("You can watch your favourite Hindi films and series on Amazon Prime Video"+"/n/r");
			this.screenshot(obj2, "E:\\Output\\PrimeVideotest.png") ; 
		}
		
		@AfterTest
		public void CloseApp()
		{
			obj2.quit();
		}
		
}
