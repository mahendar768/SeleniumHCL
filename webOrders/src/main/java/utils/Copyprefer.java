//package utils;
//
//
//
//
//
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import testlink.api.java.client.TestLinkAPIClient;
//import testlink.api.java.client.TestLinkAPIException;
//import testlink.api.java.client.TestLinkAPIResults;
//
//
//public class Copyprefer {
//
//	
//	public static String testProject="Test Project";
//	public static String build="Build Version 1.0 for Test Project 24/03";
//	public static String testPlan="Test Plan - 24/03";
//	public static String testCase="WebOrders";
//public static String DEVKEY="60002955499d6b685816666a3c57ae06";
//public static String URL="http://35.223.207.87/index.php";
//public static String notes=null;
//public static String result=null;
//
//public static void reportResult(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException{
//TestLinkAPIClient api=new TestLinkAPIClient(DEVKEY, URL);
//api.reportTestCaseResult(testProject, testPlan, testCase, build, notes, result);
//}
//public static void intial()
//{
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh Fin\\eclipse-workspace\\webOrders\\drivers\\chromedriver.exe");
//	//WebDriver driver = new ChromeDriver();
//}
//@Test
//public void Test1()throws Exception
//{
//	Copyprefer .intial();
//	Copyprefer a=new Copyprefer ();
//WebDriver driver=new ChromeDriver();
//WebDriverWait wait=new WebDriverWait(driver, 600);
//String testProject="Test Project";
//String testPlan="Test Plan - 24/03";
//String testCase="WebOrders";
//String build="Build Version 1.0 for Test Project 24/03";
//String notes=null;
//String result=null;
//try{
//driver.manage().window().maximize();
//driver.get("https://www.food-order.net/index.php/web_orders/home/QVlVSkhE?uid=6052eb98d0012&PHPSESSID=8e594a36b7ae9489d730d20012317e9e7bdb565f");
//Thread.sleep(5000);
//driver.findElement(By.xpath("//button[@class=\"two\" and @onclick=\"proceed_order(0);\" ]")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("//button[@onclick=\"addToCart(22,0);\"]")).click();
//}
//catch(Exception e){
//result=TestLinkAPIResults.TEST_FAILED;
//notes="Execution failed";
//}
//
//finally{
//
//a.reportResult(testProject, testPlan, testCase, build, notes, result);
//driver.quit();
//}
//}
//} 
