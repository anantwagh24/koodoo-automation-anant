package com.koodoo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.koodoo.pages.BaseClass;
import com.koodoo.pages.LoginPage;
import com.koodoo.utility.BrowserFactory;
import com.koodoo.utility.ExcelDataProvider;
import com.koodoo.utility.HelperMethods;

public class LoginTestCRM extends BaseClass{
	
	@Test
	public void loginApp() {
	
				
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://ui.freecrm.com/","❌ The current URL is not as expected!");
		System.out.println(driver.getCurrentUrl());
	}

}
