package ShoppingKartCode.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShoppingKartCode.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents {
	WebDriver driver;

	public CartPage(WebDriver driver) { // Constructor will catch the driver object and initialize PageFactory for
										// driver
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='cart']")
	List<WebElement> sortCartPage;

	By noCartProduct = By.xpath("//h1[text()='No Products in Your Cart !']");
	By sortedListSelect = By.cssSelector(".card-body button:last-of-type");

	public boolean CartPageProduct(String productName) {
		cartIcon();
		boolean sortedName = sortCartPage.stream()
				.map(cartproduct -> cartproduct.findElement(By.xpath(".//h3")).getText())
				.anyMatch(productCart -> productCart.equalsIgnoreCase(productName));
		return sortedName;
	}

	public boolean cartIconselection(String cartverification) {
		cartIcon();
		WebElement noCartProductConfirmation = visibilityofelementlocated(noCartProduct);
		boolean cartcheck = noCartProductConfirmation.getText().equalsIgnoreCase(cartverification);
		homeButton();
		return cartcheck;
	}
}
