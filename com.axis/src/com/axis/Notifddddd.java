package com.axis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Notifddddd {
	
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Test
	public static void handleWindows() throws InterruptedException {

		// Click on Check PNR Status link
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();

		// Click on Cancel trains tickets link
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Cancel trains tickets']")).click();

		// Create object for Allwindows
		Set<String> allwindows = driver.getWindowHandles();

		// How many windows are present in current Browser
		int windowscount = allwindows.size();
		Thread.sleep(2000);
		System.out.println("WindowsCount:===" + windowscount);

		// Create Object for Iterator
		Iterator<String> itr = allwindows.iterator();

		// with out using loops
		String mainwindow = itr.next();
		String cancelwindow = itr.next();
		String pnrwindow = itr.next();

		// How to switch to one window to Another
		// Main window
		driver.switchTo().window(mainwindow);
		System.out.println("MainWindowTitle:-----" + driver.getTitle());
		Thread.sleep(2000);
		// pnr window
		driver.switchTo().window(pnrwindow);
		System.out.println("PNRWindowTitle:===" + driver.getTitle());
		Thread.sleep(2000);
		// Cancel Window
		driver.switchTo().window(cancelwindow);
		System.out.println("CancelWindowTitle:===" + driver.getTitle());
		Thread.sleep(2000);
		// Switch to PNR window
		driver.switchTo().window(pnrwindow);
		Thread.sleep(2000);
		driver.findElement(By.id("pnr")).sendKeys("9703244274");
		driver.findElement(By.id("get_status_button")).click();
		Thread.sleep(2000);
		// Switch to main window
		driver.switchTo().window(mainwindow);
	}

	@AfterClass

	public static void teardown() {
		// driver.quit();
	}

}
