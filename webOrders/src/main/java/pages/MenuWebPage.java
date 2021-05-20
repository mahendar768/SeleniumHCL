package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import utils.TestUtils;



public class  MenuWebPage extends BaseClass {
	By Food_Menu = By.xpath("(//small[contains(.,'Food Menu')])[1]");
	By item_Mod = By.linkText("Item Mod");
	By IDM1_Choose = By.xpath("//*[@id=\"items\"]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/button");
	By Add_Cart_IDM1 = By.xpath("//*[@id=\"addtocart\"]");
	By IDM2_Choose = By.xpath("//*[@id=\"items\"]/div/div[2]/div/div/div[3]/div[2]/div/div[2]/div/button");
	By Add_Cart_IDM2 = By.xpath("//*[@id=\"addtocart\"]");
	By CheckOut = By.xpath("//*[@id=\"checkout_total\"]/h3");
	By Drink_Menu=By.xpath("(//small[contains(.,'Drink Menu')])[1]");
	By Meals_Menu= By.xpath("(//small[contains(.,'Meals Menu')])[1]");
	By Pizzas_Menu= By.xpath("(//small[contains(.,'Pizzas')])[1]");
	By ItemMod_cat =By.xpath("(//small[contains(.,'Item Mod')])[1]");
	By Items_cat =By.xpath("(//small[contains(.,'Items')])[1]");
	By ItemsMultiprice_cat	=By.xpath("(//small[contains(.,'Items')])[1]");	
	By DrinksItems_cat = By.xpath("//small[contains(.,'Items')])[3]");
	By MealDeals_cat = By.xpath("//small[contains(.,'Meal Deals')])[1]");
	By MixMatch_cat = By.xpath("//small[contains(.,'Mix Match')])[1]");
	By Pizza_cat = By.xpath("//small[contains(.,'Pizza')])[2]");
					
	public MenuWebPage() throws IOException {
		//super();
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnFoodMenu() throws Exception {
	
		//driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT_N , TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(Food_Menu).click();
		
		System.out.println("Food Menu clicked..");
	}
	
	
	public void clickOnFoodCat_Items() {
		
		driver.findElement(Items_cat).click();
	}
	public void clickOnFoodCat_ItemsMultiprice() {
		driver.findElement(ItemsMultiprice_cat).click();
	}
	
	public void clickonDrinkMenu() throws Exception
	{
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT_N , TimeUnit.SECONDS);
		
		driver.findElement(Drink_Menu).click();
		System.out.println("Drink menu clicked");
	}
	
	
	public void clickonMealsMenu() throws Exception
	{
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT_N , TimeUnit.SECONDS);
		
	driver.findElement(Meals_Menu).click();
	System.out.println("Meals menu clicked");
	
	}
	
	
	public void clickonPizzasMenu() throws Exception
	{
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT_N , TimeUnit.SECONDS);
		
	driver.findElement(Pizzas_Menu).click();
	System.out.println("Pizzas_Menu clicked");
	
	}
	public String clickOnFoodCat_ItemMod() {
		
		String hyd =driver.findElement(ItemMod_cat).getText();
		System.out.println("hyd"+hyd);
		return hyd ;
	
	}
	public String clickOnFoodCat_Items_cat() {
		
		String hyd =driver.findElement(Items_cat).getText();
		System.out.println("hyd1"+hyd);
		return hyd ;
	
	}
	public String clickOnFoodCat_ItemsMultiprice_cat() {
		
		String hyd =driver.findElement(ItemsMultiprice_cat).getText();
		System.out.println("hyd2"+hyd);
		return hyd ;
	
	}
	public String clickOnDrinksCat_DrinksItems_cat() {
		
		String hyd =driver.findElement(DrinksItems_cat).getText();
		System.out.println("hyd3"+hyd);
		return hyd ;
	
	}
	public String clickOnMealsCat_MealDeals_cat() {
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		String hyd =driver.findElement(MealDeals_cat ).getText();
		System.out.println("hyd4"+hyd);
		return hyd ;
	
	}
	public String clickOnMealsCat_MixMatch_cat()  {
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		String hyd =driver.findElement(MixMatch_cat).getText();
		System.out.println("hyd5"+hyd);
		return hyd ;
	
	}
	public String clickOnPizzaCat_Pizza_cat() {
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		String hyd =driver.findElement(Pizza_cat).getText();
		System.out.println("hyd6"+hyd);
		return hyd ;
	
	}
	
	public void clickOnItemMod() {
		
		driver.findElement(item_Mod).click();
		System.out.println("item Mod clicked...");
	}
	
	
	public void selectIDM1() {
		driver.findElement(IDM1_Choose).click();
		System.out.println("IDM1 item selected...");
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Add_Cart_IDM1));
		System.out.println("Page load1 completed..");
	}
	
	public void selectIDM2() {
		driver.findElement(IDM2_Choose).click();
		System.out.println("IDM1 item selected...");
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		System.out.println("Page load2 completed..");
	}
	public void clickOnAddCart() {
		driver.findElement(Add_Cart_IDM1).click();
		driver.get(driver.getCurrentUrl());
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		System.out.println("Add Cart Clicked...");
	}
	
	
	public CheckOutPage CheckOut() throws IOException {
		
		
		String actual = driver.findElement(CheckOut).getText();
		
		System.out.println(actual);
		String expected = "£9.00";
		Assert.assertEquals(actual, expected);
		driver.findElement(CheckOut).click();
		//return ((WebElement) CheckOut).getText();
		return new CheckOutPage();
	}

}