package com.axis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mutiwindowhand {

	public static WebDriver driver;
	
	@BeforeMethod
	public static void setup(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
	}
	
	@Test
	public static void run () throws InterruptedException {
		
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title=\"Check PNR Status\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title=\"Cancel trains tickets\"]")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		int Windowscount = allwindows.size();
		Thread.sleep(2000);
		System.out.println("Windowscount==="+ Windowscount);
		
		Iterator<String> itr = allwindows.iterator();
		String mainwindow= itr.next();
		String cancelwind = itr.next();
		String pnrwindow = itr.next();
		
		//to main window
		
		driver.switchTo().window(mainwindow);
		System.out.println("mainwind"+driver.getTitle());
		
		
		driver.switchTo().window(pnrwindow);
		System.out.println("pnrwind"+driver.getTitle());		
		
		driver.switchTo().window(cancelwind);
		System.out.println("cancelwind"+driver.getTitle());
		
		
		
		driver.switchTo().window(pnrwindow);
		System.out.println("pnrwind"+driver.getTitle());		
		
		driver.findElement(By.xpath("//input[@title=\"PNR number\"]")).sendKeys("5454654646");
		driver.findElement(By.xpath("//input[@id=\"get_status_button\"]")).click();
		String msg = driver.findElement(By.xpath("//div[@class=\"errors  lineMessage ugly icon\"][1]")).getText();
		System.out.println("msg"+msg);
		
		

		driver.switchTo().window(mainwindow);
	}
	@AfterMethod
		
		public static void  tear()
		{
			driver.close();
		}
		

	}


