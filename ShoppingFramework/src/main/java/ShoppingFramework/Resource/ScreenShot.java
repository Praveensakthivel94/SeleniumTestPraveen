package ShoppingFramework.Resource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
public static String takesScreenShot(String testCaseName,WebDriver driver) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("screenshot.png");
	FileUtils.copyFile(src, dest);
	return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
}
}
