
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");


Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
WebElement nav = driver.findElement(By.id("twotabsearchtextbox"));
a.moveToElement(nav).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

}}