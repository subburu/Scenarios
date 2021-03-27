package com.qa.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoImplicitWait {
	@Test
	public void implicitwait()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("http://omayo.blogspot.com/");
	    //Here it wont wait as the element is available 
	    driver.findElement(By.className("dropbtn")).click();
	  //  Here it will wait for the element 
	    driver.findElement(By.linkText("Facebook")).click();
		
	}

}
