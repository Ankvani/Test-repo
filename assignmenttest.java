import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class assignmenttest {



public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//a[@value='BHO']")).click();
driver.findElement(By.xpath("//a[@value='DED']")).click();
driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
System.out.print(driver.findElement(By.id("ctl00$mainContent$view_date2")).getAttribute("ctl00$mainContent$view_date2"));

}}