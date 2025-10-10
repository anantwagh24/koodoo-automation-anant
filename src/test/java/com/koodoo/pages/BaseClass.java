package com.koodoo.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.koodoo.utility.BrowserFactory;
import com.koodoo.utility.ConfigReader;
import com.koodoo.utility.ExcelDataProvider;
import com.koodoo.utility.HelperMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigReader config;
	public HelperMethods helper;
	
	@BeforeSuite(alwaysRun = true)
	public void setUpSuite() throws IOException {
		excel = new ExcelDataProvider();
		config = new ConfigReader();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		String browser = config.getBrowser();
        String baseURL = config.getBaseURL();
        driver = BrowserFactory.startApplication(driver, browser, baseURL);
		System.out.println(driver.getTitle());
	}	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	public void click(By locator) {
	    HelperMethods.jsClick(driver, locator);  // for dynamic elements
	}
}

