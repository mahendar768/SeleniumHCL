package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.app.base.AppTestbase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SelectAnyRestaurant extends AppTestbase {
	
	
	public  void SelectAnyRestaurantthis()
	{
		PageFactory.initElements(driver, this);
		
	}
	public AndroidDriver<MobileElement> JKMRESTOEdinburgh()
	{
		
	
	
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")).click();
		return driver;
	}
	

}
