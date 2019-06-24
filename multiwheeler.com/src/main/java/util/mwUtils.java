package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class mwUtils {
	
	static WebDriver driver;
	
	 mwUtils(WebDriver driver){
		
		mwUtils.driver=driver;
	}
	
	public static String mwgetScreenShots(String testName) throws IOException{
		
		File ss =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenName=System.getProperty("user.dir")+"\\Screenshots\\"+testName+".jpg";
	
		FileUtils.copyFile(ss, new File(screenName));
		return screenName;
		
	}
	
	
}
