package rumchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) throws InterruptedException {
		
		
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			String actualUrl=driver.getCurrentUrl();
			System.out.println("Actual Title "+ actualUrl);
			String expectedUrl="https://www.faceboook.com/";
			if(actualUrl.equals(expectedUrl))
			{
				System.out.println("Pass: The Actual URL  of facebook page is verified");
				
			}
			else
			{
				System.out.println("FAil: The actual URL  of facebook page is not verified ");
			}
			Thread.sleep(2000);
			driver.manage().window().minimize();
			driver.quit();
		}

	


	}


