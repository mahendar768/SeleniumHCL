package road;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Trail {
	public static WebDriver driver;
	
	
	
	public void actt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\jking\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.redbus.in/");
	}

}
