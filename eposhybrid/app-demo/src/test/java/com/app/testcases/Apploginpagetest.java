  
package com.app.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.app.base.AppTestbase;
import com.app.pages.Applogin;
import com.app.pages.CLASSU;
import com.app.pages.Cart;
import com.app.pages.JKMRESTO;
import com.app.pages.SelectAnyRestaurant;

import io.appium.java_client.AppiumDriver;





public class Apploginpagetest extends AppTestbase {
	//Homepage homepage;
	
	public static Applogin  applogin ;
	public static SelectAnyRestaurant select;
	public static JKMRESTO JKMRESTO1;
	public static  CLASSU classuic;
	public static  Cart cart1;
	
	public Apploginpagetest() {
		super();   
	}
		
	
	@BeforeSuite
	public void setup() throws MalformedURLException
	{
		System.out.println("driver1=="+driver);
		DesireCapabilities();
	
	 System.out.println("driver2=="+driver);
	}
	
	@Test(priority=1)
	public void capabityinput() throws MalformedURLException 
	{
		
		System.out.println("driver3=="+driver);
		applogin =	 new Applogin();
		applogin.postcode(prop.getProperty("postcode1"));
		select = new SelectAnyRestaurant();
		select.JKMRESTOEdinburgh();
		JKMRESTO1 = new JKMRESTO();
		JKMRESTO1.JKMRESTOMENU();
		classuic = new CLASSU();
		classuic .selectClassumenu();
		cart1 = new Cart();
		
		System.out.println("driver4=="+driver);
	}
	@Test(priority=2)
	public void input() throws Throwable
	
	{
	Thread.sleep(5000);
 
	}
	
//	
//	@Test(priority=2)
//	public  void imagetest()
//	{
//	boolean flag= logpage.validatesiteImage();
//	 Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=3)
//	public void logintest()
//	{
//		homepage = logpage.login(prop.getProperty("email"), prop.getProperty("account"), prop.getProperty("password"));
//	}
	@AfterSuite
	public void teardown()
	{
	
	driver.quit();
	}
	
}