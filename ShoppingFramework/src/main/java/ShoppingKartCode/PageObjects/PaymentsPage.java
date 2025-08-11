package ShoppingKartCode.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShoppingKartCode.AbstractComponents.AbstractComponents;

public class PaymentsPage extends AbstractComponents {
WebDriver driver;
	public PaymentsPage(WebDriver driver) {  //Constructor will catch the driver object and initialize PageFactory for driver
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='ng-star-inserted'])[2]")
	WebElement selectCountry;

	By countrySelection=By.cssSelector("[placeholder='Select Country']");
	By countrywait=By.cssSelector(".ta-results");
	By confirmationbutton=By.cssSelector(".action__submit");
	
	public void paymentProductPage() {
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(countrySelection), "India").build().perform();
		visibilityofelementlocated(countrywait);
		a.click(selectCountry).build().perform();
		WebElement confirm=elementtobeclickable(confirmationbutton);
		a.click(confirm).build().perform();
}
}
