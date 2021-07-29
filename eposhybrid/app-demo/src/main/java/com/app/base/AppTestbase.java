package com.app.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppTestbase {
	public static  	Properties prop;
	public static AndroidDriver<MobileElement> driver  ;
	
	
		//===Name:Desire Capabilities
		//==Descritption:To communicate with device
		//==Author:Mahendar P
		//==Modified date:15-03-2021
		//==Modified By:
	public AppTestbase() 
	{
	try {
		prop = 	new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\app-demo\\src\\main\\java\\com\\app\\config\\appconfig.properties");
		 prop.load(ip);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	//===Name:Desire Capabilities
	//==Descritption:To communicate with device
	//==Author:Mahendar P
	//==Modified date:15-03-2021
	//==Modified By:
	public static  AndroidDriver<MobileElement> DesireCapabilities() throws MalformedURLException {
	
	
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("platformName", prop.getProperty("operatingsystem"));
	dc.setCapability("platformVersion", prop.getProperty("version"));

	dc.setCapability("deviceName", prop.getProperty("devicename1"));
	dc.setCapability("appPackage", prop.getProperty("JkmlappPackage"));
	
	dc.setCapability("appActivity",prop.getProperty("JkmlappActivity"));
	
	driver	=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	return driver;

	}
}
