package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethods {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	WebElement email=driver.findElement(By.name("email"));
	Actions act=new Actions(driver);
	act.click(email).perform(); //click parameter
	act.contextClick(email).perform(); //right click
	act.click().perform();  //click non parameter
	act.sendKeys(email, "pajapatisunl@gmail.com").perform(); //sendkeys
	
	
	
	
	
}
}
