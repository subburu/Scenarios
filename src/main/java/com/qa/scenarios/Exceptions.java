package com.qa.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exceptions {
@Test
	public void Test1() {
	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://tutorialsninja.com/demo/index.php?route=account/login?";
	    driver.get(url);
	    System.out.println("Testing");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.switchTo().window("test");
	    driver.switchTo().frame(0);
	    driver.switchTo().alert();
	    driver.findElement(By.xpath(url)).click();
	    driver.findElement(By.xpath("///input[@type='submit']")).click();
	    
	    
	    
  
		
	}

}
