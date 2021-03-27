package com.window.handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSwitchWindow {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(5000);
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		String mainWindow = itr.next();
		
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		
		Thread.sleep(5000);
		
		driver.close();
		
		driver.switchTo().window(mainWindow);
		
		Thread.sleep(5000);
		
		driver.close();
	
	}
}