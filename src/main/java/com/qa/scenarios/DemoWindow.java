package com.qa.scenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindow {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();

		Thread.sleep(3000);
		childWindow();
		

	}

						
	
	public static void childWindow()
	{
		Set<String> windows = driver.getWindowHandles();
		System.out.println("a1");
		System.out.println(windows);
		System.out.println("a2");
		for (String window : windows) {
			driver.switchTo().window(window);
			if (!windows.contains(window)) {
				System.out.println("a2");
				driver.switchTo().window(window);
				System.out.println("Successfully switched window");
					
		}
		}

	}
}
