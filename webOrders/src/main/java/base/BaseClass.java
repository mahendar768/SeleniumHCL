package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.TestUtils;





public class BaseClass{
	public static WebDriver driver;
	public static Properties prop;
	public String userdir;
	public BaseClass() throws IOException {
		try {
			prop = new Properties();
			// userdir=System.getProperty("user.dir");
			
			 FileInputStream ip = new FileInputStream("C:\\Users\\welcome\\eclipse-workspace\\EposHybrid\\webOrders\\src\\main\\java\\Cofig\\configs.properties");
			 prop.load(ip);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public void initlization()  {
		String BrowserName = prop.getProperty("Browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".webOrders/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Opend...");
			System.out.println("new chrome");
			
		}else {
			System.out.println("no browser....");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("URL"));
		
		driver.manage().window().maximize();
		
		
	}
}

