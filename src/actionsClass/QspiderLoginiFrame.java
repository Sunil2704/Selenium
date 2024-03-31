package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderLoginiFrame {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement firstFrame = driver
				.findElement(By.xpath("//div[1]/iframe"));
		driver.switchTo().frame(firstFrame);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Admin@1234");
		driver.switchTo().parentFrame();

		WebElement secondFrame = driver
				.findElement(By.xpath("//div[2]//section[@id='demoUI']//div[1]/section/div[2]/iframe"));
		driver.switchTo().frame(secondFrame);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.xpath("//button[.='Login']")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
