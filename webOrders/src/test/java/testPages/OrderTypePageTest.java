package testPages;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.MenuWebPage;
import pages.OrderTypePage;
import utils.ScreenShots;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;



public class OrderTypePageTest extends BaseClass  {
	OrderTypePage ordertype;
	ScreenShots scr;
	MenuWebPage menuweb;
  public OrderTypePageTest() throws IOException {
		super();
		ordertype = new OrderTypePage();
		scr = new ScreenShots();
		menuweb = new MenuWebPage();
	}
  
  
  @BeforeClass(groups = {"colNoPro"})
  public void beforeClass() {
	  initlization();
	  System.out.println("Browser Opened..");
  }
  
  
@Test(groups = {"colNoPro"})
  public void Verify_clickOnCollections() {
	
	ordertype.clickOnCollections();
	System.out.println("Verify_clickOnCollection executed..");
	
  }
@Test
public void verifty_clickOnDelivery() {
	ordertype.clickOnDelivery();
	ordertype.enterPostCode(prop.getProperty("Postcode"));
}


@Test
public void radioButton_selectNo() {
	 ordertype.selectNo();
	 System.out.println("radioButton_selectNo executed..");
}
@Test
public boolean radioButton_selectYes() {
	return ordertype.selectYes();
}


@Test( groups = {"colNoPro"})
public void verify_Proceed() throws Exception{ 
	
		 ordertype.clickOnProceed();
		 System.out.println("verify_Proceed executed..");
		
	}


@Test
	public void Verify_Browse() {
		ordertype.clickOnBrowse();
		
	}






 
  @AfterMethod
	public void screenshots_failedtcs(ITestResult result) {
		scr.screenshots_failedtcs(result);
	
	}
//  @AfterClass
//  public void afterClass() {
//  }

}
