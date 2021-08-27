package Room.Room;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Laborar {

	public static WebDriver driver;
	@Test
	public void inti()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Room\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();

	}

}
