package newproject;

import java.io.File;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TOdelete {

	public static WebDriver driver;
	@Test
	 public void intaial() {
		 
		  
		  
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\com.idibi\\drivers\\chromedriver107.exe");
		  
		  
		  ChromeOptions ch = new ChromeOptions();
		  ch.addArguments("--disable-notifications");
		  driver = new ChromeDriver(ch);
		 driver.get("https://www.leafground.com/radio.xhtml");
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 
//		 Actions ac = new Actions(driver);
//	ac.moveToElement(driver.findElement(By.xpath("//div[@id=\"form:conpnl\"]"))).build().perform();
//	 driver.findElement(By.xpath("//i[@class=\"icon-profile-new-unsigned \"]")).click();
//		WebElement  sour= driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));
//		WebElement   dre = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));
//		ac.dragAndDrop(sour, dre).build().perform();
//		
		//==========
		
//	driver.findElement(By.xpath("//span[@class=\"ui-button-text ui-c\"]")).click();
//	driver.switchTo().alert().accept();
		 
//	driver.findElement(By.xpath("//div/button[@name=\"j_idt88:j_idt91\"]")).click();
//	Set<String> st = driver.getWindowHandles();
// Iterator<String> itr  = st.iterator();
// String main = itr.next();
// String sub = itr.next();
// String home = itr.next();
// 
// System.out.println(main);
// System.out.println(sub);
// System.out.println(home);
// 
// driver.switchTo().window(sub);
// System.out.println(driver.getTitle());
// 
		 WebElement we =	driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[2]/div/div[2]/span"));
		 
//    Select se = new Select(driver.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]")));
//    se.selectByVisibleText("Playwright");
		 
//		 DesiredCapabilities ds = new  DesiredCapabilities();
//		 ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
		 JavascriptExecutor js =   (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()", we);
		 
	}
	
	
}
