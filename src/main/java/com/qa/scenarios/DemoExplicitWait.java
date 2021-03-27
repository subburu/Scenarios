package com.qa.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoExplicitWait {

	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		 
		 driver.get("http://www.omayo.blogspot.com");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.className("dropbtn")).click();
		 
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		 
		 element.click();
	    
	}
}
