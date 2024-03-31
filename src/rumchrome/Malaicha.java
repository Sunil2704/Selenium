package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Malaicha {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		WebElement username = driver.findElement(By.name("username"));
		String getValue = username.getCssValue("value");
		if (getValue.isEmpty()) {
			username.sendKeys("pajapatisunil@gmail.com");
		}
		WebElement password = driver.findElement(By.name("pin"));
		String passValue = password.getCssValue("value");
		if (passValue.isEmpty()) {
			password.sendKeys("987321654");
		}
		
		WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.submit();

		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
