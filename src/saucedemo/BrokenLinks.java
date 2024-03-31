package saucedemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// wait 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");

		// find elements
		List<WebElement> dead = driver.findElements(By.tagName("a"));
		for (WebElement listLink : dead) {
			String url = listLink.getAttribute("href");

		}
	}
}
