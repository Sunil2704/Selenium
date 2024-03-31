package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		MultipleScreenshot.capture_with_name(driver, "homepage");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		MultipleScreenshot.capture_with_name(driver, "texttyped");

	}

	public static void capture_with_name(WebDriver driver, String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Sunil\\OneDrive\\Desktop\\Selenium\\src\\screenshot" + name + ".png"));
	}

}
