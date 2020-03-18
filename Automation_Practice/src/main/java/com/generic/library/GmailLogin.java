package com.generic.library;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.LogIn.Master_PageFactory;

public class GmailLogin {

	static WebDriver driver;

	public static WebDriver GmailLogIn() {

		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Master_PageFactory pf = PageFactory.initElements(driver, Master_PageFactory.class);

		driver.manage().window().maximize();

		pf.getGmail().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", pf.getSignin());

		String parentwindow = driver.getWindowHandle();

		Set<String> allwindow = driver.getWindowHandles();

		for (String eachwindow : allwindow) {

			System.out.println(allwindow);

			if (!eachwindow.equals(parentwindow)) {

				driver.switchTo().window(eachwindow);
			}

		}

		pf.getEmail().sendKeys("fb9292222222@gmail.com");

		pf.getNextbtn().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		pf.getPassword().sendKeys("Fatema2019");

		pf.getNextbtn().click();

		return driver;

	}

}
