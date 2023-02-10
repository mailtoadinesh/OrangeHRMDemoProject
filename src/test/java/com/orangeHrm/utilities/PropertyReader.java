package com.orangeHrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader 
{
	public String readBrowserName(String propertyName) throws Exception {
		
		File f=new File(System.getProperty("user.dir") + "\\src\\test\\resources\\project.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(propertyName);
	}

}
