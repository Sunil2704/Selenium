package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShotElement {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.the-maharajas.com/");
		WebElement fb=driver.findElement(By.xpath("//nav//div//div//img[@class='lazy-img']"));
//		TakesScreenshot fb = (TakesScreenshot) driver;
		File tempFb = fb.getScreenshotAs(OutputType.FILE);
		File PermaFb = new File("C:\\Users\\Sunil\\OneDrive\\Desktop\\Selenium\\errorSS\\rcb.png");
		FileUtils.copyFile(tempFb, PermaFb);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
