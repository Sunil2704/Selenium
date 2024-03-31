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

public class BangaloreCourt {

	public static void main(String[] args) {

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
		wait.until(ExpectedConditions.visibilityOf(langState));
		Select state = new Select(langState);
		List<WebElement> listState = state.getOptions();
		for (WebElement allState : listState) {
			String storeState = allState.getText();
			System.out.println(storeState);
			state.selectByVisibleText(storeState);
			if (allState.isSelected()) {
//				System.out.println("The Options Is Selected");

				WebElement district = driver.findElement(By.xpath("//div[@id='langState']/../div[2]/select"));
				Select dist = new Select(district);
				List<WebElement> allDist = dist.getOptions();
				for (WebElement loopDist : allDist) {
					String storeDist = loopDist.getText();
					System.out.println(storeDist);
					dist.selectByVisibleText(storeDist);
					if (loopDist.isSelected()) {
//						System.out.println(storeDist);

						WebElement complex = driver.findElement(By.xpath("//div[@id='langState']/../div[3]/select"));
						Select comp = new Select(complex);
						List<WebElement> allcomp = comp.getOptions();
						for (int i = 0; i <= allcomp.size() - 1; i++) {
							WebElement loopcomp = allcomp.get(i);
							String storecomp = loopcomp.getText();
							System.out.println(storecomp);
							comp.selectByVisibleText(storecomp);
							if (loopcomp.isSelected()) {

								try {
									WebElement esta = driver
											.findElement(By.xpath("//div[@id='langState']/../div[4]/select"));
									if (esta.isDisplayed()) {
										Select estaBlock = new Select(esta);

										List<WebElement> allesta = estaBlock.getOptions();
										for (WebElement loopesta : allesta) {
											String storeesta = loopesta.getText();
											System.out.println(storeesta);
											estaBlock.selectByVisibleText(storeesta);

										}
									}
								} finally {
									System.out.println("Not Found");

								}
							}
						}
					}
				}
			}
		}
	}
}
