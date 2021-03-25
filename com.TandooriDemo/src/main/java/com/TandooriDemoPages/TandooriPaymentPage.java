package com.TandooriDemoPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TandooriDemoBasePage.TandooriBase;

public class TandooriPaymentPage extends TandooriBase{
	By AddIDM2 = By.xpath("(//img[@src='https://www.food-order.net//assets/web_orders_v2/images/inc.svg'])[1]");
	By Pay = By.xpath("//div[@class=\"pay_money\"]");
	By cash = By.xpath("//input[@name=\"payment_gateway\" and @value=\"poc\"]");
	public TandooriPaymentPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
				
	}
	
	public void payment()
	
	{
		String expected ="14";
		String actual = driver.findElement(Pay).getText();
		Assert.assertEquals(expected, actual);
		driver.findElement(cash).click();
		
		
		
	}
	
	
	
	
	

}
