package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testBase.testBase;
import sePageObjects.seIFSimpleFormPage;

public class seIFSimpleFormPageMessageTest extends testBase {
  @Test(description="This will check simple form", priority=-1,dataProvider="testData")
  //@Parameters("Browser")
  public void VerifyShowMessage(String fname,String lname) {
	  
//	  if(browser.equalsIgnoreCase("FF")){
//		  
//		  System.out.println("browser is FF");
//	  }else{
//		  
//		  System.out.println("Browser if not FF");
//	  }
	  
	System.out.println("Run 1 using dataprovider testData value"+fname);  
	  
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	
  	seIFSimpleFormPage sf = new seIFSimpleFormPage(driver);
  	sf.enterMessageAndShow("Onkar");
  }
  
  @DataProvider(name="testData")
  public Object[][] myDatafeed(){
  	  
	  Object[][] myData = new Object[2][2];
	  
	  myData[0][0]="Onkar";
	  myData[0][1]="Kumar";
	  myData[1][0]="Onkar1";
	  myData[1][1]="Kumar1";		  
	  return myData;
  }
  
}


