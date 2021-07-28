package com.app.pages;

import org.openqa.selenium.By;

import com.app.base.AppTestbase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class JKMRESTO extends AppTestbase{

	public AndroidDriver<MobileElement> JKMRESTOMENU()
	{
		driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.ToggleButton[3]")).click();
		return driver;
	}
	
	
	
	
	
	
}
