package TestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testBase.testBase;
import util.mwListener;
@Listeners(mwListener.class)
public class BoundToFail  extends testBase{
	
	
  @Test
  public void iWillFail() {
	  
	 Assert.assertTrue(false);
  }
}
