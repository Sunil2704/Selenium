package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		int emailY = email.getLocation().getY();
		System.out.println("Email -Y-Axis= "+emailY);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		int passwordY = password.getLocation().getY();
		System.out.println("Password-Y-Axis= "+passwordY);

		if (emailY == passwordY) {

			System.out.println("MAtched hai bro ");

		}
		else 
			System.out.println("Fir se Try kr bRo");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
