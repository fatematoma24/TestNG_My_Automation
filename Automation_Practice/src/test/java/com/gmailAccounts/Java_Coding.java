package com.gmailAccounts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Coding {
	
	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();*/
		
		///int a = 10;
		String a = "Have a Nice Day" ;
		
		System.err.println(a);
		
		int s =10;
		int f =20;
		 
		int b = 10;
		int c = 20;
		int d = b+c;
		
		
		System.err.println(s+f);
		
			Java_Coding.salary();	
		System.out.println(Java_Coding.salary());
		
		Java_Coding obj = new Java_Coding ();
		obj.string();
		
		
		
	}
	
	public static String salary () {
		return " I am return type Method ";
		 
		
	}
	
	public void string () {
		
		System.err.println("This is my void Method");
	}
	
	
	
	
	
	

}
