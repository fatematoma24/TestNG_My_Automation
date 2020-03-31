package com.gmailAccounts;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LogIn.Master_PageFactory;

public class Gmail_Accounts_PF {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Master_PageFactory pf = PageFactory.initElements(driver, Master_PageFactory.class);

		driver.manage().window().maximize();
		//int a=10;
		//WebElement gmail = pf.getGmail();
		pf.getGmail().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//WebElement signin = pf.getSignin();

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

		//WebElement email = pf.getEmail();
		pf.getEmail().sendKeys("fb9292222222@gmail.com");
		//WebElement nextBtn = pf.getNextbtn();
		pf.getNextbtn().click();
		Thread.sleep(5000);
		// (//*[contains(@type,'password')])[1]
		//WebElement password = pf.getPassword();

		pf.getPassword().sendKeys("Fatema2019");

		boolean statusClick = false;

		for (int i = 0; i < 10; i++) {

			//nextBtn = pf.getNextbtn();
			try {

				pf.getNextbtn().click();
				System.out.println("CLicked next done by selenium");
				statusClick = true;
			} catch (Exception e) {
				System.out.println("Selenium Click tried ::" + i);
			}

			if (statusClick == true) {
				System.out.println("Loop break");
				break;
			}

			
			
		}
		
		

		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.xpath("//*[@class='yW']")).get(0)));
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='yW']"));
		elements.size();
		System.out.println(elements.size());
		
		driver.quit();
	}

}
