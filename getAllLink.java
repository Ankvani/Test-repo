import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getAllLink {
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	List<WebElement> sz = driver.findElements(By.tagName("a")); 
	System.out.println(sz.size());
	
	WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	List<WebElement> link = footerdriver.findElements(By.tagName("a"));
	System.out.println(link.size());
	//Thread.sleep(3000);
	List<WebElement> columndriver = footerdriver.findElements(By.xpath("//table/tbody/tr/td[1]/ul/li"));
	System.out.println(columndriver.size());
	
	
		
	}}