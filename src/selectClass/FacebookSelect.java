package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement yearDropDown = driver.findElement(By.id("year"));

		Select yearSelect = new Select(yearDropDown);
		List<WebElement> allYearOpts = yearSelect.getOptions();
		for (WebElement yearOpt : allYearOpts) {
			String optText = yearOpt.getText();
			System.out.println(optText);
			yearSelect.selectByVisibleText(optText);
			if (yearOpt.isSelected()) {
				System.out.println("The Options Is Selected" + yearOpt);
			} else
				System.out.println("The option is not selected");
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
