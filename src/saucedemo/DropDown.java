package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement element = driver.findElement(By.xpath("//div/p/select"));
		Thread.sleep(2000);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Iceland");

		Thread.sleep(2000);
		driver.quit();
	}

}
