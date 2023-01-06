import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindows {
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
	Set<String> windows = driver.getWindowHandles();
	java.util.Iterator<String> it = windows.iterator();
	String parentid = it.next();
	String childid= it.next();
	driver.switchTo().window(childid);
	String email = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	driver.switchTo().window(parentid);
	driver.findElement(By.id("username")).sendKeys(email);
		
	}}