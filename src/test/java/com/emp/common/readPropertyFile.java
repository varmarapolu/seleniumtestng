package com.emp.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {

	public Properties getProp() throws IOException {
		final String propFile = System.getProperty("user.dir")+"\\src\\test\\resources\\emp.properties";
		FileInputStream fileInput = null;
		fileInput = new FileInputStream(propFile);
		Properties prop = new Properties();
		prop.load(fileInput);
		
		return prop;
		
		
	}
}
