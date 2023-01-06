import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class selectdates {



public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/angularpractice/");
driver.findElement(By.name("name")).sendKeys("Ankit Vani");
driver.findElement(By.name("email")).sendKeys("ankitvani18@gmail.com");
driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Welcome@12");
driver.findElement(By.cssSelector("input[type='checkbox']")).click();
System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
driver.findElement(By.id("exampleFormControlSelect1")).click();
driver.findElement(By.id("inlineRadio1")).click();
driver.findElement(By.xpath("//input[@type='date']")).sendKeys("31-12-1994");
driver.findElement(By.cssSelector("input[value='Submit']")).click();
System.out.print(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

}}