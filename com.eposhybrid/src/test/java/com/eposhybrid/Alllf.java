//package com.eposhybrid;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
//import org.apache.poi.ss.excelant.ExcelAntTest;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReporter;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentAventReporter;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//public class Alllf {
//	
//	public static WebDriver driver;
//	
//	@Test
//	public static void lig()
//	{
//		System.getProperty("WebDriver.Chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//ExtentAventReporter htmlreport	= new ExtentAventReporter("extent.html");
//	ExtentReports  extent	= new ExtentReports();

//	extent.attachReporter(htmlreport);
//	
//	
//ExtentTest test = extent.createTest("lig","sample description");
//		driver.get("https://www.facebook.com/");
//		test.log(Status.INFO,"This step shows the usage of log");
//		
//	}
//
//	
//
//}
//
////start reporters
//htmlReporter = new ExtentHtmlReporter("extent.html");
//
//// create ExtentReports and attach reporter(s)
//extent = new ExtentReports();
//extent.attachReporter(htmlReporter);
//
//
//
//@Test
//public static void timeselection() throws InterruptedException, IOException
//{
//	
//	ExtentTest test = extent.createTest("DateSelection", "Sample description");
//
//    // log(Status, details)
//    test.log(Status.INFO, "This step shows usage of log(status, details)");
//   
//    // info(details)
//    test.info("This step shows usage of info(details)");
//    
//    
//    // log with snapshot
//    test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
//
//    // test with snapshot
//    test.addScreenCaptureFromPath("screenshot.png");
//	
//	
//	
//    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenshotFile , new File("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\com.eposhybrid\\test-output\\screenshot.png"));
//	}
//	
//	
//
//try {
//		
//=======================================//
//	@Test
//	public static void loogin()
//	{
//		System.setProperty("Webdriver.Chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		ExtentSparkReporter htmlreport = new ExtentSparkReporter("extent1.html");
//		 ExtentReports extent =new ExtentReports( );
//		 extent.attachReporter(htmlreport);
//		 
//		 ExtentTest test  = extent.createTest("Desirecapability","Sampledescp");
//		 
//		driver.get("https://www.eposhybrid.uk/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		test.log(Status.PASS, "This show the pass status");
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("support@eposhybrid.com");
//		driver.findElement(By.xpath("//select[@name=\"restaurantcode\"]")).click();
//	Select type  = new 	Select(driver.findElement(By.xpath("//select[@name=\"restaurantcode\"]")));
//	type.selectByVisibleText("Tandoori");
//	
//	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("eposto2021");
//	
//	try {
//	
//		
//		driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();
//		Thread.sleep(5000);
//		
//	}
//	catch(Exception exe)
//	{
//		exe.getCause();
//		exe.getMessage();
//	}
//	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		
//	}
//}
