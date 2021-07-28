package com.eposhybrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class Desirecapability extends ReportsSetup{
	
	
	
	public static AndroidDriver<MobileElement> driver;
	


public static AndroidDriver  dev() throws MalformedURLException, InterruptedException 

{	
	
	AndroidDriver driver = null;
	
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "10");

	dc.setCapability("deviceName", "R52N70EMH9F");
	dc.setCapability("appPackage", "com.eposhybrid.jkmlresto");
	
	dc.setCapability("appActivity","com.eposhybrid.jkmlresto.MainActivity");
	//dc.setCapability("automatorName", "Uiautomator2");
	//com.eposhybrid.jkmlresto/com.eposhybrid.jkmlersto.MainActivity


	driver	=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	Thread.sleep(5000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys("EH14 2JT");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")).click();
	Thread.sleep(5000);
	
	return driver;
	
}

}
//WebDriverWait wait = new WebDriverWait(driver,10);
//WebElement e = wait.ignoring(NoSuchElementException.class.pollingEvery(Duration.ofNanos(1)).unitl(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View"))));
//e.click();
 
//WaitUntilElementIsDisplayed(By.xpath())











//
//@Test
//public static void loginreports() throws MalformedURLException
//
//
//{
//
//htmlReporter = new ExtentSparkReporter("./Reports/login.html");
//
//ExtentReports extent = new ExtentReports();
//extent.attachReporter(htmlReporter);
//}
//public static void start() throws InterruptedException {
//	
//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys("EH14 2JT");
//Thread.sleep(5000);
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]")).click();
//Assert.assertTrue(true);
//
//
//
////test.log(Status.INFO,"This step show the status(status,details");
//
////======select restaurant ===//
//Thread.sleep(5000);
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")).click();
//Thread.sleep(5000);
//Assert.assertTrue(true);
////test.log(Status.INFO,"This step show the status(status,details");
//
////====menu options==//
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();
//Thread.sleep(5000);
////test.log(Status.INFO, "This step shows the details of info(details)");
//
////============items in cart=========//
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.Button")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[6]/android.widget.Button")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("//android.view.View[@content-desc=\"REGISTER NOW !\"]/android.view.View")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")).sendKeys("abc");
//Thread.sleep(5000);
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys("abc@gamil.com");
//Thread.sleep(5000);
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("123457");
//Thread.sleep(5000);
//driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[4]/android.view.View/android.widget.EditText")).sendKeys("12345769");
//Thread.sleep(5000);
//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[7]/android.view.View/android.widget.Button")).click();
//Thread.sleep(5000);





//ExtentTest test = extent.createTest("Desirecapability ", "PaymentProcess");
//test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
//test.addScreenCaptureFromPath("screenshot.png");
//		


		
	


