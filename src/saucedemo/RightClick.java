package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cinevood.mom/");

		WebElement button = driver.findElement(By.xpath("//a[contains(text(),' Home')]"));

		Actions act = new Actions(driver);
		act.contextClick(button).perform(); // right click action

		Thread.sleep(3000);
		driver.quit();
	}

}
