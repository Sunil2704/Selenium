package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerService {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
	Thread.sleep(2000);
	
	
//	driver.findElement(By.xpath("//div/a[text()='Customer Service']")).click();
	driver.findElement(By.xpath("//a[text()='Customer Service'][@tabindex=\"0\"]")).click();
	Thread.sleep(2000);
	
}
}
