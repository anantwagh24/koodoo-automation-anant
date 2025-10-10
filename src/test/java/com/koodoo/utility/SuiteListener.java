package com.koodoo.utility;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("🚀 Test Suite Started: " + suite.getName());
        // You could initialize things like DB, reports, or logging here
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("🏁 Test Suite Finished: " + suite.getName());
        // Clean up, close reports, or send notifications
    }
}
