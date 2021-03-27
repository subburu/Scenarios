package com.qa.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutSendKeys {
@Test	
public void javascript() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("http://www.tutorialsninja.com/demo/");
	Thread.sleep(5000);
	WebElement username = driver.findElement(By.xpath("//input[@name='search']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].value='iMac'", username);
        Thread.sleep(5000);
        js.executeScript("window.scrollBy", -250);
        
        


	
	
}

}
