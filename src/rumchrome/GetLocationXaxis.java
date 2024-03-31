package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationXaxis {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement emailTextBox = driver.findElement(By.id("email"));
		int emailStartX = emailTextBox.getLocation().getX();
		System.out.println("emailStartX =" + emailStartX);

		WebElement passTextBox = driver.findElement(By.id("pass"));
		int passStartX = emailTextBox.getLocation().getX();
		System.out.println("passStartX =" + passStartX);

		if (emailStartX == passStartX) {
			System.out.println("Mactched Hai BRo ab dusra code kr  ");

		} else {
			System.out.println("Not matched ALter the Code ");
		}
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
