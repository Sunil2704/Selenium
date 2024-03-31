package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetReact {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement emailTextField = driver.findElement(By.id("email"));
		int emailReactX = emailTextField.getRect().getX();
		System.out.println("emailReactX =" + emailReactX);
		int emailHeight = emailTextField.getRect().getHeight();
		System.out.println("emailHeight =" + emailHeight);
		int sumOfEmailElement = emailHeight + emailReactX;
		System.out.println("Sum Of Height And X-Axis =" + sumOfEmailElement);

		WebElement passTextField = driver.findElement(By.id("passContainer"));
		int passReactX = passTextField.getRect().getX();
		System.out.println("passReactX =" + passReactX);
		int passHeight = passTextField.getRect().getHeight();
		System.out.println("passHeight =" + passHeight);
		int sumOfPasswordElement = passHeight + passReactX;
		System.out.println("Sum Of Height And X-Axis =" + sumOfPasswordElement);

		if (sumOfEmailElement == sumOfPasswordElement) {
			System.out.println("Pass: Matched hai bro tension mat le");
		} else
			System.out.println("Fail: Kahi to Galati ho gya h bro ");

		driver.manage().window().minimize();
		driver.quit();
	}

}
