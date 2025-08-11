package ShoppingFramework.Resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporthandler {

	public static ExtentReports extendsReport() {
		String path =System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter er=new ExtentSparkReporter(path);
		er.config().setDocumentTitle("Praveen_Automation");
		er.config().setReportName("Shopping_flow");
		
		ExtentReports ers=new ExtentReports();
		ers.attachReporter(er);
		ers.setSystemInfo("QE", "Praveen");
		return ers;
	}
}
