package com.eposhybrid;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener{

	public void onTestStart(ITestResult result) {
	System.out.println("started"+result);
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestSuccess"+result);
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestFailure"+result);
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestSkipped"+result);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("started"+result);
		
	}

	public void onStart(ITestContext context) {
		System.out.println("startedcontex"+context);
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("finsihedcontext"+context);
	}

}
