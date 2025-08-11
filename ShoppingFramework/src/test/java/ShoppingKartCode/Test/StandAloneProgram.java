package ShoppingKartCode.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StandAloneProgram {

	public static void main(String[] args) {
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
		
		// Login in to the screen 
		EdgeOptions options=new EdgeOptions();
		WebDriver driver=new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '80%';");
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("praveensakthi594@gmail.com");
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("Apputeja@1");
		driver.findElement(By.cssSelector("#login")).click();
		
		
		//Verify login successful message  [login screen]
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement loginconfirmation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		Assert.assertTrue(loginconfirmation.isDisplayed());
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#toast-container")));
		
		//Select the product  [Home Page]
		String productName="IPHONE 13 PRO";
		List<WebElement> elementsOrder=driver.findElements(By.cssSelector(".mb-3"));
		WebElement sortedlist=elementsOrder.stream()
	    .filter(product ->product.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName))
	    .findFirst().orElse(null);
		sortedlist.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		//Verify product added to the cart message 
		String productMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container"))).getText();
		String expectedproductMessage="Product Added To Cart";
		Assert.assertTrue(expectedproductMessage.equalsIgnoreCase(productMessage),"Products not added");
		
		//Select the cart page verify Product name and price is same [cart Page]
		driver.findElement(By.xpath("//button[@class='btn btn-custom']/i[@class='fa fa-shopping-cart']")).click();
		List<WebElement> sortCartPage=driver.findElements(By.xpath("//div[@class='cart']"));
		boolean sortedName=sortCartPage.stream()
		.map(cartproduct ->cartproduct.findElement(By.xpath(".//h3")).getText())
		.anyMatch(productCart ->productCart.equalsIgnoreCase(productName));
		Assert.assertTrue(sortedName);
		
		//Click Checkout [Checkout]
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/button[@class='btn btn-primary']"))).click();
		
		//Verify the product details and enter mandatory fields and click Place Order [Payment page]
		WebElement address=driver.findElement(By.xpath("//div/label/following-sibling::input[@type='text']"));
		address.clear();
		address.sendKeys("Chennai");
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "India").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[2]")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();
		}
		}
