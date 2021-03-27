package com.window.handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMultipleWindows {
	
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		driver.findElement(By.linkText("Blogger")).click();
		
		String mainWindowID = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			String childWindowID = itr.next();
			
			if(!mainWindowID.equals(childWindowID)){
				
				driver.switchTo().window(childWindowID);
				
				System.out.println(driver.getTitle());
				
			}
			
		}

	}

}