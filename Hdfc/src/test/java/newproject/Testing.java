package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {

	public static WebDriver driver;
	
	@BeforeMethod
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\S SOFTWARES\\selenium\\add this\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public static void search()
	{
		driver.findElement(By.name("q")).sendKeys("testing");
	}
	
	@AfterMethod
	public static void teardown()
	{
		driver.close();
	}
}



