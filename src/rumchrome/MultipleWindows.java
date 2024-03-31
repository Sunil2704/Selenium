  package rumchrome;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String currWinhandle1 = driver.getWindowHandle(); // assign url in currWinhandle1 variable

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/login/identify/");
		String currWinhandle2 = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.twitter.com/");
		String currWinhandle3 = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		String currWinhandle4 = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://enquiry.indianrail.gov.in/mntes/");
//		String currWinhandle5=driver.getWindowHandle();
		Thread.sleep(2000);

		// Control transfer to win 1
		driver.switchTo().window(currWinhandle1); // win1 will be selected and further task will be performed on it
		String realUrl=driver.getCurrentUrl(); // get the url of the selected window
		driver.manage().window().maximize();
		String expectedurl="https://www.facebook.com/";
		if(realUrl.equals(expectedurl)) {
			System.out.println("Pass: Url Matched");
		}
		else 
		{
			System.out.println("Fail: Url Not Matched");
		}
		Thread.sleep(2000);

		// control transfer to win 2
		driver.switchTo().window(currWinhandle2);
		String realTitle=driver.getTitle(); // get the title of the selected window
		String expectedTitle="Forgotten Password | Can't Log In | Facebook";
		if(realTitle.equals(expectedTitle))
		{
			System.out.println("PAss: Title matched");
		}
		else
		{
			System.out.println("Fail: Title not Matched");
		}
		Thread.sleep(2000);

		// control transfer to win 3
		driver.switchTo().window(currWinhandle3);
		Thread.sleep(2000);
		Dimension hello = new Dimension(200, 600);
		driver.manage().window().setSize(hello); // re-size the selected window
		Thread.sleep(2000);

		// control transfer to win 4
		driver.switchTo().window(currWinhandle4).close();

		driver.quit();
	}

}
