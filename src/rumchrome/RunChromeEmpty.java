package rumchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunChromeEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle = " + actualTitle);
		String expectedTitle = ("Facebook -log in or signup ");
		System.out.println(expectedTitle);
		driver.findElement(By.id("email")).sendKeys("pajapatisunil@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9800217684");
		driver.findElement(By.name("login")).click();

//				if(actualTitle.equals(expectedTitle)) {
//					System.out.println("Pass: The actual title of facbook login page is verified and found correct");
//				}
//				else {
//					System.out.println("Fail:The actual title of facbook lohin page is verified and found incorrect ");
	}

}
