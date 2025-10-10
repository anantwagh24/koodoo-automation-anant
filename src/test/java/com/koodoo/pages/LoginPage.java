package com.koodoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.koodoo.utility.HelperMethods;

public class LoginPage extends BaseClass {
	
	WebDriver driver;
	HelperMethods helper;
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver;
		
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Log In']") 
	WebElement loginButton;

	@FindBy(xpath="//input[@placeholder='Email']") 
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") 
	WebElement loginSubmitButton;
	

	public void loginToCRM(String usernameApplication, String passwordApplication) {
		loginButton.click();
		username.sendKeys(usernameApplication);
		password.sendKeys(passwordApplication);
		loginSubmitButton.click();
	}

}
