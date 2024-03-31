package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cowin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.cowin.gov.in/");
		WebElement search = driver.findElement(By.xpath("//button[.='Search']"));
		Actions act=new Actions(driver);
		act.scrollToElement(search).perform();
		
		Thread.sleep(2000);
		
		
		
		
		
	}
}
