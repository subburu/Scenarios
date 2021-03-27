package com.window.handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiSelectionBoxField);
	
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Audi");
		
	}

}
