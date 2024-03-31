package rumchrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyUsingRobot {
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement text = driver.findElement(By.id("email"));
		String tagg = text.getTagName();
		Robot rb = new Robot();
		if (tagg.equals("input")) {

			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			Thread.sleep(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);

			rb.keyPress(KeyEvent.VK_TAB);
			rb.delay(2000);

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
			Thread.sleep(2000);

			WebElement loginBUtton = driver.findElement(By.name("login"));
			loginBUtton.submit();

			Thread.sleep(5000);
			driver.manage().window().minimize();
			Thread.sleep(2000);

		}
	}
}
