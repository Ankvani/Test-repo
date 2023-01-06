import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\Driver\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.google.com/");
		        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("EPFO", Keys.ENTER);
		        Thread.sleep(2000);
		        driver.findElement(By.partialLinkText("Employees' Provident Fund Organisation")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//a[@title='Our Services']")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.partialLinkText("For Employees")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//a[contains(text(),'Member Passbook')]")).click();

		        Thread.sleep(2000);
		        Set<String> list = driver.getWindowHandles();
		        Iterator<String> t = list.iterator();
		        String parent =  t.next();
		        String child =  t.next();
		        driver.switchTo().window(child);

		        Thread.sleep(2000);
		        driver.findElement(By.id("username")).sendKeys("101352061229");
		        driver.findElement(By.name("password")).sendKeys("Ankitvani18");

		    }
		}