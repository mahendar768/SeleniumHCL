package com.TandooriDemoPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TandooriDemoBasePage.TandooriBase;

public class TandooriCheckOutPage extends TandooriBase {

	By Continue = By.xpath("//button[@class=\"guest-in check_login active\"]");
	By Name = By.xpath("//input[@id=\"guest_name\"]");
	By Email = By.xpath("//input[@name=\"guest_email\" and @id=\"guest_email\"]");
	By Mobile = By.xpath("//input[@id=\"guest_phone\"]");
	By Next = By.xpath("(//button[contains(@onclick,'signup();')])[4]");
	By AddIDM1 = By.xpath("(//img[@src='https://www.food-order.net//assets/web_orders_v2/images/inc.svg'])[1]");
	By Due = By.xpath("//span[@id=\"check_text\"]");
	By Cash = By.xpath("//input[@name=\"payment_gateway\"]");
	public TandooriCheckOutPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
		
	}

	public void Guestlogin()
	{
		driver.findElement(Continue).click();
		driver.findElement(Name).sendKeys(prop.getProperty("GuestName"));
		driver.findElement(Email).sendKeys(prop.getProperty("GuestEmail"));
		driver.findElement(Mobile).sendKeys(prop.getProperty("8125513169"));
		driver.findElement(Next).click();
		driver.findElement(AddIDM1).click();
	}
		public void UserAmount()
		{
		String expected = "18";
		String actual = driver.findElement(Due).getText();
		Assert.assertEquals(actual , expected);
		driver.findElement(Due).click();
		
		
		}
	

	
	
	
}
