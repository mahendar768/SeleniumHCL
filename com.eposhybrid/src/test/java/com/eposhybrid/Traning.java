package com.eposhybrid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class Traning {
	
	public static WebDriver driver; 
	
	@FindBy(xpath ="//span[@class=\"text-muted halfshow\" ]")
	WebElement  enter2;
	
	@FindBy(xpath="//button[@class=\"eh-time-button\" and @onclick=\"conf(this)\"][1]")
	WebElement enter1;
	
	By enter3 = By.xpath("//span[@class=\"text-muted halfshow\"][1]");
	
	By enter4 = By.xpath("//button[@class=\\\"eh-time-button\\\" and @onclick=\\\"conf(this)\\\"][1]");
	
	public Traning()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	@BeforeSuite
public static void intalize()
{
	

	
	
	System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	

	
	//=====launch==//
	
	driver.get("https://www.eposhybrid.com/trainingandcommissioning");
	Assert.assertTrue(true);
  
	
	
	

	
}
@Test
public void comp()

{
	//driver.findElement(enter).click();
	driver.findElement(enter3);
	//driver.findElement(enter4);
	//enter2.click();
	//enter1.click();
}

@AfterSuite
public void teardown()
{
	driver.close();
}
}
