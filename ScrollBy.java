import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollBy {
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(3000);
js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");


List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

int sum = 999;

for (int i = 0;i<values.size();i++)
{
	sum = sum +Integer.parseInt(values.get(i).getText());
	
}
	
System.out.println("Sum is = "+sum);

int expect = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(" ")[3]);
System.out.println("Expected Sum is = "+expect);

if (sum==expect)
{
System.out.println("Total amount is correct amount"+sum);	
}
else
{
System.out.println("Total amount is not correct amount which is = "+sum);	
}

}}