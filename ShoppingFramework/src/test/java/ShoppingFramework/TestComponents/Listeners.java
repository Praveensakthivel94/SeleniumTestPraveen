package ShoppingFramework.TestComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ShoppingFramework.Resource.ExtentReporthandler;
import ShoppingFramework.Resource.ScreenShot;


public class Listeners extends BaseTest implements ITestListener{
	WebDriver driver;
	ExtentTest test;
	String filepath;
	ExtentReports report=ExtentReporthandler.extendsReport();
	ThreadLocal<ExtentTest> threadsafe=new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
	    test=report.createTest(result.getMethod().getMethodName());
	    threadsafe.set(test);
	  }
	
	  public  void onTestSuccess(ITestResult result) {
		  test.log(Status.PASS, "test is passed");
	  }
	  public  void onTestFailure(ITestResult result) {
	   threadsafe.get().fail(result.getThrowable());
	   try {
		driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} catch (Exception e) {
		e.printStackTrace();
	} 
	   try {
		 filepath=ScreenShot.takesScreenShot(result.getMethod().getMethodName(),driver);
	} catch (IOException e) {
		e.printStackTrace();
	}
	   threadsafe.get().addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
	  }

	  public  void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	 
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	 
	  public void onFinish(ITestContext context) {
	   report.flush();
	  }
	}

