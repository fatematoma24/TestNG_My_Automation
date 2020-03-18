package com.LogIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class code_Practice {

	public static void main(String[] args) {

		/*
		 * System.setProperty ("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver (); driver.get("http://www.yahoo.com");
		 * driver.manage().window().maximize();
		 * 
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 * WebDriver driver =new ChromeDriver(); driver.get("http://www.facebook.com");
		 * driver.manage().window().maximize(); driver.quit();
		 */
		
		////Learning Note for Selenium Coding ;

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		//upcasting polymorphism  (Create class for webdriver)
		WebDriver driver = new ChromeDriver();
		
		// Get method
		driver.get("http://www.yahoo.com");
		
		// Navigate method
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// for maximize the screen/webpage
		driver.manage().window().maximize();
		
		//for make fullscreen  webpage/screen
		driver.manage().window().fullscreen();
		
		// for wait to load the page (as selenium doesn't wait 0 second )
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//for wait to pageload in vedio call
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		

		//Click method in selenium
		driver.findElement(By.xpath("fgdsdg")).click();
		//or Create actions class for selenium or Javascript
		

//		signin.click();
//
//		Actions action = new Actions(driver);
//		action.click(signin);
//		action.doubleClick();
//		action.contextClick();
//		action.clickAndHold();
		
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", signin);
		
		
		
		
		//for close the 3rd windows
		driver.close();
		
		//for close and quit from all windows
		driver.quit();

	}
	
	
	
}
