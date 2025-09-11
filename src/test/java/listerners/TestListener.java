package listerners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import testBase.BaseTest;
import utility.ExtentManager;
import utility.ScreenshotUtil;

public class TestListener extends BaseTest implements ITestListener {
	
	private static ExtentReports extent = ExtentManager.getInstance();
	
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	@Override

	public void onTestFailure( ITestResult result)

	{
		test.get().log(Status.FAIL, "Test Failed" + result.getThrowable());
		
		
		
		String screenshotpath= ScreenshotUtil.takeScreenshot(driver, result.getName());
		
		try {
			// Use driver from BaseTest (inherited)

			WebDriver driver = ((BaseTest) result.getInstance()).getDriver();

			test.get().addScreenCaptureFromPath(screenshotpath);
			
			
			System.out.println(" Test failed: " + result.getName());

			System.out.println("Screenshot captured: " + screenshotpath);

			// Attach screenshot to TestNG report
			System.setProperty("org.uncommons.reportng.escape-output", "false");

			System.out.println("<a href='" +screenshotpath + "' target='_blank'>Screenshot</a>");

			Reporter.log("<br><a href='" + screenshotpath + "' target='_blank'>" + "<img src='" + screenshotpath + "' height='200' width='300'/></a><br>");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}



	@Override

	public void onTestSkipped(ITestResult result ) {

		try
		{
			WebDriver driver = ((BaseTest) result.getInstance()).getDriver();
			ScreenshotUtil.takeScreenshot(driver, result.getName());
		}
		catch(Exception e){

			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		test.get().log(Status.PASS, "Test Passes");
		// Optional: Capture screenshot for passed tests too

	}

	@Override 
	public void onTestStart(ITestResult result) {

		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
		
		test.set(extentTest);
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush(); // 🔑 very important - writes the report file
	}
}
