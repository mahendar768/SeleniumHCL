package com.TandooriDemoBasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TandooriDemoUtils.TandooriTestUtils;





public class TandooriBase{
	public static WebDriver driver;
	public static Properties prop;
	public TandooriBase() throws IOException {
		try {
			prop = new Properties();
			 FileInputStream ip = new FileInputStream("C:\\Users\\Venkatesh Fin\\eclipse-workspace\\com.TandooriDemo\\src\\main\\java\\com\\TandooriDemoConfig\\TandooriConfig.properties");
			 prop.load(ip);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public WebDriver initlization()  {
		String BrowserName = prop.getProperty("Browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh Fin\\eclipse-workspace\\com.TandooriDemo\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Opend...");
			
		}else {
			System.out.println("no browser....");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TandooriTestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("URL"));
		
		driver.manage().window().maximize();
		
		return driver;
	}
}
