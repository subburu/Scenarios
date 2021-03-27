package com.qa.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
	//	WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		
		options.addArguments("--headless");
		
	//	WebDriver  driver =new ChromeOptions(driver);
		
	//	driver.get("");
		
	//	Thread.sleep(2000);
		
		System.out.println("Headless testing");


	}

}
