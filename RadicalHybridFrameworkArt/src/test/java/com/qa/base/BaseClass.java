package com.qa.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utilities.AppConfigurations;

public class BaseClass {
	public static WebDriver driver;
	AppConfigurations config=new AppConfigurations();
	//String browser=config.getbrowser();
	public WebDriver initializeDriver() throws IOException
	{
		String browser=config.getbrowser();
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", config.getChromeDriverpath());
			driver=new ChromeDriver ();
			
			driver.get(config.getAppURL());
			driver.manage().window().maximize();
			
		}
	
		return driver;
		
	
	//		driver.quit();
		
	}
	public void closeDriver()
	{
		driver.quit();
	}
	public void  closeAllDriver()
	{
		driver.close();
		
	}
	
	

}
