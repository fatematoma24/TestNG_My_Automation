package com.gmailAccounts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.LogIn.Master_PageFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Gmail_with_TestNG_For_Report {
	WebDriver driver;
	Master_PageFactory pf;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeClass
	public void setupExtentsReport() {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "./target/ExtentsReport.html");// specify location of the report
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.setSystemInfo("Testing Environment", "QA");
		extent.attachReporter(htmlReporter);
		
	}
	
	
	@BeforeTest
	public void setup() throws Throwable {
		

		

		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Object_Properties.getObjectProperty("URL"));
		pf = PageFactory.initElements(driver, Master_PageFactory.class);

		
	}

	@Test
	public void gmailLogin() throws Throwable {
		logger = extent.createTest("LoginTest");
		logger.log(Status.PASS, "Driver open and got URL");
		// WebElement gmail = pf.getGmail();
		pf.getGmail().click();
		logger.log(Status.PASS, "Clicked Gmail");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// WebElement signin = pf.getSignin();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", pf.getSignin());
		logger.log(Status.PASS, "Clicked signin and open child window");
		String parentwindow = driver.getWindowHandle();

		Set<String> allwindow = driver.getWindowHandles();

		for (String eachwindow : allwindow) {

			System.out.println(allwindow);

			if (!eachwindow.equals(parentwindow)) {

				driver.switchTo().window(eachwindow);
			}

		}

		// WebElement email = pf.getEmail();
		pf.getEmail().sendKeys(Object_Properties.getObjectProperty("UserName"));
		// WebElement nextBtn = pf.getNextbtn();
		pf.getNextbtn().click();
		logger.log(Status.PASS, "Clicked next button");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// (//*[contains(@type,'password')])[1]
		// WebElement password = pf.getPassword();

		pf.getPassword().sendKeys(Object_Properties.getObjectProperty("Password"));

		boolean statusClick = false;

		for (int i = 0; i < 10; i++) {

			// nextBtn = pf.getNextbtn();
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

	}

	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
	
	
	@AfterClass
	public void getExtendsReport() {
		
		

		extent.flush();
		
	}

}
