import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class EndtoEndUIElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		for (int j = 1; j < 5; j++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		WebElement dropdownlist = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop = new Select(dropdownlist);
		drop.selectByIndex(3);
		
	

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.print("Return Date is disabled");
		} else {
			System.out.print("Return Date is Enabled");
		}

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}
}