package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class LoginPageTest {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		LoginPage loginPage;
		driver=new ChromeDriver();
		loginPage=new LoginPage(driver);
		Thread.sleep(3000);
		loginPage.navigateTo();
		loginPage.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		loginPage.navigateTo();
		loginPage.login("invalid_user", "wrong_password");
		Thread.sleep(3000);
		System.out.println(loginPage.getErrorMessage());
		driver.quit();
		
	}

}
