package rumchrome;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUrlAndUrlConcat {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/en-in/shop/deals/");

		// store the main url
		@SuppressWarnings("deprecation")
		URL mainUrl = new URL("https://www.dell.com/en-in/shop/deals/");
		Thread.sleep(2000);

		// concat sub-url to main url
		@SuppressWarnings("deprecation")
		URL laptops = new URL(mainUrl, "laptop-deals");
		driver.navigate().to(laptops);

		@SuppressWarnings("deprecation")
		URL budget = new URL(mainUrl, "ustomize-n-buy");
		driver.navigate().to(budget);
		Thread.sleep(2000);

		@SuppressWarnings("deprecation")
		URL studentLaptops = new URL(mainUrl, "student-laptop-deals");
		driver.navigate().to(studentLaptops);
		Thread.sleep(2000);
		driver.navigate().back();

		// performing navigaton tasks
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.manage().window().minimize();

		driver.quit();

	}

}
