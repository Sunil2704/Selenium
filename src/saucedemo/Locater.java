package saucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater {

	public static void main(String[] args) {

		// to open empty chrome
		WebDriver driver = new ChromeDriver();

		// open saucedemo site
		driver.get("https://www.saucedemo.com");

		// find user-namae box and enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// find password text and fill password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		// click on login button
		driver.findElement(By.id("login-button")).click();

		// switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);

		// locate Sauce Labs Bolt T-Shirt
//	driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();

		// lists of webelements
		List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Elelment size :" + elementList.size()); // elements name with sauce on the webpage

	}

}
