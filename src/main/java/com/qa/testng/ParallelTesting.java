package com.qa.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	WebDriver driver = null;
	String url = "http://swisnl.github.io/jQuery-contextMenu/demo.html";

	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Test on Chrome");
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				System.out.println("Test on Firefox");
			}
		} else if (browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			System.out.println("Test on Ie");

		}
	}

	@Test
	public void login() throws InterruptedException {

		driver.get(url);

		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.close();

	}

}
