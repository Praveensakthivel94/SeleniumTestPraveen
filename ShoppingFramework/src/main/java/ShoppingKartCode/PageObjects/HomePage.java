package ShoppingKartCode.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShoppingKartCode.AbstractComponents.AbstractComponents;

public class HomePage extends AbstractComponents {
WebDriver driver;
	public HomePage(WebDriver driver) {  //Constructor will catch the driver object and initialize PageFactory for driver
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".mb-3")
	List<WebElement> homePageproducts;

	By visibilitytoastproductconfirm=By.cssSelector("#toast-container");
	By sortedListSelect=By.cssSelector(".card-body button:last-of-type");
	
	public void HomePageProduct(String productName) {
				WebElement sortedlist=homePageproducts.stream()
			    .filter(product ->product.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName))
			    .findFirst().orElse(null);
				sortedlist.findElement(sortedListSelect).click();	
}
	public String productaddedvaldiation() {
		String productMessage=visibilityofelementlocated(visibilitytoastproductconfirm).getText();	
		return productMessage;
	}
}
