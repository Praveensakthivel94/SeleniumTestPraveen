package ShoppingKartCode.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShoppingKartCode.AbstractComponents.AbstractComponents;

public class CheckOutPage extends AbstractComponents {
WebDriver driver;
	public CheckOutPage(WebDriver driver) {  //Constructor will catch the driver object and initialize PageFactory for driver
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//li/button[@class='btn btn-primary']")
	WebElement checkoutproduct;
	
	public PaymentsPage CheckOutPageproduct() {
		 scrolldownoperation();
		elementtobeClickable(checkoutproduct);
		checkoutproduct.click();
		return new PaymentsPage(driver); //creating object for another class 	
}
}
