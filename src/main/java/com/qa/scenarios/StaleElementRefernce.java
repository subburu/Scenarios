package com.qa.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefernce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.pavantestingtools.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Big Data Hadoop')]"));
		link.click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		  try { 
			  link.click();
			  } 
		  catch(StaleElementReferenceException e) 
		  { 
		   link=driver.findElement(By.xpath("//a[contains(text(),'Big Data Hadoop')]"));
		   link.click();
		    
		  }
		  
		 System.out.println("Test  successful");

	}

}
