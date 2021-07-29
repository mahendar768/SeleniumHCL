package com.app.ExtentReportListener;



import org.testng.annotations.Test;




	import java.io.IOException;

	import org.testng.ITestContext;
	import org.testng.ITestResult;
	import org.testng.TestListenerAdapter;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.ExtentColor;
	import com.aventstack.extentreports.markuputils.MarkupHelper;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	//===Name:ITestListeners
	//==Descritption:listen to Testcase and generate report
	//==Author:Sai Lakshmi
	//==Modified date:17-03-2021
	//==Modified By:
	public class Listeners extends TestListenerAdapter {

		


	ExtentSparkReporter htmlreport;
	  ExtentReports extent;
	  ExtentTest testreport;
	  
	  public void onStart(ITestContext testcontext) {
			
			htmlreport = new ExtentSparkReporter("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\app-demo\\ListenersReport");
			extent = new ExtentReports();
			extent.attachReporter(htmlreport);
			

			super.onStart(testcontext);
			System.out.println(("test started"));
		}
	  
		public void onTestSuccess(ITestResult tr) {
		
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
			super.onTestSuccess(tr);
			
		}


		public void onTestFailure(ITestResult tr) {
		
			super.onTestFailure(tr);
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
			 String screenshotPath=System.getProperty(".Screenshots/132"+tr.getName()+".png");
		  try {
			testreport.fail("Screenshot is below:" + testreport.addScreenCaptureFromPath(screenshotPath));
		} catch (Exception e) {
		
			e.printStackTrace();
			e.getMessage();
			System.out.println("getmessage"+e.getMessage());
		} 
			 }



		public void onTestSkipped(ITestResult tr) {
	
			super.onTestSkipped(tr);
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.BLUE));
			System.out.println("test skipped");
		}


		
		
		public void onFinish(ITestContext testContext)
		{
			extent.flush();
			super.onFinish(testContext);
		}

	}


