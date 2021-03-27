

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrame {
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.linkText("Hotels")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("q")).sendKeys("Switched to Default content");
		
	}

}
