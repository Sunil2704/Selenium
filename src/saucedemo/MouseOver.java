package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.linkText("Forgotten password?"));
		Actions act=new Actions(driver);
		act.moveToElement(email).perform();
		Thread.sleep(1000);
		WebElement pass=driver.findElement(By.name("login"));
		act.moveToElement(pass).click().perform();
		
		Thread.sleep(5000);
		driver.quit();

		
	
	
	
	
	
	}
}
