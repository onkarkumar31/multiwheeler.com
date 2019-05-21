package com.mw.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.HttpClientConnection;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	public void  get(String url) throws ClientProtocolException, IOException{
		
		CloseableHttpClient httpClient=	HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);// http get request
		CloseableHttpResponse closeableHttpResponse= httpClient.execute(httpget); // executes the get request.
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("status code = "+statusCode);
		String responseString=EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		JSONObject responseJson = new JSONObject(responseString); // get Json object 
		System.out.println("Response Json from API= "+responseJson);
		
		Header[] headerArray= closeableHttpResponse.getAllHeaders(); // gets all headers
		
		HashMap allHeaders = new HashMap<String,String>();
		
		for(Header header : headerArray){
			
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println(allHeaders);
		
	}

}
