package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class LoginTest {

		
		
	

	public static WebDriver driver;
	public static String DEV_KEY ="60002955499d6b685816666a3c57ae06";
	public static String SERVER_URL="http://35.223.207.87/index.php";
	public static String PROJECT_NAME="sampleproject";
	public static String BUILD_NAME="samplebuild";
	public static String TEST_PlAN_NAME="Test Plan-24/03";
	public static String TEST_CASE_NAME="WebOrders";
	
//	@BeforeTest 
//	public void LoadBrowser()
//	{
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh Fin\\eclipse-workspace\\webOrders\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.food-order.net/index.php/web_orders/home/QVlVSkhE?uid=6052eb98d0012&PHPSESSID=8e594a36b7ae9489d730d20012317e9e7bdb565f");
//		driver.manage().window().maximize();
//	}
	
		@Test(priority=0)
		public static void validlogin() throws Throwable 	 
		{
			String result= "";
			String exception = null;
			
			try {
				result= TestLinkAPIResults.TEST_PASSED;
				updateTestLinkResult("TP-6",null,result);
			
				
			} catch (Exception e) {
				
				result= TestLinkAPIResults.TEST_FAILED;
				exception =e.getMessage();
			}
			
			
			
		
		
		
	}
		private static void updateTestLinkResult(String TestCaseName, String exception, String result) throws Throwable {
			TestLinkAPIClient testlink	= new TestLinkAPIClient(DEV_KEY,SERVER_URL);
			testlink.reportTestCaseResult(PROJECT_NAME,TEST_PlAN_NAME,TEST_CASE_NAME ,BUILD_NAME, exception, result);
			
		
	
}
}
