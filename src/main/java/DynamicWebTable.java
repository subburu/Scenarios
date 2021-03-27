

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	WebDriver driver;
	int columnnumber = 0;

	public void table() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void getHeaderNames() {
		List<WebElement> headerNames = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));

		for (int i = 0; i < headerNames.size(); i++) {

		}

	}

}
