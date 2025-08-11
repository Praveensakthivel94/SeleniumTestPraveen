package ShoppingKartCode.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShoppingKartCode.AbstractComponents.AbstractComponents;

public class ConfirmationPage extends AbstractComponents{
WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
@FindBy(css="button[class*='btn btn-primary']")
WebElement excelDownload;

@FindBy(css="tbody tr:nth-of-type(3) label")
WebElement orderID;

public String orderIDValidation() {
	String orderIDderived=orderID.getText();
	return orderIDderived;
}
public void downloadExcel() {
	excelDownload.click();
}
}
