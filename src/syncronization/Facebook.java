package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.name("email")).sendKeys("sunilprasad@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("980098009800");
		driver.findElement(By.name("login")).click();
		driver.quit();

	}
}
