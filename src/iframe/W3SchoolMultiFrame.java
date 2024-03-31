package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolMultiFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		WebElement parentFrame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(parentFrame);
		String h1text = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("Parent text -->" + h1text);

		driver.switchTo().frame(0);
		String childtext = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Child Text -->" + childtext);

	}

}
