package com.LogIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GCR_LogIn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open facebook
		driver.get("http://www.facebook.com");
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		// Maximize browser

		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		driver.quit();
		
		

	}

}
