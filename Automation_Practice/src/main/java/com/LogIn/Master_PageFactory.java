package com.LogIn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Master_PageFactory {
	
	@FindBy(xpath= "//*[contains(@class,'gb_g')]")
	private WebElement gmail;
	
	@FindBy(xpath= "(//*[contains(text(),'Sign in')])[2]")
	private WebElement signin;
	
	@FindBy(xpath= "(//*[contains(@class,'whsOnd zHQkBf')])[1]")
	private WebElement email;
	
	@FindBy(xpath= "//*[contains(@class,'CwaK9')]//*[text()='Next']")
	private WebElement nextbtn;
	
	@FindBy(xpath= "(//*[contains(@class,'whsOnd zHQkBf')])[1]")
	private WebElement password;

	public WebElement getGmail() {
		return gmail;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	
	
	
	
	
	
	
	

}
