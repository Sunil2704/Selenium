package homeWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangerRover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.landrover.in/range-rover/range-rover/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		WebElement vehicle = driver.findElement(By.xpath("//span[.='VEHICLES']"));
		vehicle.click();
		WebElement range1 = driver.findElement(By.xpath("//p[.='RANGE ROVER EVOQUE']"));
		System.out.println("First;- " + range1.getLocation().getY());
		WebElement range2 = driver.findElement(By.xpath("//p[.='NEW RANGE ROVER VELAR']"));
		System.out.println("First;- " + range2.getLocation().getY());
		WebElement range3 = driver.findElement(By.xpath("//p[.='RANGE ROVER SPORT']"));
		System.out.println("First;- " + range3.getLocation().getY());
		WebElement range4 = driver.findElement(By.xpath("//p[.='RANGE ROVER']"));
		System.out.println("First;- " + range4.getLocation().getY());
		WebElement range5 = driver.findElement(By.xpath("//P[.='DEFENDER 130']"));
		System.out.println("First;- " + range5.getLocation().getY());
		WebElement range6 = driver.findElement(By.xpath(" //p[.='DEFENDER 110']"));
		System.out.println("First;- " + range6.getLocation().getY());
		WebElement range9 = driver.findElement(By.xpath(" //p[.='DISCOVERY']"));

		Actions act = new Actions(driver);
		act.moveToElement(range9).perform();

		WebElement range7 = driver.findElement(By.xpath(" //p[.='DEFENDER 90']"));
		System.out.println("First;- " + range7.getLocation().getY());
		WebElement range8 = driver.findElement(By.xpath(" //p[.='DISCOVERY SPORT']"));
		System.out.println("First;- " + range8.getLocation().getY());
		System.out.println("First;- " + range9.getLocation().getY());

		act.moveToElement(range1).pause(1000).moveToElement(range2).pause(1000).moveToElement(range3).pause(1000)
				.moveToElement(range4).pause(1000).moveToElement(range5).pause(1000).moveToElement(range6).pause(1000)
				.moveToElement(range7).pause(1000).moveToElement(range8).pause(1000).moveToElement(range9).build()
				.perform();

//		act.moveToElement(range1, 0, 0).pause(2000).moveToElement(range2, 0, 12).pause(2000)
//				.moveToElement(range3, 0, 12).pause(2000).moveToElement(range4, 0, 12).pause(2000)
//				.moveToElement(range5, 0, 12).pause(2000).moveToElement(range6, 0, 12).pause(2000)
//				.moveToElement(range7, 0, 12).pause(2000).moveToElement(range8, 0, 12).pause(2000)
//				.moveToElement(range9, 0, 12).build().perform();

//		act.moveToLocation(0, 152).pause(2000).moveToLocation(0, 208).pause(2000).moveToLocation(0, 264).pause(2000)
//				.moveToLocation(0, 320).pause(2000).moveToLocation(0, 408).pause(2000).moveToLocation(0, 464)
//				.pause(2000).moveToLocation(0, 520).pause(2000).moveToLocation(0, 608).pause(2000)
//				.moveToLocation(0, 664).build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
