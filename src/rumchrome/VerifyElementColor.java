package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyElementColor {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement loginElement = driver.findElement(By.name("login"));
		String loginButtonColor = loginElement.getCssValue("background-color"); // Capturing the bg Color Value in rgba
		System.out.println("BAckground Color of Login Button  Is -->" + loginButtonColor);

		String hexaValue = Color.fromString(loginButtonColor).asHex();
		System.out.println("HexaValue of Color is -->" + hexaValue);

		driver.manage().window().minimize();
		driver.quit();
	}
}
