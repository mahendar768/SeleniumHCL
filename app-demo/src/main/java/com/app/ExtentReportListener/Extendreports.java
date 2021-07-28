package com.app.ExtentReportListener;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.app.base.AppTestbase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 


public class Extendreports extends AppTestbase {
	public static ExtentReports report;
	public static ExtentTest test;
	

	public Extendreports() {
		super();
	}
	//public static HTMLReporter html;
@BeforeTest

		//===Name:ExtentReportGeneration
		//==Descritption:For generating extent reports with screenshots
		//==Author:Mahendar P
		//==Modified date:17-03-2021
		//==Modified By:
	public void ExtentReportGeneration() throws IOException
	{
	System.out.println("driver6=="+driver);
ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtendReports/ExtentTestcase.html");
	
 // Create object of ExtentReports class- This is main class which will create report
ExtentReports extent = new ExtentReports();

 // attach the reporter which we created in Step 1
extent.attachReporter(reporter);

 // call createTest method and pass the name of TestCase- Based on your requirement
ExtentTest logger=extent.createTest("LoginTest");

 // log method will add logs in report and provide the log steps which will come in report
logger.log(Status.INFO, "Login to eposhybrid");

logger.log(Status.PASS, "Title verified");

logger.log(Status.FAIL,"Failed tested");

logger.log(Status.SKIP, "Test skipppped");


logger.log(Status.WARNING, "Test warning");

//log with snapshot
logger.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

//test with snapshot
logger.addScreenCaptureFromPath("screenshot.png");
//===screenshot==//
File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile , new File("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\app-demo\\test-output\\screenshot.png"));








 // Flush method will write the test in report- This is mandatory step  
extent.flush();
	}
	
	@AfterTest
	public void endreport()
	{
		
		System.out.println("after end test");
	}
}


