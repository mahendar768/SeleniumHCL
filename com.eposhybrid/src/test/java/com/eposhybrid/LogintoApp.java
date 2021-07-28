package com.eposhybrid;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LogintoApp extends BaseClass {
	
	@SuppressWarnings("rawtypes")
	public LogintoApp(AndroidDriver driver) {
		super(driver);
	}
	
	


	

	
	public static AndroidDriver<MobileElement> driver;
	
	public static ExtentTest test;
	

	@BeforeSuite
	public static AndroidDriver<MobileElement> intialization() throws IOException, InterruptedException
	{
		Desirecapability.dev();
	
		System.out.println("driver=="+driver);
		return driver;
		

	} 




	


	@Test
public static void start() throws InterruptedException
		{
		//ExtentTest test = extent.createTest("Desirecapability ", "PaymentProcess");	
		//driver.executeDriverScript("client:client.hybridWaitForPageLoad(10000)");
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
//		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        assertEquals("complete", javascriptExecutor.executeScript("return document.readyState"));




		//test.log(Status.INFO,"This step show the status(status,details");

		//======select restaurant ===//
		//Thread.sleep(5000);
		
		
		
		

//	try {
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")).click();
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.getCause();
//		e.getMessage();
//		e.printStackTrace();
//	}
//	Assert.assertTrue(true);
//	test.log(Status.INFO,"This step show the status(status,details");

	
	


		//====menu options==//
	
	
	
	
	
try {
	System.out.println("driver=="+driver);
	Thread.sleep(5000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View[3]/android.view.View")).click();
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.getCause();
	e.getMessage();
	e.printStackTrace();
}
		//test.log(Status.INFO, "This step shows the details of info(details)");

		//============items in cart=========//
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.Button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[6]/android.widget.Button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"REGISTER NOW !\"]/android.view.View")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")).sendKeys("abc");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys("abc@gamil.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText")).sendKeys("123457");
		Thread.sleep(5000);
		driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[4]/android.view.View/android.widget.EditText")).sendKeys("12345769");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[7]/android.view.View/android.widget.Button")).click();
		Thread.sleep(5000);




	}
//	@AfterMethod
//	public static void close()
//	{
//	driver.quit();
//	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

