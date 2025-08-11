package ShoppingKartCode.Test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ShoppingFramework.TestComponents.BaseTest;
import ShoppingKartCode.PageObjects.CartPage;
import ShoppingKartCode.PageObjects.CheckOutPage;
import ShoppingKartCode.PageObjects.HomePage;
import ShoppingKartCode.PageObjects.LandingPage;
import ShoppingKartCode.PageObjects.PaymentsPage;
import ShoppingKartCode.PageObjects.ProductsCatalogue;

public class IphoneTest extends BaseTest{
	
	@Test
	public void AutomatedTestRun() throws InterruptedException{
		// Login in to the screen 
		//Verify login successful message  [login screen]
		//Select the product  [Home Page]
		//Verify product added to the cart message 
		//Select the cart page verify Product name and price is same [cart Page]
		//Click Checkout [Checkout]
		//Verify the product details and enter mandatory fields and click Place Order [Payment page]
		//Validate on Confirmation page [confirmation Page] 
		//Donwload CSV File 
		//Check the details in the CSV file 
		//go to Orders Page check the details [orders Page] 
		//Click logout and verify the login successful message 
		
		// Login in to the screen [LandingPage]
		String url="https://rahulshettyacademy.com/client/";
		String userName="lead2fly@gmail.com";
		String password="Apputeja@1";
		LandingPage landingpage=login(url,userName,password);
		//Verify login successful message  [ProductCatalogue]
		ProductsCatalogue productCatalogue=new ProductsCatalogue(driver);
		WebElement loginconfirmation=productCatalogue.productValidationVisibility();
		Assert.assertTrue(loginconfirmation.isDisplayed());
		productCatalogue.productValidationInvisibility();
		//Select the product  [Home Page]
		String productName="IPHONE 13 PRO";
		String expectedproductMessage="Product Added To Cart";
		HomePage homepage=new HomePage(driver);
		homepage.HomePageProduct(productName);
		Assert.assertTrue(expectedproductMessage.equalsIgnoreCase(homepage.productaddedvaldiation()),"Products not added");
		//cartPage
		CartPage cartpage=new CartPage(driver);
		cartpage.CartPageProduct(productName);
		Assert.assertTrue(cartpage.CartPageProduct(productName));
		//checkout page
		CheckOutPage checkoutpage=new CheckOutPage(driver);
		//paymentPage
		PaymentsPage paymentpage=checkoutpage.CheckOutPageproduct(); //we are catching the payment page objected return from method 
		paymentpage.paymentProductPage();//calling objected 
		}
		}
