package com.mw.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mw.base.TestBase;
import com.mw.client.RestClient;

public class getTest extends TestBase {
	TestBase testBase;
	String apiurl;
	String surl;
	String url;
  @BeforeTest
  public void setUp() throws ClientProtocolException, IOException {
	  
	  apiurl = prop.getProperty("url");
	  surl= prop.getProperty("surl");
	  url=apiurl+surl;
	  testBase = new TestBase();
	  
  }
  
  @Test
  public void getApiTest() throws ClientProtocolException, IOException{
	  RestClient rc = new RestClient();
	  rc.get(url);
	  
  }
  
}
