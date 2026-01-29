package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.googleSearchPages;

public class googleTestClass {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		googleSearch();
		driver.quit();
	
	}
	public static void googleSearch() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		googleSearchPages.textBox_Search(driver).sendKeys("India");
		Thread.sleep(3000);
		googleSearchPages.textBox_Search(driver).sendKeys(Keys.ENTER);
		

	}

}
