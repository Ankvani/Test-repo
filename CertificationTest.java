

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CertificationTest {
public static void main(String[] args) throws InterruptedException, IOException 
{
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

ChromeOptions option = new ChromeOptions();
option.setAcceptInsecureCerts(true);
WebDriver driver =new ChromeDriver(option);

driver.manage().window().maximize();
driver.get("https://expired.badssl.com/");
System.out.println(driver.getTitle());

File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("D:\\screenshot.png"));

}}