package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloDelete {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Trigger The URL
		driver.get("https://trello.com/");

		// Perform Login
		WebElement loginlink = driver.findElement(By.xpath("//a[1][contains(text(),'Log in')]"));
		loginlink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement emailText = driver.findElement(By.id("username"));
		emailText.sendKeys("menah45048@trackden.com");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).submit();
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Jira@Practice");
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		loginButton.click();
		Thread.sleep(5000);
		driver.navigate().to("https://trello.com/w/userworkspace62680aab027ab3bd2e062feb9fd753bc/home");

		Actions act = new Actions(driver);
		int in = 1;
		for (int i = 1; i >= in; i++) {
			Thread.sleep(2000);

			driver.findElement(By.xpath("//ul[1]//li[1]//div[@title='Topics']")).click();
			Thread.sleep(2000);
			WebElement sdet = driver.findElement(By.xpath("//a[@title='Topics (currently active)']"));
			act.moveToElement(sdet).perform();
			WebElement dot = driver.findElement(
					By.xpath("//div[@id='content']//button//span[@data-testid='OverflowMenuHorizontalIcon']"));
			dot.click();
			driver.findElement(By.xpath("//*[contains(text(),'Close board')]")).click();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//button[.='Permanently delete board']")).click();
			driver.findElement(By.xpath("//button[.='Delete']")).click();
		}

	}

}
