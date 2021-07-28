package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import utils.TestUtils;


public class OrderTypePage extends BaseClass{
By collection = By.xpath("//p[contains(.,'Collection50 min approx')]");

By Delivery = By.id("delivery_btn");

By postcode = By.id("postcode");

By radio_yes= By.id("preorder_yes_id");

By radio_no =  By.id("preorder_no_id");

By Browse_Menu = By.xpath("//button[@class=\"one\"]");

By Proceed = By.xpath("//button[@onclick=\"proceed_order(0);\"]");

public OrderTypePage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
	}


public void clickOnCollections() {
	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT_N , TimeUnit.SECONDS);
	 driver.findElement(collection).click();

}


public void clickOnDelivery() {
	driver.findElement(Delivery).click();
	
	
}


public void enterPostCode(String Ps) {
	driver.findElement(postcode).sendKeys(Ps);
}


public boolean selectYes() {
	return driver.findElement(radio_yes).isEnabled();
}


public boolean selectNo() {
	return driver.findElement(radio_no).isEnabled();
}


public void clickOnBrowse() {
	driver.findElement(Browse_Menu).click();
}


public  MenuWebPage  clickOnProceed() throws IOException, Exception {
	
	Thread.sleep(5000);
	driver.findElement(Proceed).click();
	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	return new MenuWebPage();
	
	
}


}