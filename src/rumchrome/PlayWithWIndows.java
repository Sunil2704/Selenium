package rumchrome;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWIndows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		// capture all the windows id
		driver.getWindowHandles();
		Set<String> allWid = driver.getWindowHandles();
		System.out.println(allWid);
		for (String wid : allWid) {
			String widTitle = driver.switchTo().window(wid).getTitle();
			System.out.println(widTitle);
			if (widTitle.equals("HELLO")) {

			} else if (widTitle.equals("Sign up for Facebook | Facebook")) {
				String signUpPageURl = driver.getCurrentUrl();
				System.out.println("signUpPageUrl " + signUpPageURl);

				// Size
				int signUpHeight = driver.manage().window().getSize().getHeight();
				System.out.println("signUpHeight " + signUpHeight);
				int signUpWidth = driver.manage().window().getSize().getWidth();
				System.out.println("SignUpWidth " + signUpWidth);
				Thread.sleep(2000);

				// position
				int signUpXAxis = driver.manage().window().getPosition().getX();
				System.out.println("SignUp X Axis " + signUpXAxis);
				int signUpYAxis = driver.manage().window().getPosition().getY();
				System.out.println("sign Up Y Axis " + signUpYAxis);
				Thread.sleep(2000);

				Dimension newSize = new Dimension(200, 600);
				driver.manage().window().setSize(newSize);
				Thread.sleep(2000);
				Point newPosition = new Point(200, 300);
				Thread.sleep(3000);

				driver.manage().window().setPosition(newPosition);
				driver.quit();

			}
		}

	}

}
