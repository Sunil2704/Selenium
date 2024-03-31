package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello {
	private static final Duration Duration = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://trello.com/");

		WebElement loginlink = driver.findElement(By.xpath("//a[1][contains(text(),'Log in')]"));
		loginlink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement emailText = driver.findElement(By.id("username"));
		emailText.sendKeys("menah45048@trackden.com");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).submit();
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Jira@Practice");
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		loginButton.click();
		WebElement createBoard = driver.findElement(By.xpath("//*[contains(text(),'Create new board')]"));
		createBoard.click();
		driver.findElement(By.xpath("//*[@type='text' or @data-testid='create-board-title-input']")).sendKeys("Hello");
		WebElement button = driver
				.findElement(By.xpath("//*[@type='button'] [@data-testid='create-board-submit-button']"));
		if (button.isEnabled()) {
			button.click();
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(button)).click();
			System.out.println("Button was Not Enabled");
		}

//		WebDriverWait element=new WebDriverWait(driver,Duration.ofSeconds(5));
//		Thread.sleep(2000);

//		String homeUrl = driver.getWindowHandle();
//		driver.switchTo().window(homeUrl);
//		System.out.println(homeUrl);
		findDelete(driver, wait);
	}

	private static void findDelete(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		WebElement helloElemet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/ul//li")));

		Actions act = new Actions(driver);
		act.moveToElement(helloElemet);
		if (helloElemet.isEnabled()) {
			WebElement dot = driver.findElement(By.xpath("//div[3]/ul//li//button/span/span"));
			act.click(dot).perform();
			System.out.println("Found");

		} else {
			System.out.println("Not Found");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Close board')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		
		//program end
		
		String newWin = driver.getWindowHandle();
		driver.switchTo().window(newWin);
		Trello.findDelete(driver, wait);
		
		if (driver.findElement(By.xpath("//button[contains(text(),'Permanently delete board')]")).isEnabled()) {

			driver.findElement(By.xpath("//button[contains(text(),'Permanently delete board')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		}
	}

}
