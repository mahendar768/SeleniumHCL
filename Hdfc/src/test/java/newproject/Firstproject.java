package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Firstproject {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws InterruptedException {
		// launch the application
		System.setProperty("webdriver.chrome.driver", "F:\\S SOFTWARES\\selenium\\add this\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.ebay.com/");
		// Wait
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	@Test(priority=0)
	public static void searchProduct() {
		driver.manage().window().maximize();
		// Search Product in ebay
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("tv");
		// Select the dropdown
		Select category = new Select(driver.findElement(By.id("gh-cat")));
		category.selectByVisibleText("Baby");
		// Click on Search button
		driver.findElement(By.id("gh-btn")).click();

	}

	@Test(priority=1)
	public static void clickProductLink() {
		// Click on link
		driver.findElement(By.xpath("(//a[@class='s-item__link'])[1]")).click();
	}

	@Test
	public static void doubleclickmasteroii ()
	{
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}