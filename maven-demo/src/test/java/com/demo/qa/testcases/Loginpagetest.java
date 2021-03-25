package com.demo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.qa.base.Testbase;
import com.demo.qa.pages.Homepage;
import com.demo.qa.pages.Loginpage;

public class Loginpagetest extends Testbase {
Homepage homepage;
	public static Loginpage  logpage;
	public Loginpagetest() {
	super();   
	}
		
	
	@BeforeMethod
	public void setup()
	{
		intialization();
	 logpage =	 new Loginpage();
	
	}
	
	
	@Test(priority=1)
	public void loginTitletest()
	{
	
	String	title =	logpage.validatepagetitle();
	Assert.assertEquals(title, "Epos Hybrid");
	}
	
	@Test(priority=2)
	public  void imagetest()
	{
	boolean flag= logpage.validatesiteImage();
	 Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void logintest()
	{
		homepage = logpage.login(prop.getProperty("email"), prop.getProperty("account"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
