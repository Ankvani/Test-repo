import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
WebDriverWait w = new WebDriverWait(driver, 10);
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("password")).sendKeys("learning");
driver.findElement(By.xpath("//input[@value='user']")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
driver.findElement(By.id("okayBtn")).click();
driver.findElement(By.xpath("//option[@value='consult']")).click();
driver.findElement(By.id("terms")).click();
driver.findElement(By.xpath("//input[@type='submit']")).click();
String[] Need = {"iphone X","Samsung Note 8"};
additems(driver,Need);
}

public static void additems(WebDriver driver,String[] Need)
{
	List<WebElement> products=driver.findElements(By.cssSelector("div.card.h-100"));
	
	
	}}