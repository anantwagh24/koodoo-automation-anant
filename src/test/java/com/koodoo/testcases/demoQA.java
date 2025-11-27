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

public class demoQA extends BaseClass {

	@Test
	public void demoQaApp() throws InterruptedException {

		// Navigate to https://demoqa.com
		driver.get("https://demoqa.com");

		// Click on Elements
		WebElement element = driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][1]"));
		element.click();
		System.out.println("clicked on the element");

		// Get List of Items under Elements
		List<WebElement> elemntList = driver.findElements(By.xpath("//*[@class='element-list collapse show']"));
		System.out.println("size of elements: " + elemntList.size());

		// Select Text Box
		WebElement textbox = driver.findElement(By.xpath("//span[normalize-space()='Text Box']"));
		textbox.click();

		// Enter details and submit the form
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		fname.sendKeys("Anant");

		WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		email.sendKeys("anantwagh24@gmail.com");

		WebElement cAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		cAddress.sendKeys("Amona, Buldhana");

		WebElement pAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		cAddress.sendKeys("Amona, Buldhana");

		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		//submit.click();
		Actions a =new Actions(driver);
		a.moveToElement(submit).click();
		
		WebElement verifyName = driver.findElement(By.xpath("//p[@id='name']"));
		WebElement verifyMail = driver.findElement(By.xpath("//p[@id='email']"));
		WebElement verifyCurrent = driver.findElement(By.xpath("//p[@id='currentAddress']"));
	//	WebElement verifyPerma = driver.findElement(By.xpath("//p[@id='permanentAddress']"));

		String name = verifyName.getText().split(":")[1].trim();
		String emailId = verifyMail.getText().split(":")[1].trim();
		String curAdd = verifyCurrent.getText().split(":")[1].trim();
		//String perAdd = verifyPerma.getText().split(":")[1].trim();

		// Fetch the output generated post submission and verify each field
		Assert.assertEquals(name, "Anant", "name mismatch");
		Assert.assertEquals(emailId, "anantwagh24@gmail.com", "email mismatch");
		Assert.assertEquals(curAdd, "Amona, Buldhana", "current mismatch");
		//Assert.assertEquals(perAdd, "Amona, Buldhana", "permanent mismatch");

		// Click on Alerts, Frames & Windows
		WebElement alertAndFrames = driver.findElement(By.xpath("//div[normalize-space()='Alerts, Frame & Windows']"));

		alertAndFrames.click();

		// Click Frames
		WebElement frames = driver.findElement(By.xpath("//li[normalize-space()='Frames']"));
		frames.click();

		// Get details from both the text box

		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);

		System.out.println("text of iframe 1: " + frame1.getText());

		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		System.out.println("text of iframe 2: " + frame2.getText());

		// Click Alerts
		//
		WebElement alerts = driver.findElement(By.xpath("//li[normalize-space()='Alerts']"));
		alerts.click();

		WebElement alertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alertButton.click();

		// Click on ‘Click me’ next to On button click,
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		
		

	}

}
