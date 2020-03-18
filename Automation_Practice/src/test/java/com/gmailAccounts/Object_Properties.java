package com.gmailAccounts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Object_Properties {
	
	public static  String getObjectProperty (String configObjet) throws Throwable {
		
		
		
		FileInputStream fs = new FileInputStream("./Config.properties");
		
		Properties pr = new Properties();
		pr.load(fs);
		
		String value=pr.getProperty(configObjet);
		
		return value;
		
	}
	
	
	

}
