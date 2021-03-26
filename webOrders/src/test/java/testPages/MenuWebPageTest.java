package testPages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CheckOutPage;
import pages.MenuWebPage;
import pages.OrderTypePage;
import utils.ScreenShots;



public class MenuWebPageTest extends BaseClass {
	OrderTypePage ordertype;
	ScreenShots scr;
	MenuWebPage menuweb;

	OrderTypePageTest ordertypetest;
	CheckOutPage checkoutpage;
  public MenuWebPageTest() throws IOException {
		super();
		
	}
  @BeforeClass(groups = {"Food","Screen"})
  public void initilizeBrowser() throws IOException {
	  
	  ordertype = new OrderTypePage();
		scr = new ScreenShots();
		menuweb = new MenuWebPage();
	  
	  checkoutpage = new CheckOutPage();
	  }
  
  

  
  
  
@Test(priority =1 ,groups = {"Food","Screen"})
  public void Verify_clickOnFoodMenu() throws Exception {
	menuweb.clickOnFoodMenu();

  }

@Test(priority =2,groups = {"Food","Screen"})
public void Verify_clickonFoodCat_ItemMod()
{
	
		
	if(menuweb.clickOnFoodCat_ItemMod().equalsIgnoreCase("Item Mod"))
	    //Pass
	    System.out.println("Item Mod is present ");
	else
	    //Fail
	    System.out.println("Item Mod is not present");
}

@Test(priority =3,groups = {"Food","Screen"})
public void Verify_clickonFoodCat_Items_cat()
{
	
		
	if(menuweb.clickOnFoodCat_Items_cat().equalsIgnoreCase("Items"))
	    //Pass
	    System.out.println("Items  is present ");
	else
	    //Fail
	    System.out.println("Item is not  present");
}

@Test(priority =4,groups = {"Food","Screen"})
public void Verify_clickonFoodCat_ItemsMultiprice_cat()
{
	
		
	if(menuweb.clickOnFoodCat_ItemsMultiprice_cat().equalsIgnoreCase("Items Multiprice"))
	    //Pass
	    System.out.println("Items Multiprice is present ");
	else
	    //Fail
	    System.out.println("Items Multiprice is not  present");
}



@Test(priority =5,groups = {"Food","Screen"})
public void Verify_clickonDrinkMenu() throws Exception
{
	menuweb.clickonDrinkMenu();
}  

@Test(priority =6,groups = {"Food","Screen"})
public void Verify_clickonFoodCat_DrinksItems_cat()
{
	
		
	if(menuweb.clickOnDrinksCat_DrinksItems_cat().equalsIgnoreCase("Items "))
	    //Pass
	    System.out.println("drinkItems is present ");
	else
	    //Fail
	    System.out.println("drinkItems is not present");
}










@Test(priority =7,groups = {"Food","Screen"})
public void Verify_clickonMealsMenu() throws Exception
{
	menuweb.clickonMealsMenu();
}


@Test(priority =8,groups = {"Food","Screen"})
public void Verify_clickonFoodCat_MealDeals_cat()
{
	
		
	if(menuweb.clickOnFoodCat_ItemMod().equalsIgnoreCase("Meal Deals"))
	    //Pass
	    System.out.println("Meal Deals is present");
	else
	    //Fail
	    System.out.println("Meal Deals is not  present");
}


@Test(priority =9,groups = {"Food","Screen"})
public void Verify_clickonFoodCat_MixMatch_cat()
{
	
		
	if(menuweb.clickOnFoodCat_ItemMod().equalsIgnoreCase("Mix Match"))
	    //Pass
	    System.out.println("Mix Match is present ");
	else
	    //Fail
	    System.out.println("Mix Match is not  present");
}









@Test(priority =10,groups = {"Food","Screen"})
public void Verify_clickonPizzaMenu() throws Exception
{
	menuweb.clickonPizzasMenu();
}

@Test(priority =11,groups = {"Food","Screen"})
public void Verify_clickonFoodCat_Pizza_cat() 
{
	
		
	if(menuweb.clickOnPizzaCat_Pizza_cat().equalsIgnoreCase("Pizza"))
	    //Pass
	    System.out.println("Pizza is present ");
	else
	    //Fail
	    System.out.println("Pizza is not present");
}
















@Test(groups = {"Food"})
public void Verify_clickOnItemMod() {
	menuweb.clickOnItemMod();
}


@Test(groups = {"Food"})
public void Verify_selectIDM1() {
	menuweb.selectIDM1();
}
@Test(groups = {"Food"})
public void Verify_clickOnAddCart() {
	menuweb.clickOnAddCart();
}
@Test(groups = {"Food"})
public void Verify_selectIDM2() {
	menuweb.selectIDM2();
}



@Test(groups = {"Food"})
public void verify_clickOnAddCart() {
	menuweb.clickOnAddCart();
}



@Test(groups = {"Food"})
public void verify_CheckOutAmount() throws IOException {
	
	 menuweb.CheckOut();
	
	//Assert.assertEquals(actual, "");
	
}
 


  @AfterClass(groups = {"Food"})
 	public void screenshots_failedtcs(ITestResult result) {
 		scr.screenshots_failedtcs(result);
 		
 	
 	}
}
