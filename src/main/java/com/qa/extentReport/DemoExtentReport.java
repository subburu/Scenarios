package com.qa.extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoExtentReport {
	@Test
	public void testOmayo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com");
		String expectedtext="PracticeAutomationHere";
		String actualtext=driver.findElement(By.id("pah")).getText();
		if(expectedtext.equalsIgnoreCase(actualtext))
		{
			System.out.println("TestPass");
		}
		else 
		{
			System.out.println("Test Fail");
		}
		
	}

}
