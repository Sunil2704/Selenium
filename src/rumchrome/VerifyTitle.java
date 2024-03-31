package rumchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title "+ actualTitle);
		String expectedTitle="Facebook – log in or sign up";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass: The Actual title of facebook page is verified");
			
		}
		else
		{
			System.out.println("FAil: The actual title of facebook page is not verified ");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
