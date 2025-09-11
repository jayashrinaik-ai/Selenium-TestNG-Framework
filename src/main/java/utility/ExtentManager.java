package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {

			createInstance(System.getProperty("user.dir") + "/reports/extent-report.html");
		}
		return extent;
	}
	public static ExtentReports createInstance(String filepath) {

		ExtentSparkReporter reporter = new ExtentSparkReporter(filepath);

		reporter.config().setReportName("Automation Test Report");
		reporter.config().setReportName("Test Execution Report");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Project", "NXGN Automation");

		extent.setSystemInfo("Tester", "Jayashri");

		extent.setSystemInfo("Environment", "Dev");
		return extent;
	}


}
