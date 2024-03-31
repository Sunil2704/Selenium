package homeWork;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoLogin {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/");
		
		URL mainUrl= new URL("https://practicetestautomation.com/");
		
		//concat url
		URL secondPage= new URL(mainUrl,"practice/");
		driver.navigate().to(secondPage);
		Thread.sleep(1000);
		
		String currWin1=driver.getWindowHandle();
		driver.switchTo().window(currWin1);
		driver.findElement(By.partialLinkText("Test Login")).click();
		Thread.sleep(1000);
		

		String testPage=driver.getWindowHandle();
		driver.switchTo().window(testPage);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("student");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Password123");
		driver.findElement(By.cssSelector("button[class='btn']")).click();
		
		String homePage=driver.getWindowHandle();
		driver.switchTo().window(homePage);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log out")).click();

		
		
		
		
		
		
		//post methods 
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
