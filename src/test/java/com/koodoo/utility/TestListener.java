package com.koodoo.utility;

import org.testng.*;
import org.openqa.selenium.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED", ExtentColor.GREEN));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED", ExtentColor.RED));
        test.get().fail(result.getThrowable());

        // Take screenshot
        try {
            Object testInstance = result.getInstance();
            WebDriver driver = ((com.koodoo.pages.BaseClass) testInstance).driver;

            String screenshotPath = takeScreenshot(driver, result.getName());
            test.get().addScreenCaptureFromPath(screenshotPath, "Failure Screenshot");

        } catch (Exception e) {
            test.get().info("⚠️ Failed to capture screenshot: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED", ExtentColor.ORANGE));
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("🚀 Test Execution Started...");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        System.out.println("✅ Test Execution Completed. Report generated.");
    }

    private String takeScreenshot(WebDriver driver, String testName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotDir = System.getProperty("user.dir") + File.separator + "Screenshots";
        new File(screenshotDir).mkdirs();
        String path = screenshotDir + File.separator + testName + "_" + timestamp + ".png";

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            org.openqa.selenium.io.FileHandler.copy(src, new File(path));
        } catch (Exception e) {
            System.out.println("❌ Screenshot capture failed: " + e.getMessage());
        }

        return path;
    }
}
