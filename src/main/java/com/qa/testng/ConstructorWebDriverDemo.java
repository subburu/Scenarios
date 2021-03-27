package com.qa.testng;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConstructorWebDriverDemo extends DemoPriority {
	
	//WebDriver driver;
	public void test() {
	WebDriverManager.chromedriver().setup();
	
	}
	
	public ConstructorWebDriverDemo()
	{
		 WebDriver driver2 = this.driver;
	}
}
