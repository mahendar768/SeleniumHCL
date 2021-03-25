package com.demo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.Testbase;

public class Loginpage extends Testbase {
	  
	//Page Factory 
	@FindBy(xpath = "//input[@placeholder=\"Registered email\"]")
	WebElement registeredemail;
	
	@FindBy(xpath ="//select[@id=\"rest_resp\"]")
	WebElement typeofaccount;
	
	@FindBy(xpath ="//input[@type=\"password\"]" )
	WebElement password;
	
	@FindBy(xpath ="//div[@class=\"logo\"]" )
	WebElement siteimage;
	
	@FindBy(xpath ="//button[@type=\"submit\"]" )
	WebElement login;
	
//Initialize page objects
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	//actions 
public String validatepagetitle()

{
	return driver.getTitle();
}


public boolean validatesiteImage()
{
 return siteimage.isDisplayed();
}

public Homepage login(String regemail,String type,String  pw)
{
	registeredemail.sendKeys(regemail);
	typeofaccount.sendKeys(type);
	password.sendKeys(pw);
	login.click();
	
	return new Homepage();
	
	 
}
{
	      
}





}
