package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		Actions act = new Actions(driver);
		act.doubleClick(email).perform();
		Thread.sleep(2000);

		driver.quit();
	}

}
