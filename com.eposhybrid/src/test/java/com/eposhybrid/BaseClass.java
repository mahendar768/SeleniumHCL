package com.eposhybrid;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

@Test
public class BaseClass {
	
	@SuppressWarnings("rawtypes")
	protected AndroidDriver driver;
	
	@SuppressWarnings("rawtypes")
	public BaseClass(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
