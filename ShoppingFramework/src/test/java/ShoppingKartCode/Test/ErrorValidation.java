package ShoppingKartCode.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ShoppingFramework.Data.DataProviderFile;
import ShoppingFramework.TestComponents.BaseTest;
import ShoppingKartCode.PageObjects.LandingPage;
import ShoppingFramework.TestComponents.RetryCode;
public class ErrorValidation extends BaseTest{
	
	@Test (dataProvider="getData",retryAnalyzer=RetryCode.class)
	public void AutomatedTestRun(HashMap<String,String> input) throws InterruptedException{	
		// Login screenValidation 
		String url="https://rahulshettyacademy.com/client/";
		LandingPage landingpage=login(url,input.get("userName"),input.get("passWord"));
		landingpage.errorValidation();
	}
	  @Test (dataProvider="getData")
	   public void blankuserVerification(HashMap<String,String> input) {
			String url="https://rahulshettyacademy.com/client/";
			String message="*Enter Valid Email";
			LandingPage landingpage=login(url,input.get("userName"),input.get("passWord"));
			boolean usercheck=landingpage.errorValidationNulluser(message);
			Assert.assertTrue(usercheck);
	   }
	  @DataProvider
	  public Object[][] getData() throws IOException {
		  DataProviderFile dp=new DataProviderFile();
		  List<HashMap<String,String>> objconvert=dp.jsonData(System.getProperty("user.dir")+"\\src\\test\\java\\ShoppingFramework\\Data\\ErrorValidation.json");
		  return new Object[][] {{ objconvert.get(0)},{ objconvert.get(1)}};
	  }	  
	  }
