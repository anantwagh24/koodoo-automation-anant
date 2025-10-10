package com.koodoo.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private static final int MAX_RETRY = 1;

    @Override
    public boolean retry(ITestResult result) {
        if (count < MAX_RETRY) {
            count++;
            System.out.println("🔁 Retrying: " + result.getName() + " (attempt " + (count + 1) + ")");
            return true;
        }
        return false;
    }
}
