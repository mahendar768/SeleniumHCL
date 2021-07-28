
package com.axis;

import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOifffffffffffffff {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver =   new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(5000);
         List<WebElement> radio = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
         
         
         for(int i=0;i<radio.size();i++)
         {
        WebElement local = radio.get(i);
        Thread.sleep(5000);
        String localee = local.getAttribute("value");
        
        System.out.println("values in radio butoon=====>"+ localee);
      
        if(localee.equalsIgnoreCase("-1"))
        {
        	local.click();
        }
       
               }
         Select d = new Select (driver.findElement(By.name("preferred_pronoun")));
         d.selectByValue("2");
         
         
    	 
    	 
  
	
		
		
        // driver.findElement(By.xpath("//label[@class="_58mt" and @for="u_1_3_No" ]")).click();
		
		
	}

}




