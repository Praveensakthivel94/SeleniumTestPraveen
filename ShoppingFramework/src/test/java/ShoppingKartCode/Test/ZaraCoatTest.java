package ShoppingKartCode.Test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ShoppingFramework.TestComponents.BaseTest;
import ShoppingKartCode.PageObjects.CartPage;
import ShoppingKartCode.PageObjects.CheckOutPage;
import ShoppingKartCode.PageObjects.ConfirmationPage;
import ShoppingKartCode.PageObjects.HomePage;
import ShoppingKartCode.PageObjects.LandingPage;
import ShoppingKartCode.PageObjects.PaymentsPage;
import ShoppingKartCode.PageObjects.ProductsCatalogue;

public class ZaraCoatTest extends BaseTest{
	
	@Test
	public void AutomatedTestRun() throws InterruptedException{
		
		// Login in to the screen [LandingPage]
		String url="https://rahulshettyacademy.com/client/";
		String userName="praveensakthi594@gmail.com";
		String password="Apputeja@1";
		String Cartvalidation="No Products in Your Cart !";
        //LandingPage
		LandingPage landingpage=login(url,userName,password);
		
		//cartVerification
		CartPage cartpage=new CartPage(driver);
		boolean cartvalidate=cartpage.cartIconselection(Cartvalidation);
		Assert.assertTrue(cartvalidate);
		
		//Verify login successful message  [ProductCatalogue]
				ProductsCatalogue productCatalogue=new ProductsCatalogue(driver);
				WebElement loginconfirmation=productCatalogue.productValidationVisibility();
				Assert.assertTrue(loginconfirmation.isDisplayed());
				productCatalogue.productValidationInvisibility();
				//Select the product  [Home Page]
				String productName="ZARA COAT 3";
				String expectedproductMessage="Product Added To Cart";
				HomePage homepage=new HomePage(driver);
				homepage.HomePageProduct(productName);
				Assert.assertTrue(expectedproductMessage.equalsIgnoreCase(homepage.productaddedvaldiation()),"Products not added");
				//cartPage
				cartpage.CartPageProduct(productName);
				Assert.assertTrue(cartpage.CartPageProduct(productName));
				//checkout page
				CheckOutPage checkoutpage=new CheckOutPage(driver);
				//paymentPage
				PaymentsPage paymentpage=checkoutpage.CheckOutPageproduct(); //we are catching the payment page objected return from method 
				paymentpage.paymentProductPage();//calling objected 
				//ConfiramtionPage 
				ConfirmationPage confirmationpage=new ConfirmationPage(driver);
				String orderID=confirmationpage.orderIDValidation();
				confirmationpage.downloadExcel();
				
}
}	