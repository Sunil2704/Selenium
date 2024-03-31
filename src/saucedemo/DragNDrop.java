package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement facebookText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		Actions act = new Actions(driver);
		act.doubleClick(facebookText).perform();

		WebElement paste = driver.findElement(By.id("email"));
		String find = paste.getCssValue("value");
		if (find.isEmpty()) {
			act.dragAndDrop(facebookText, paste).perform();
		}

		Thread.sleep(5000);
		driver.quit();

	}

}
