package com.omayo.utility;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.omayo.base.BasePage;

public class Listeners extends BasePage implements ITestListener {

	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;


	public void onTestStart(ITestResult result) {

		extentTest = extentReport.createTest(result.getName() + " execution started");

	}

	public void onTestSuccess(ITestResult result) {

		extentTest.log(Status.PASS, "Test Passed");

	}

	public void onTestFailure(ITestResult result) {
		extentTest.fail(result.getThrowable());
        WebDriver driver = null;
		
		String testMethodName = result.getName();
		
		try {
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			takeScreenshot(testMethodName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {

	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}


	public void onTestFailedWithTimeout(ITestResult result) {

	}


	public void onStart(ITestContext context) {

	}

	
	public void onFinish(ITestContext context) {

		extentReport.flush();

	}

}