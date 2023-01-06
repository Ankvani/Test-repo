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

public class CalenderHandle {
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.path2usa.com/travel-companions");
	driver.findElement(By.xpath("//input[@name='travel_date']")).click();
	
	
	while(!driver.findElement(By.cssSelector("[class='datepicker-months'] [class='month']")).getText().contains("April"));
	{
		driver.findElement(By.xpath("//th[@class='next']")).click();
	}
	List<WebElement> count1 = driver.findElements(By.xpath("//td[@class='day']"));
	int size = count1.size();
	for(int i=0;i<size;i++)
	{
		String text = driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("20"))
		{
			 driver.findElements(By.className("day")).get(i).click();
			 break;
		}
	}
	
	
	
	}}