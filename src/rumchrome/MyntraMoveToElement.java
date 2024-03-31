package rumchrome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMoveToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement men = driver.findElement(By.xpath("//div/a[contains(text(),'Men')]"));
		System.out.println("FirstElement:- " + men.getLocation().getX());
		WebElement women = driver.findElement(By.xpath("//div/a[contains(text(),'Women')]"));
		System.out.println("FirstElement:- " + women.getLocation().getX());
		WebElement kids = driver.findElement(By.xpath("//div/a[contains(text(),'Kids')]"));
		System.out.println("FirstElement:- " + kids.getLocation().getX());
		WebElement HomeLiving = driver.findElement(By.xpath("//div/a[contains(text(),'Home & Living')]"));
		System.out.println("FirstElement:- " + HomeLiving.getLocation().getX());
		WebElement Beauty = driver.findElement(By.xpath("//div/a[contains(text(),'Beauty')]"));
		System.out.println("FirstElement:- " + Beauty.getLocation().getX());
		WebElement Studio = driver.findElement(By.xpath("//div/a[contains(text(),'Studio')]"));
		System.out.println("FirstElement:- " + Studio.getLocation().getX());

		Actions act = new Actions(driver);
//		act.moveToElement(men).pause(1000).moveToElement(women).pause(1000).moveToElement(kids).build().perform();
//		act.moveToElement(men, 0, 0).pause(1000).moveToElement(women, 31, 0).pause(1000).moveToElement(kids, 20, 0)
//				.pause(1000).moveToElement(HomeLiving, 33, 0).pause(1000).moveToElement(Beauty, 14, 0).pause(1000)
//				.moveToElement(Studio, 21, 0).build().perform();
		
		act.moveToElement(men, 0, 0).pause(1000).moveToElement(women, 182, 0).pause(1000).moveToElement(kids, 266, 0)
		.pause(1000).moveToElement(HomeLiving, 331, 0).pause(1000).moveToElement(Beauty, 462, 0).pause(1000)
		.moveToElement(Studio, 545, 0).build().perform();
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
