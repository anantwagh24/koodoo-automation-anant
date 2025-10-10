package com.koodoo.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperMethods {


	public void handleIframes() {

	}

	public void handleWindows() {

	}
	public void javaScriptExecutor() {
		
	}
	public void handleJsAlerts() {
		
	}
	
	public static void jsClick(WebDriver driver, By locator) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                wait.until(ExpectedConditions.elementToBeClickable(element));

                ((JavascriptExecutor) driver)
                        .executeScript("arguments[0].scrollIntoView({block:'center'});", element);
                ((JavascriptExecutor) driver)
                        .executeScript("arguments[0].click();", element);

                System.out.println("✅ JS click succeeded on: " + locator);
                return;
            } catch (StaleElementReferenceException e) {
                System.out.println("⚠️ Stale element, retrying JS click...");
                attempts++;
            } catch (Exception e) {
                System.out.println("❌ JS click failed on " + locator + " : " + e.getMessage());
                return;
            }
        }
    }
	



}
