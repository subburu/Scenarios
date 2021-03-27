package com.qa.scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsDemo {
	
	public static void main(String args[]) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		
		//I will take screenshot here
		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile1, new File(System.getProperty("user.dir")+"\\screenshots\\screenshot1.jpg"));
		
		driver.findElement(By.linkText("compendiumdev")).click();
		
		//I will take screenshot here
		File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile2, new File(System.getProperty("user.dir")+"\\screenshots\\screenshot2.jpg"));
		
	}

}

