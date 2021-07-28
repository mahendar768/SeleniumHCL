package com.demo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import com.demo.qa.util.TestUtil;

public class Testbase {
	public static WebDriver driver;
	public static  	Properties prop;
	
	
	public Testbase() 
	{
	try {
		prop = 	new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\maven-demo\\src\\main\\java\\com\\demo"+"\\qa\\config\\config.properties");
		 prop.load(ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}



public void intialization()
{
	
	String browsername  =prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
	
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	   driver = new ChromeDriver();
	
	
	}
	else if (browsername.equals("firefox"))
	{
		System.setProperty("Webdriver.gecko.driver","gekodriver.exe");
		   driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}
}
