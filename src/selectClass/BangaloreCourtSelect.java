package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BangaloreCourtSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://services.ecourts.gov.in/ecourtindia_v6/");
		driver.findElement(By.xpath("//img[@alt='Case Status']")).click();
		String transfer = driver.getWindowHandle();
		driver.switchTo().window(transfer);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@id='errorIcon']//../button"))).click();

		WebElement langState = driver.findElement(By.xpath("//div[@id='langState']/select"));
		Select state = new Select(langState);
		List<WebElement> listState = state.getOptions();
		for (WebElement allState : listState) {
			String storeState = allState.getText();
			System.out.println(storeState);
			state.selectByValue("13");
		}
		System.out.println("-------------------------");

		WebElement district = driver.findElement(By.xpath("//div[@id='langState']/../div[2]/select"));
		Select dist = new Select(district);
		List<WebElement> allDist = dist.getOptions();
		for (WebElement loopDist : allDist) {
			String storeDist = loopDist.getText();
			System.out.println(storeDist);
			dist.selectByVisibleText("Kushinagar");
		}

		System.out.println("---------------------");

		WebElement complex = driver.findElement(By.xpath("//div[@id='langState']/../div[3]/select"));
		Select comp = new Select(complex);
		List<WebElement> allcomp = comp.getOptions();
		for (WebElement loopcomp : allcomp) {
			String storecomp = loopcomp.getText();
			System.out.println(storecomp);
			comp.selectByVisibleText("Kasia Court Complex");
		}
		Thread.sleep(2000);

		driver.manage().window().minimize();
		driver.quit();
	}

}
