package com.koodoo.utility;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dir = new File("Screenshots");
            if (!dir.exists()) dir.mkdirs();
            File dest = new File(dir, testName + "_" + timestamp + ".png");
            FileHandler.copy(src, dest);
            System.out.println("📸 Screenshot captured at: " + dest.getAbsolutePath());
            return dest.getAbsolutePath();
        } catch (Exception e) {
            System.out.println("⚠️ Failed to capture screenshot: " + e.getMessage());
            return null;
        }
    }
}
