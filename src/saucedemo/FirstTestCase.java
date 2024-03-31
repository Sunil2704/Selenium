package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		// locate password
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		// locate login button by using tag.name
		driver.findElement(By.cssSelector("input#login-button")).click();

		// Switch to current window
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);

		// tag.valueClass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();

		// navigate to cart
		driver.findElement(By.className("shopping_cart_link")).click();

		// checkout
		String newWindow = driver.getWindowHandle();
		driver.switchTo().window(newWindow);
		driver.findElement(By.id("checkout")).click();

		// Fill details
		String newWindowName = driver.getWindowHandle();
		driver.switchTo().window(newWindowName);
		driver.findElement(By.id("first-name")).sendKeys("Sunil");
		driver.findElement(By.id("last-name")).sendKeys("Prasad");
		driver.findElement(By.name("postalCode")).sendKeys("274303");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();

	}
}
