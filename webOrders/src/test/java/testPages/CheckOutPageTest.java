package testPages;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CheckOutPage;
import pages.MenuWebPage;
import pages.OrderTypePage;
import utils.ScreenShots;



public class CheckOutPageTest extends BaseClass {
	OrderTypePage ordertype;
	ScreenShots scr;
	MenuWebPage menuweb;
//	OrderTypePageTest ordertypetest;
	CheckOutPage checkoutpage;
	
  public CheckOutPageTest() throws IOException {
		super();
		
	}
  
  
  @BeforeClass(groups = {"checkout"})
  public void initilizeBrowser1() throws IOException {
	 
	  ordertype = new OrderTypePage();
		scr = new ScreenShots();
		menuweb = new MenuWebPage();
	 // ordertypetest = new OrderTypePageTest();
	  checkoutpage = new CheckOutPage();
	 
  }
  
  

@Test(groups = {"checkout"})
  public void verify_clickOnContinueAsGuest() {
	checkoutpage.clickOnContinueAsGuest();
  }


@Test(groups = {"checkout"})
public void verify_enterDetails() {
	checkoutpage.enterDetails(prop.getProperty("Name"), prop.getProperty("Email"), prop.getProperty("Phone"));
	System.out.println("details entered");
}


@Test(groups = {"checkout"})
public void verify_clickOnNext() throws IOException  {
	checkoutpage.clickOnNext();
	
}


@Test(groups= {"checkout"})
public void verify_clickOnAddItem() {
	 checkoutpage.clickOnAddItem();
}


@Test(priority = 5,groups= {"checkout"})
public void verify_POD() {
	 checkoutpage.POD();
}


@Test(groups= {"checkout"})
public void verify_paymentment() {
	 checkoutpage.paymentment();
}

@AfterMethod(groups = {"checkout"})
	public void screenshots_failedtcs(ITestResult result) {
		scr.screenshots_failedtcs(result);
		
	
	}
}

