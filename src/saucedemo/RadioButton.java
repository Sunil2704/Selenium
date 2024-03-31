package saucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://test.rubywatir.com/radios.php");

		// find all radio buttons web Element on the page
		List<WebElement> radioButton = driver.findElements(By.tagName("input"));

		// Print Total number of radio button the page
		System.out.println("Total No Of Radio Button on The Page:- " + radioButton.size());

		driver.close();
		driver.quit();

	}
}
