
package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotifications {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://push-notifications-demo.netlify.app/");
		driver.findElement(By.xpath("//button[.='Ask user permission']")).click();

		
		driver.quit();
	}
}
