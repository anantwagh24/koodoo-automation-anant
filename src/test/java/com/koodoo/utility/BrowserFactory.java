package com.koodoo.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
    public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {

        if (browserName == null || browserName.isEmpty()) {
            browserName = "chrome"; 
        }

        if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(new FirefoxOptions());
        } 
        else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(new EdgeOptions());
        } 
        else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        } 
        else {
            System.out.println("⚠️ Invalid browser name provided. Launching Chrome as default...");
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
          //  In Selenium’s Java framework, ChromeOptions is a class used to customize and configure the behavior of the Google Chrome browser when running automated tests.
            options.addArguments("--start-maximized");
           // Above line tells Google Chrome to start the browser window maximized when launched by Selenium.
            driver = new ChromeDriver(options);
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(appURL);
        System.out.println("✅ Application started on " + appURL + " using " + browserName);
        return driver;
    }
    
    public static void quitBrowser(WebDriver driver) {
        if (driver != null) {
            try { driver.quit(); 
            System.out.println("✅ Browswer Closed ");

            } catch (Exception ignored) {}
        }
    }

}


