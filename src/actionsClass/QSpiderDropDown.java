package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QSpiderDropDown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.findElement(By.id("phone")).sendKeys("9563535845");

		WebElement element = driver.findElement(By.id("select2"));
		Select gender = new Select(element);
		gender.selectByVisibleText("Male");

		WebElement elementcountry = driver.findElement(By.id("select3"));
		Select country = new Select(elementcountry);
		country.selectByIndex(7);

		WebElement elementState = driver.findElement(By.id("select5"));
		Select state = new Select(elementState);
		state.selectByValue("Uttar Pradesh");

		WebElement elementCity = driver.findElement(By.xpath("//div[3]//select"));
		Select city = new Select(elementCity);
		city.selectByValue("Kushinagar");

		WebElement submitbutton = driver.findElement(By.xpath("//button[@type='submit']"));
//		Actions act = new Actions(driver);
//		act.scrollToElement(submitbutton);

		submitbutton.click();

		String payment = driver.getWindowHandle();
		driver.switchTo().window(payment);
		driver.findElement(By.xpath("//input[@value='Upi']")).click();
		driver.findElement(By.xpath("//input[@value='home']")).click();
		driver.findElement(By.xpath("//button[.='Continue']")).click();

		String notify = driver.getWindowHandle();
		driver.switchTo().window(notify);

		driver.findElement(By.xpath("//*[.='Message']/input")).click();
		driver.findElement(By.xpath("//*[.='No thanks']/input")).click();
		driver.findElement(By.xpath("//*[.='Regarding the same product']/input")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String lastpage = driver.getWindowHandle();
		driver.switchTo().window(lastpage);

		driver.findElement(By.xpath("//p[contains(text(),'phone number')]/../..//label")).click();
		driver.findElement(By.xpath("//button[.='Place Order']")).click();
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
