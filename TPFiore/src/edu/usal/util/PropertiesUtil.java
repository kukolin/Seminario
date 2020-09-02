package edu.usal.util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
	
	private static Properties properties=CargarProperties();
	
	    private static Properties CargarProperties() {
	    	
	    	properties = new Properties();
	    	
	    	try {
	    		properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("properties.properties"));
	    	    
	    	    
	    	}catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return properties;
	    }
	    
	    
	public static String getDriver() {
		return properties.getProperty("Driver");
	}
	
	public static String getUrl() {
		return properties.getProperty("URL");
	}
	
	public static String getUser() {
		return properties.getProperty("User");
	}
	
	public static String getPassword() {
		return properties.getProperty("Pass");
	}
	

}
