package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloDeleteByThreeDot {
	public static void main(String[] args) {

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
		String board = driver.getWindowHandle();
		driver.switchTo().window(board);
		driver.findElement(By.xpath("//ul/li[1]//div/div/div")).click();

		Actions act = new Actions(driver);
		int in = 1;
		for (int i = 1; i >= in; i++) {
			try {
				WebElement topics = driver.findElement(By.xpath("//a[@title='Topics']"));

				if (topics.isDisplayed()) {

					act.moveToElement(topics).perform();
					driver.findElement(By.xpath("//li[1]//button[@aria-label='Board actions menu']/span/span")).click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Close board']")))
							.click();
					driver.findElement(By.xpath("//button[.='Close']")).click();
				}
			} finally {
				WebElement activeTopics = driver.findElement(By.xpath("//a[@title='Topics (currently active)']"));
				act.moveToElement(activeTopics).perform();
				driver.findElement(By.xpath("//a[@title='Topics (currently active)']//..//button/span/span")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Close board']"))).click();
				driver.findElement(By.xpath("//button[.='Close']")).click();
				driver.findElement(By.xpath("//button[.='Permanently delete board']")).click();
				driver.findElement(By.xpath("//button[.='Delete']")).click();
			}

		}
	}
}