package saucedemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement logo = driver.findElement(By.xpath("//button[@name='login']"));

		File file = logo.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Sunil\\OneDrive\\Desktop\\Selenium\\src\\logo.png");
		Files.copy(file, destfile);

		driver.quit();
	}

}
