package ShoppingFramework.TestComponents;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;

import ShoppingKartCode.PageObjects.LandingPage;

public class BaseTest {
public static WebDriver driver;	
@BeforeTest(alwaysRun= true)
public void browserInitialization() throws IOException {
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ShoppingFramework\\Resource\\GlobalProperties.properties");
	prop.load(fis);
	String currentbrowser=prop.getProperty("browser");
	//Checking browser type 
	if (currentbrowser.equalsIgnoreCase("EdgeDriver")) {
	EdgeOptions options=new EdgeOptions();
	driver=new EdgeDriver(options);
	}
	else {	
    driver=new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '80%';");
}
   public LandingPage login(String url,String username,String password) {
	LandingPage landingpage=new LandingPage(driver);
	landingpage.goTo(url);
	 landingpage.loginPage(username,password);
	return landingpage;
}
}
