package com.eposhybrid;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.apache.poi.ss.excelant.ExcelAntTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.AbstractReporter;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



@Listeners(TestNGListners .class)
public class DateSelection {
	
	public static WebDriver driver;
	
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	
	@BeforeSuite
	public static void date()
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		//=====launch==//
		
		driver.get("https://www.eposhybrid.com/trainingandcommissioning");
		Assert.assertTrue(true);
		// start reporters
         htmlReporter = new ExtentSparkReporter("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\com.eposhybrid\\Reports\\fresh1.html");
    
        // create ExtentReports and attach reportekr(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
	}

	@Test
	public static void timeselection() throws InterruptedException, IOException
	{
		
		ExtentTest test = extent.createTest("DateSelection", "Sample ");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
       
        // info(details)
        test.info("This step shows usage of info(details)");
        
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
		
		
		
		
		

	try {
			

	driver.navigate().to("https://www.eposhybrid.com/trainingandcommissioning");
	}
	catch (Exception e)
	{
		System.out.println("exception"+e.getMessage());
	}
	driver.findElement(By.xpath("//div[@onclick=\"selectDate(2)\"]")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//li[@datatime=\"12:00:00\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//li//button[@class=\"eh-confirm-button\" and @val=\"12:00\" ]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
	Thread.sleep(5000);
Select country	= new Select(driver.findElement(By.xpath("//select[@class=\"form-control form-control-new\"]")));
	country.selectByVisibleText("United Kingdom");
	
	driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@name=\"businessName\"]")).sendKeys("Hotels");
	driver.findElement(By.xpath("//textarea[@id=\"comments\"]")).sendKeys("NO Thanks");
	Thread.sleep(5000);
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//div//button[@type=\"submit\"]")).click();
	
	

	//===screenshot==//
	 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile , new File("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\com.eposhybrid\\test-output\\screenshot.png"));
	}
	
	
	
	
	@AfterSuite
	public static void teardown()
	{
	driver.quit();
	 extent.flush();
	}

}
