package saucedemo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MkvCinemas {
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cinevood.mom/");
//		List<WebElement> linkss = driver.findElements(By.tagName("a"));
//		System.out.println("Total links on webpage " + linkss.size());
//		for (WebElement wb : linkss) {
//			System.out.println(wb.getText());
//		}

		driver.findElement(By.partialLinkText("Kaatera")).click();
		Thread.sleep(2000);

		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
//		driver.findElement(By.className("glow-on-hover")).click();
		driver.findElement(By.xpath("//div[@class='thecontent clearfix']//div[3]//div[1]//div[1]//a[1]//button[1]")).click();

//		Robot rb = new Robot();
//		rb.delay(2000);
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.delay(1000);
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_TAB);

		driver.switchTo().activeElement();
//		driver.switchTo().activeElement().findElement(By.partialLinkText("Telegram Download")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'mb-2 dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-900')]")).click();

//		driver.switchTo().window(currentWindowLink);
//		String newWindow=driver.getWindowHandle();
//		driver.switchTo().window(newWindow);
		
//		driver.findElement(By.xpath("//img[text()='Telegram Download']")).click();

//		Thread.sleep(8000);
//		driver.quit();
	}

}
