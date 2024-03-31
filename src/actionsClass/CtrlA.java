package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CtrlA {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userid = driver.findElement(By.id("username"));
		Actions act = new Actions(driver);
		act.keyDown(userid, Keys.CONTROL).sendKeys(userid, "a").keyUp(userid, Keys.CONTROL)
				.sendKeys(userid, Keys.DELETE).sendKeys(userid, "Sunil").build().perform();

		WebElement pass = driver.findElement(By.id("password"));
		act.keyDown(pass, Keys.CONTROL).sendKeys(pass, "a").keyUp(pass, Keys.CONTROL).sendKeys(pass, Keys.DELETE)
				.sendKeys(pass, "Sunil").build().perform();

	}
}
