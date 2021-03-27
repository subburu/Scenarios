package com.window.handles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindowsHandle_advanceforloo {

	public static void main(String[] args) {
   WebDriverManager.chromedriver().setup();
  WebDriver  driver =new ChromeDriver();
  String s="";
  System.out.println(s.isEmpty());
  System.out.println(s.isBlank());
   
		
		
	}

}
