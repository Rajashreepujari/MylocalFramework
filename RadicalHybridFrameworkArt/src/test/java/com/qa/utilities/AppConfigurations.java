package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfigurations {
	public Properties loadPropertyfile() throws IOException
	{
		File file=new File("AppConfigurations\\AppConfig.properties");
		FileInputStream fileInput=new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(fileInput);
		return properties;
	}
     public String getAppURL() throws IOException
     {
    	 return loadPropertyfile().getProperty("AppUrl");
     }
     public String getbrowser() throws IOException
     {
    	 return loadPropertyfile().getProperty("Browser");
     }
     public String getChromeDriverpath() throws IOException
     {
    	return loadPropertyfile().getProperty("ChromeDriver") ;
     }
     public String getscreenshotpath() throws IOException
     {
    	 return loadPropertyfile().getProperty("screenshotpath");
     }
}
