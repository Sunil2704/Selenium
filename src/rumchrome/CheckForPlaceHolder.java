package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckForPlaceHolder {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.facebook.com/");

		WebElement emailTextField = driver.findElement(By.id("email"));
		String emailPlaceHolder = emailTextField.getAttribute("value");
		System.out.println(emailPlaceHolder);

		if (emailPlaceHolder.isEmpty()) {
			emailTextField.sendKeys("pajapatisunil@gmail.com");
		} else {
			System.out.println(emailPlaceHolder);
			emailTextField.clear();
			emailTextField.sendKeys("ABCDEFG");
		}
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
