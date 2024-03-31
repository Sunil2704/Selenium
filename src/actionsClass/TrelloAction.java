package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

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

		// Creating Actions class
		Actions act = new Actions(driver);

//		//scroll the winddow
//		act.scrollByAmount(0, 200);

		// Creating Board
		driver.findElement(By.xpath("//p[.='Create']")).click();
		driver.findElement(By.xpath(
				"//p[.='A board is made up of cards ordered on lists. Use it to manage projects, track information, or organize anything.']"))
				.click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Topics");
		WebElement create = driver.findElement(By.xpath("//form/button[.='Create']"));
		if (create.isEnabled()) {
			create.click();
		} else
			System.out.println("Not Enabled");
		
		
		// Creating Board
		driver.findElement(By.xpath("//textarea[@placeholder='Enter list title…']")).sendKeys("Topics");
		driver.findElement(By.xpath("//button[.='Add list']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter list title…']")).sendKeys("Java");
		driver.findElement(By.xpath("//button[.='Add list']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter list title…']")).sendKeys("Manual");
		driver.findElement(By.xpath("//button[.='Add list']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter list title…']")).sendKeys("SQL");
		driver.findElement(By.xpath("//button[.='Add list']")).click();
		act.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE);

		// Creating cards/Objects
		driver.findElement(By.xpath("//ol//li[1]//button[contains(text(),'Add a card')]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("OOPs");
		driver.findElement(By.xpath("//button[.='Add card']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"))
				.sendKeys("Object Class");
		driver.findElement(By.xpath("//button[.='Add card']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"))
				.sendKeys("Wrapper Class");
		driver.findElement(By.xpath("//button[.='Add card']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Joins");
		driver.findElement(By.xpath("//button[.='Add card']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("DML");
		driver.findElement(By.xpath("//button[.='Add card']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Self Join");
		driver.findElement(By.xpath("//button[.='Add card']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"))
				.sendKeys("System Testing");
		driver.findElement(By.xpath("//button[.='Add card']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"))
				.sendKeys("Regression Testing");
		driver.findElement(By.xpath("//button[.='Add card']")).click();

		// Finding WebElemnts of those object which we have to Drag And Drop
		WebElement oops = driver.findElement(By.xpath("//a[.='OOPs']"));
		WebElement objectClass = driver.findElement(By.xpath("//a[.='Object Class']"));
		WebElement wrapperClass = driver.findElement(By.xpath("//a[.='Wrapper Class']"));
		WebElement joins = driver.findElement(By.xpath("//a[.='Joins']"));
		WebElement dml = driver.findElement(By.xpath("//a[.='DML']"));
		WebElement selfjoins = driver.findElement(By.xpath("//a[.='Self Join']"));
		WebElement systemTesting = driver.findElement(By.xpath("//a[.='System Testing']"));
		WebElement regressionTesting = driver.findElement(By.xpath("//a[.='Regression Testing']"));

		// Finding Element Where to drop the objects
		WebElement java = driver.findElement(By.xpath("//ol//li[2]//button[contains(text(),'Add a card')]"));
		WebElement manual = driver.findElement(By.xpath("//ol//li[3]//button[contains(text(),'Add a card')]"));
		WebElement sql = driver.findElement(By.xpath("//ol//li[4]//button[contains(text(),'Add a card')]"));

		// now Dragging and Droping the Objects
		act.dragAndDrop(oops, java).pause(1000).dragAndDrop(objectClass, java).pause(1000)
				.dragAndDrop(wrapperClass, java).pause(1000).dragAndDrop(joins, sql).pause(1000).dragAndDrop(dml, sql)
				.pause(1000).dragAndDrop(selfjoins, sql).pause(1000).dragAndDrop(systemTesting, manual).pause(2000)
				.dragAndDrop(regressionTesting, manual).build().perform();
//		act.dragAndDrop(wrapperClass, java).release(wrapperClass).perform();
//		act.dragAndDrop(joins, sql).release(joins).perform();
//		act.dragAndDrop(dml, sql).release(dml).perform();
//		act.dragAndDrop(selfjoins, sql).release(selfjoins).perform();
//		act.dragAndDrop(systemTesting, manual).release(systemTesting).perform();
//		act.dragAndDrop(regressionTesting, manual).release(regressionTesting).perform();

		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
