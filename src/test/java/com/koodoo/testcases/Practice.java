package com.koodoo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.koodoo.pages.BaseClass;
import com.koodoo.pages.LoginPage;
import com.koodoo.pages.NaukriPage;
import com.koodoo.utility.BrowserFactory;
import com.koodoo.utility.ExcelDataProvider;
import com.koodoo.utility.HelperMethods;

public class Practice extends BaseClass {

	@Test
	public void naukriApp() throws InterruptedException {

		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//
		// Thread.sleep(2000);
		// WebElement username=
		// driver.findElement(By.xpath("//input[@name='username']"));
		// WebElement password=
		// driver.findElement(By.xpath("//input[@name='password']"));
		
		
		// username.click();
		// username.sendKeys("Admin");
		// password.sendKeys("admin123");
		//
		// WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		//
		// System.out.println("Entered the text ABC ");
		// Actions a=new Actions(driver);
		//
		// a.moveToElement(submit).click();
		// //a.moveToElement(googleSearch).keyDown(Keys.ENTER);
		//
		// //googleSearch.click();
		
		// System.out.println("Enter button pressed ");
		// Thread.sleep(3000);

		// driver.get("https://the-internet.herokuapp.com/dropdown");
		//
		// WebElement staticdDropdwon=driver.findElement(By.id("dropdown"));
		//
		// Select dd=new Select(staticdDropdwon);
		//
		// //dd.selectByIndex(0);
		// dd.selectByValue("2");
		// Thread.sleep(3000);
		// dd.selectByValue("1");
		// Thread.sleep(3000);

		// driver.get("https://the-internet.herokuapp.com/tables");
		// //WebElement
		// table1=driver.findElement(By.xpath("https://the-internet.herokuapp.com/tables"));
		// List<WebElement>
		// row=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
		// System.out.println("row size: "+row.size());
		// //System.out.println(row);
		// List<WebElement>
		// column=driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th"));
		// System.out.println("col size: "+column.size());
		// //System.out.println(column);
		//
		
		// for(int i=1;i<row.size();i++) {
		// for(int j=1;j<column.size();j++) {
		// WebElement
		// rowdata=driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+i+"]"));
		// System.out.println("row data is: "+rowdata.getText());
		//
		// WebElement
		// coldata=driver.findElement(By.xpath("//table[@id='table1']//thead/tr/th["+i+"]"));
		// System.out.println("column data is: "+coldata.getText());
		// }
		// }

//		driver.get("https://the-internet.herokuapp.com/checkboxes");
//
//		WebElement checkbox = driver.findElement(By.id("checkboxes"));
//		System.out.println(checkbox.getSize());
//
//		List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
//		System.out.println(checkboxes.size());
//
//		WebElement cb1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
//		System.out.println(cb1.isSelected());
//
//		WebElement cb2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//		System.out.println(cb2.isSelected() && cb2.isEnabled() && cb2.isDisplayed() );	
		
//		driver.get("https://the-internet.herokuapp.com/checkboxes");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.navigate().refresh();
		
//		driver.get("https://the-internet.herokuapp.com/checkboxes");
//		
//		WebDriverWait wdw=new WebDriverWait(driver, Duration.ofSeconds(3));
//		
//		System.out.println(wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Checkboxes']"))).isDisplayed());


		driver.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setAcceptInsecureCerts(true);
		
		System.out.println("all good");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		options.addArguments("--start-maximized");
		options.setAcceptInsecureCerts(true);
		Thread.sleep(3000);
		options.addArguments("--start-maximized");
		options.setAcceptInsecureCerts(true);
		System.out.println("all good");
		Thread.sleep(3000);


		
	
	}

}
