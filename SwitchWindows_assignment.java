import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindows_assignment {
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\Chrome\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	
	
	Set<String> list = driver.getWindowHandles();
			java.util.Iterator<String> t = list.iterator();
			String parentid=t.next();
			String childid=t.next();
			driver.switchTo().window(childid);
	
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
	driver.switchTo().window(parentid);
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	
	
	
	}}