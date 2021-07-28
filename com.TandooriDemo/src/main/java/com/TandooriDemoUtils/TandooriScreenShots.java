package com.TandooriDemoUtils;



import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.TandooriDemoBasePage.TandooriBase;

public class TandooriScreenShots extends  TandooriBase{

	public TandooriScreenShots() throws IOException {
		super(); 
		// TODO Auto-generated constructor stub
	}
	
	public void screenshots_failedtcs(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot ts =(TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\com.TandooriDemo\\TandooriScreenshots/Screenshot"+result.getName()+".png");
				
					org.openqa.selenium.io.FileHandler.copy(source, dest);
					System.out.println("screenshot taken");
			
				
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("Exception will taking screenshot: " +e.getMessage());
				}
			}
		}
		
	}
	