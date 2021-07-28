package com.axis;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Intiale {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Launch Application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		
				
		
		// reg
//		driver.findElement(By.xpath("//a[@href=\"/seeker/registration\"][1]")).click();
//		driver.findElement(By.xpath("//input[@placeholder=\"Enter your full name\"]")).sendKeys("reamdkfjd");
//		driver.findElement(By.xpath("//div/input[@placeholder=\"Please enter your email.\"]")).sendKeys("suresh79@gmail.com");
//	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//for browser handles
//	Set<String> handler =driver.getWindowHandles();
//	
//	Iterator<String> it = handler.iterator();
//	
//	String parentWIn = it.next();
//	System.out.println( "parent it" +parentWIn);
//	Thread.sleep(5000);
//	String childid = it.next();
//	System.out.println( "child it" + childid);
//	
//	driver.switchTo().window(childid);
//	
//	System.out.println("child window pop up title" +driver.getTitle());
//	
//	driver.close();
//	
//	driver.switchTo().window(parentWIn);
//	
//	System.out.println("parent window pop up title" +driver.getTitle());
//		
		
		
//		for alerts if avaialble/////
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.dismiss();
		
		
		
		
//		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("adhfka123");
//		driver.findElement(By.xpath("//input[@name=\"Mobile Number\"]")).sendKeys("1111111111");
//		WebDriverWait w = new WebDriverWait(driver, 500);						
//		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='location']")));  	
//		driver.findElement(By.xpath("//input[@name='location']")).sendKeys("Chennai");
//		
//		Select loc = new Select(driver.findElement(By.xpath("//input[@name=\"location\"]")));
//		loc.selectByVisibleText("No result found");
//		Select exp = new Select(driver.findElement(By.xpath("//input[@name='keywords']")));
//		exp.selectByIndex(2);
//		driver.findElement(By.xpath("//span[@class=\"labl-txt color-black\"]")).click();
//		driver.findElement(By.name("keywords")).sendKeys("java");
//		Select pre = new Select(driver.findElement(By.xpath("//div/input[@name=\"industry\"][1]")));
//		pre.selectByIndex(5);
//		pre.selectByIndex(3);
//		Select pre1 = new Select(driver.findElement(By.xpath("//input[@name='keywords']")));
//		pre1.selectByIndex(5);
//		pre1.selectByIndex(3);
//		driver.findElement(By.xpath("//span[@class=\"browse-text\"]")).click();
//		
//		
//		
//
	}

}
