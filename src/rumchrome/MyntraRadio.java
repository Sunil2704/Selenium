package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraRadio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/kurti?rawQuery=kurti");
		
		WebElement radio= driver.findElement(By.xpath("//label[contains(text(),'Men')]/div"));
		radio.click();
		
		Thread.sleep(5000);
		
		
		
		
	}

}
