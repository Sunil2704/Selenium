package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheSizeOfEmailAndPAssword {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.name("email"));
		int heightOfEmail = email.getSize().getHeight();
		int widthOfEmail = email.getSize().getWidth();
		System.out.println("HEight Of email " + heightOfEmail + " " + "Width Of Email " + widthOfEmail);

		WebElement password = driver.findElement(By.id("passContainer"));
		int heightOfPassword = password.getSize().getHeight();
		int widthOfPassword = password.getSize().getWidth();
		System.out.println("HEight Of pAsword " + heightOfPassword + " " + "Width Of PAssword " + widthOfPassword);

		if (heightOfEmail == heightOfPassword && widthOfEmail == widthOfPassword) {
			System.out.println("Pass: HEigt & Width of both The element is same ");
		} else
			System.out.println("FAil: Both element's height & width is not same ");

		driver.manage().window().minimize();
		driver.quit();
	}
}
