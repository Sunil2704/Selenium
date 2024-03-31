package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShotOfGoogle {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	TakesScreenshot google=(TakesScreenshot)driver;
	File googletempFile=google.getScreenshotAs(OutputType.FILE);
	File PermaGoogle=new File("C:\\Users\\Sunil\\OneDrive\\Desktop\\Selenium\\errorSS\\google.png");
	FileUtils.copyFile(googletempFile, PermaGoogle);
	
	driver.manage().window().minimize();
	driver.quit();
	
	
	
	
	
}
}
