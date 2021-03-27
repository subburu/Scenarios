package com.qa.scenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleDemo {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String title = driver.getTitle();
		System.out.println(title);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		System.out.println("a1");
		for (String window : windows) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains("Best Training & Certification Courses for Professionals | Edureka")) {
				System.out.println("a2");
					
				driver.findElement(By.xpath("//*[@id='allc_catlist']/li[3]/a")).click();
				driver.manage().window().setPosition(new Point(-2000, 0));
			}
		}
		Thread.sleep(3000);
		Set<String> windows1 = driver.getWindowHandles();
		System.out.println(windows1);
		System.out.println("a3");
		for (String window : windows1) {
			driver.switchTo().window(window);
			System.out.println("a4");
		}
	}
}