package com.Chezuba.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {
	public static ExtentReports extentReports;

	public static ExtentReports getReports() {
		String path = System.getProperty("user.dir")+"./reports//index.html";
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
		extentSparkReporter.config().setReportName("Gmail Automation Report");
		extentSparkReporter.config().setDocumentTitle("Gmail Login");
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		extentReports.setSystemInfo("Tester","Sandeep");
		return extentReports;
	}
}
