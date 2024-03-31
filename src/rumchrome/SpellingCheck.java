package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpellingCheck {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement facebookelement = driver.findElement(By.xpath("//h2[contains(@class,'')]"));

		String facebookText = facebookelement.getText();
		if (facebookText.equals("Facebook helps you connect and share with the people in your life.")) {

			System.out.println("Haaan Bhaiyta ho GYa verify ");
		} else

		{
			System.out.println("Kahi galti ho gya h");
		}

	}

}
