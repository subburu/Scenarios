package com.qa.snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("inputValEnter")).sendKeys("Mobiles under 10000");
		driver.findElement(By.xpath("//button[contains (@class,'searchformButton')]")).click();
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.visibilityOf())
		 */driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("10000");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn btn-line btn-theme-secondary')]")).click();
		Thread.sleep(10000);
	
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-expand-arrow sort-arrow')]")).click();
		
		driver.findElement(By.xpath("//li[@data-sorttype='phtl']")).click();
		
		String product= driver.findElement(By.xpath("//a[@class='dp-widget-link noUdLine' and @pogid='648043131044']")).getText();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)");


		/*
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""));
		 */
		 System.out.println(product + " "+"displaying the product");
		

	}

}
