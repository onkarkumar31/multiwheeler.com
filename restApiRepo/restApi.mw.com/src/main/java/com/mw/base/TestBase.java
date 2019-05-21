package com.mw.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
public  Properties prop;

public TestBase(){
	 try {
		 prop= new Properties();
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/mw/config/config.properties" );
		 prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}


	
}
