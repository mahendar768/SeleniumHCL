package com.eposhybrid;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsSetup {
	 public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent ;
	
@BeforeSuite
public static void reportt()
{
    htmlReporter = new ExtentSparkReporter("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\com.eposhybrid\\Reports\\login.html");
    
    // create ExtentReports and attach reports
     extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
  





}
@AfterSuite
public  static void teardown()
{
	extent.flush();
}
	
	
	
	
}


