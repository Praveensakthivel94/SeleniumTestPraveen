package ShoppingKartCode.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {

 protected WebDriver driver;
WebDriverWait wait;
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class='btn btn-custom'])[3]")
	WebElement carticon;
	
	@FindBy(xpath="//button[normalize-space()='HOME']")
	WebElement homeButton;
	
	@FindBy(xpath="(//button[@class='btn btn-custom'])[4]")
	WebElement signOut;
	
public WebElement visibilityofelementlocated(By vfindby) {
return wait.until(ExpectedConditions.visibilityOfElementLocated(vfindby));
}
public void invisibilityofelementlocated(By ivfindby) {
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ivfindby));
}
public WebElement elementtobeclickable(By clickby) {
	return wait.until(ExpectedConditions.elementToBeClickable(clickby));
}
public void scrolldownoperation() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");	
}
public void scrollUpoperation() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");	
}
public void cartIcon() {
	 carticon.click();
}
public void homeButton() {
	homeButton.click();
}
public void signOutbutton() {
	signOut.click();
}
public void elementtobeClickable(WebElement clickable) {
	wait.until(ExpectedConditions.elementToBeClickable(clickable));
}
}