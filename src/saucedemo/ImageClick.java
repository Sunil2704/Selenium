package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageClick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cinevood.mom/");
		
		driver.findElement(By.xpath("//img[@title='Parking (2023) Hindi + Multi 4 WEB-DL 1080p 720p x264 AVC EAC3 6ch ESub']")).click();
		
		
		if(driver.getTitle().equals("Parking (2023) Hindi + Multi 4 WEB-DL 1080p 720p x264 AVC EAC3 6ch ESub - CineVood.Net"))
		{
			System.out.println("Test Passed");
		}
		else
			System.out.println("Test Failed");
		
		Thread.sleep(2000);
		driver.quit();
 }
}
