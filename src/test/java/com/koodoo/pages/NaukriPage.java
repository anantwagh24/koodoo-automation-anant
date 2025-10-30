package com.koodoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.koodoo.utility.HelperMethods;

public class NaukriPage extends BaseClass{
	WebDriver driver;
	HelperMethods helper;
	
	public NaukriPage(WebDriver ldriver) {
		this.driver = ldriver;		
	}

	
	@FindBy(xpath="//div[normalize-space()='Services']")
	private WebElement serviceLink;
	
	
	public void clickOnService() {
		serviceLink.click();
		
	}
}
