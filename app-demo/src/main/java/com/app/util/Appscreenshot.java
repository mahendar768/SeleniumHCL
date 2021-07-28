package com.app.util;


	import java.io.File;
	import java.io.IOException;
	import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;

import com.app.base.AppTestbase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Appscreenshot  extends AppTestbase implements ITestListener{
		public Appscreenshot() throws IOException {
			super(); 
			
			
		}

		ExtentSparkReporter htmlreport;
		  ExtentReports extent;
		  ExtentTest testreport;
		//===Name:screenshots
		//==Descritption:To generate screenshots 
		//==Author:Sai Lakshmi
		//==Modified date:18-03-2021
		//==Modified By:Mahendar p
		public void screenshots_failedtcs(ITestResult result) {
			if(ITestResult.FAILURE==result.getStatus()) {
				try {
					TakesScreenshot ts =(TakesScreenshot)driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File dest = new File("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\app-demo\\Screenshots"+result.getMethod().getMethodName()+".png");
					
						org.openqa.selenium.io.FileHandler.copy(source, dest);
						System.out.println("screenshot taken");
				
					
					}catch (Exception e) {
						// TODO: handle exception
						System.out.println("Exception will taking screenshot: " +e.getMessage());
					}
				}
			}
			
		
		public void onTestStart(ITestResult result) {
			htmlreport = new ExtentSparkReporter("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\app-demo\\ListenersReport");
			extent = new ExtentReports();
			extent.attachReporter(htmlreport);
			
		}
		public void onTestSuccess(ITestResult result) {
			testreport = extent.createTest(result.getName());
			testreport.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
			
		}
		public void onTestFailure(ITestResult result) {
			//log with snapshot
			testreport.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

			//test with snapshot
			testreport.addScreenCaptureFromPath("screenshot.png");
			//===screenshot==//
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshotFile , new File("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\app-demo\\Screenshots\\screenshot1.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



			
		}
		public void onTestSkipped(ITestResult result) {
			testreport = extent.createTest(result.getName());
			testreport.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.BLUE));
			System.out.println("test skipped");
			
		}
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}
		public void onFinish(ITestContext context) {
			extent.flush();
			
		}
		
		}
		




