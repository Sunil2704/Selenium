package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UppclLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uppclonline.com/");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.id("knoVal"));
		Select dropdown =new Select(element);
		dropdown.selectByValue("PUVNL");
		driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("3285707000");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("********");
		
		
		//post methods
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
