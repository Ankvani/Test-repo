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

public class ScrollAssignment {
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://qaclickacademy.com/practice.php");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,700)");

WebElement otherdriver = driver.findElement(By.id("product"));
List<WebElement> row  = otherdriver.findElements(By.tagName("tr"));
System.out.println("Number of rows in product details table = "+row.size());

List<WebElement> column = otherdriver.findElements(By.tagName("th"));
System.out.println("Number of Columns in product details table = "+column.size());

System.out.println("1st column contains = "+driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[1]")).getText());
System.out.println("2nd column contains = "+driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[2]")).getText());
System.out.println("3rds column contains = "+driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[3]")).getText());

}}