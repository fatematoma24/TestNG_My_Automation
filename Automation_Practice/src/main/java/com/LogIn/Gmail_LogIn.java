package com.LogIn;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail_LogIn {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.xpath("//*[contains(@class,'gb_g')]"));
		gmail.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement signin = driver.findElement(By.xpath("(//*[contains(text(),'Sign in')])[2]"));

//		signin.click();
//
//		Actions action = new Actions(driver);
//		action.click(signin);
//		action.doubleClick();
//		action.contextClick();
//		action.clickAndHold();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", signin);

		String parentwindow = driver.getWindowHandle();

		Set<String> allwindow = driver.getWindowHandles();

		for (String eachwindow : allwindow) {

			System.out.println(allwindow);

			if (!eachwindow.equals(parentwindow)) {

				driver.switchTo().window(eachwindow);
			}

		}

		WebElement email = driver.findElement(By.xpath("(//*[contains(@class,'whsOnd zHQkBf')])[1]"));
		email.sendKeys("fb9292222222@gmail.com");
		// email.submit();
		WebElement nextBtn = driver.findElement(By.xpath("//*[contains(@class,'CwaK9')]//*[text()='Next']"));
		nextBtn.click();
		Thread.sleep(5000);
		// (//*[contains(@type,'password')])[1]
		WebElement password = driver.findElement(By.xpath("(//*[contains(@class,'whsOnd zHQkBf')])[1]"));

		password.sendKeys("Fatema2019");
		
		boolean statusClick = false;
		
		for(int i=0;i<10;i++) {
			
			nextBtn = driver.findElement(By.xpath("//*[contains(@class,'CwaK9')]//*[text()='Next']"));
			try {
				
				nextBtn.click();
				System.out.println("CLicked next done by selenium");
				 statusClick =true;
			} catch (Exception e) {
				System.out.println("Selenium Click tried ::"+i);
			}
			
			if(statusClick==true) {
				System.out.println("Loop break");
				break;
			}
			
		}
		

//		 JavascriptExecutor executor = (JavascriptExecutor)driver;
//		 executor.executeScript("arguments[0].click();", nextBtn);

	}

}
