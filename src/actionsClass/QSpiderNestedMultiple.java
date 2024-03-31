package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSpiderNestedMultiple {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		WebElement firstFrame = driver.findElement(By.xpath("//div[1][@class!='form-group']/iframe"));
		driver.switchTo().frame(firstFrame);
		String email = driver.findElement(By.xpath("//p[2]")).getText();

		String pass = driver.findElement(By.xpath("//p[4]")).getText();
		String confirmpass = driver.findElement(By.xpath("//p[6]")).getText();

		System.out.println(email);

		WebElement nestedFrame = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
		driver.switchTo().frame(nestedFrame);

		WebElement emailnested = driver.findElement(By.xpath("//div[1][@class='form-group']/iframe"));
		driver.switchTo().frame(emailnested);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.switchTo().parentFrame();

		WebElement passnested = driver.findElement(By.xpath("//div[2][@class='form-group']/iframe"));
		driver.switchTo().frame(passnested);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.switchTo().parentFrame();

		WebElement cnfrmpassnested = driver.findElement(By.xpath("//div[3][@class='form-group']/iframe"));
		driver.switchTo().frame(cnfrmpassnested);
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys(confirmpass);
		driver.switchTo().parentFrame();
		
		WebElement submitNested = driver.findElement(By.xpath("//div[4][@class='form-group']/iframe"));
		driver.switchTo().frame(submitNested);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		Thread.sleep(5000);
		driver.quit();

	}

}
