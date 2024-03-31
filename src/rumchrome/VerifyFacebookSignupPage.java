package rumchrome;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFacebookSignupPage {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		URL mainURL = new URL("https://www.facebook.com/");
		URL signUPURL = new URL(mainURL, "signup");
		driver.navigate().to(signUPURL);

		WebElement firstNameElement = driver.findElement(By.name("firstname"));
		int heightOfUserName = firstNameElement.getSize().getHeight();
		System.out.println("Height of the Username =" + heightOfUserName);
		int widthOfUserName = firstNameElement.getSize().getWidth();
		System.out.println("Width of the Username =" + widthOfUserName);

		WebElement surname = driver.findElement(By.name("lastname"));
		int heightOfsurname = surname.getSize().getHeight();
		System.out.println("Height Of Surname =" + heightOfsurname);
		int widthOfsurname = surname.getSize().getWidth();
		System.out.println("Width of surname =" + widthOfsurname);
		if (heightOfUserName == heightOfsurname && widthOfUserName == widthOfsurname) {
			System.out.println("PAss: Height & Width Of FirstNAme is similar to Surname text field");

			firstNameElement.sendKeys("Sunil");
			surname.sendKeys("Prasad");
		}

		Thread.sleep(2000);

		WebElement mobile = driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]"));
		int heightOfmobile = mobile.getSize().getHeight();
		System.out.println("Height Of Surname =" + heightOfmobile);
		int widthOfmobile = mobile.getSize().getWidth();
		System.out.println("Width of Surname =" + widthOfmobile);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		int heightOfpassword = password.getSize().getHeight();
		System.out.println("Height Of Password =" + heightOfpassword);
		int widthOfpassword = password.getSize().getWidth();
		System.out.println("Width of Password =" + widthOfpassword);

		if (heightOfmobile == heightOfpassword && widthOfmobile == widthOfpassword) {
			System.out.println("Same Height & Width");
//			mobile.sendKeys("pajapstisunil@gmail.com");
//			password.sendKeys("1234567890");
		}

		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		gender.click();

		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);

		driver.manage().window().minimize();
		driver.quit();

	}

}
