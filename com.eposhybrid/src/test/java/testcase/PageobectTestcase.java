package testcase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageobectTestcase {

	@SuppressWarnings("rawtypes")
	public static AndroidDriver driver ;
	
	
	
	@SuppressWarnings("rawtypes")
	@Test
	public  static AndroidDriver getAndroidDriver() throws MalformedURLException
	{
		AndroidDriver driver = null;
	
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "10");

	dc.setCapability("deviceName", "R52N70EMH9F");
	dc.setCapability("appPackage", "com.eposhybrid.jkmlresto");
	
	dc.setCapability("appActivity","com.eposhybrid.jkmlresto.MainActivity");
	//dc.setCapability("automatorName", "Uiautomator2");
	//com.eposhybrid.jkmlresto/com.eposhybrid.jkmlersto.MainActivity


	driver	=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	return driver;	
	}
	
}
