package com.qa.scenarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularWindow {
	
	
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\workspace-d\\Scenarios\\resources\\Executablefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.google.com");
		
			}

	
	public static void switchToOldWindow(WebDriver driver)
	{
		List<String> arrayCurrentWindowHandles=new ArrayList<String>();
		arrayCurrentWindowHandles.add(driver.getWindowHandle());
		
		Set<String> newWindows = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<>(newWindows);
		//55th window
		if(windowsList.size() > 55) {
			String window_55 = windowsList.get(55);
			driver.switchTo().window(window_55);
		}
		
		
 	}

		    
	  

	}

