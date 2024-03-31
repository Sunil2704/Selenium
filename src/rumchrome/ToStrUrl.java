package rumchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToStrUrl {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cowin.gov.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://selfregistration.cowin.gov.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.cowin.gov.in/our-partner");
		Thread.sleep(2000);
		driver.navigate().to("https://verify.cowin.gov.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().to("https://dashboard.cowin.gov.in/");
		Thread.sleep(2000);

		driver.navigate().forward();
		driver.navigate().to("https://abha.abdm.gov.in/abha/v3/");
		driver.manage().window().minimize();
		driver.quit();
	}

}
