package com.koodoo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;
	public  ConfigReader() throws IOException {
		
		File src = new File("./Config/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			prop = new Properties();
			
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("unable to load the config file: "+e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keytoSearch) {
		return prop.getProperty(keytoSearch);
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
	}
	
	public String getBaseURL() {
		return prop.getProperty("qaURL");
	}

}
