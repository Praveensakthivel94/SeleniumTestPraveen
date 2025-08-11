package ShoppingKartCode.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShoppingKartCode.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {
WebDriver driver;
	public LandingPage(WebDriver driver) {  //Constructor will catch the driver object and initialize PageFactory for driver
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#userEmail")
	WebElement userEmail;
	@FindBy(css="#userPassword")
	WebElement password;
	@FindBy(css="#login")
	WebElement loginbutton;
	@FindBy(xpath="//div[text()='*Enter Valid Email']")
	WebElement nulluser;
	
	By errorspinner=By.xpath("//div[contains(@class,' toast-message ng')]");
	
	public void goTo(String url) {
		driver.get(url);
	}
	public void loginPage(String userName,String loginpassword) {
		userEmail.sendKeys(userName);
		password.sendKeys(loginpassword);
		loginbutton.click();
}
	public WebElement errorValidation() {
		return visibilityofelementlocated(errorspinner);
	}
	public boolean errorValidationNulluser(String userValidation) {
		boolean usercheck=nulluser.getText().equalsIgnoreCase(userValidation);
		return usercheck;
	}
}
