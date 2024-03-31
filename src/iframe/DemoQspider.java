package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/frames/nested?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		WebElement nestedframe = driver.findElement(By.name("nestedFrameName"));
		driver.switchTo().frame(nestedframe);
		String emailId = driver.findElement(By.xpath("//p[2][@class='para']")).getText();
		String defaultPass = driver.findElement(By.xpath("//p[4]")).getText();
		String confirmPass = driver.findElement(By.xpath("//p[6]")).getText();

		WebElement childframe = driver.findElement(By.name("newWindow"));
		driver.switchTo().frame(childframe);
		driver.findElement(By.id("email")).sendKeys(emailId);
		driver.findElement(By.id("password")).sendKeys(defaultPass);
		driver.findElement(By.id("confirm-password")).sendKeys(confirmPass);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}
}
