package com.generic.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BFSc_Capital {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bfscapital.com/");
		driver.manage().window().maximize();
		
		
		
		
		//System.err.println();
		
	}

}
