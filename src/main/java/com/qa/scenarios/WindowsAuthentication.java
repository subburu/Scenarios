package com.qa.scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsAuthentication {
	
	//syntax https:// username:password@url
	
	@Test
	public void windowsAuthentiation_usingurl() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	
	}
	@Test
	public void windowsAuthentiation_RobotClass() throws InterruptedException, AWTException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
        
        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);

	
		
	
	}

}
