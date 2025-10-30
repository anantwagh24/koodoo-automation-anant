package com.koodoo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.koodoo.pages.BaseClass;
import com.koodoo.pages.LoginPage;
import com.koodoo.pages.NaukriPage;
import com.koodoo.utility.BrowserFactory;
import com.koodoo.utility.ExcelDataProvider;
import com.koodoo.utility.HelperMethods;

public class NaukriTest extends BaseClass{
	
	@Test
	public void naukriApp() {
	
		NaukriPage naukriPage = PageFactory.initElements(driver, NaukriPage.class);
		
		naukriPage.clickOnService();
		
		String parent= driver.getWindowHandle();
		System.out.println("Parent window is: "+parent);
		
		Set<String> acw = driver.getWindowHandles();
		
		int count = acw.size();
		
		System.out.println("Total number of windows are: "+count);
		
		for(String child: acw) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
		//	System.out.println("Child Title is: "+child+" and URL is: "+driver.getCurrentUrl());
			System.out.println("Child title is: "+child+" and url is "+driver.getCurrentUrl());

			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent title is: "+driver.getTitle()+" and url is "+driver.getCurrentUrl());
	
	}

}
