package ShoppingKartCode.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ShoppingKartCode.AbstractComponents.AbstractComponents;

public class ProductsCatalogue extends AbstractComponents {
WebDriver driver;
	public ProductsCatalogue(WebDriver driver) {  //Constructor will catch the driver object and initialize PageFactory for driver
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	By ProductCataloguevaldiation=By.cssSelector("#toast-container");
	
	public WebElement productValidationVisibility() {
		visibilityofelementlocated(ProductCataloguevaldiation);
		return driver.findElement(ProductCataloguevaldiation);
	}
	public By productValidationInvisibility() {
		invisibilityofelementlocated(ProductCataloguevaldiation);
		return ProductCataloguevaldiation;
}
}
