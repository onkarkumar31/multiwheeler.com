package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import util.ExtentManager;

public class testBase {
	public static WebDriver driver;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	
	@BeforeTest
	public void setDriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumaro\\Documents\\ChromeDriver\\ChromeDriver.exe");
	  	ChromeOptions option = new ChromeOptions();
	  	option.addArguments("--headless");
	  	WebDriver driver=new ChromeDriver(option);
	  	driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		Reporter.log("===Application started===",true);
	}
	
	@AfterClass
	public void closeApp(){
		driver.quit();
		Reporter.log("===driver closed===",true);
	}




}
