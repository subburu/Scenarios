package com.qa.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(10000);

        // Open new window by clicking the button
         driver.findElement(By.id("windowButton")).click();
         Thread.sleep(10000);

         // Click on the new window element and read the text displayed on the window
         
         WebElement text = driver.findElement(By.id("sampleHeading"));
   
         // Fetching the text using method and printing it     
         System.out.println("Element found using text: " + text.getText());
         driver.quit();
    }
}
