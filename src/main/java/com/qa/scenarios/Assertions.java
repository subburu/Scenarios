package com.qa.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Assertions {

	public static void main(String[] args) {
		
		SoftAssert soft=new SoftAssert();
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://tutorialsninja.com/demo/index.php?route=account/login?";
	    driver.get(url);
	    
	    
	    driver.manage().window().maximize();
	   
	    

	}

}
