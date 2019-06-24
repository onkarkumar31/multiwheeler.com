package util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import testBase.testBase;
import util.mwUtils;

import com.relevantcodes.extentreports.LogStatus;


public class mwListener extends testBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Test case "+result.getMethod().getMethodName()+ "failed");
		try {
			mwUtils mw = new mwUtils(driver);
			
			//util.mwUtils.mwgetScreenShots(result.getTestName().toUpperCase().toString());
			mwUtils.mwgetScreenShots(result.getMethod().toString());
			test.log(LogStatus.FAIL, "Test case failed due to: "+result.getThrowable());
			test.addScreenCapture(mwUtils.mwgetScreenShots(result.getMethod().toString()+"_extent"));
			rep.endTest(test);
			rep.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		rep.startTest(context.getName().toString());
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
