package com.qatestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Page.SimpledemoForm;
import com.qa.base.BaseClass;
import com.qa.utilities.AppConfigurations;
import com.qa.utilities.TestData;
import com.qa.utilities.TestListener;
@Listeners(TestListener.class)
public class SinpleclassTestCases extends BaseClass {

	//public static WebDriver driver;
	public AppConfigurations config;
	public SimpledemoForm objSimpleformDemopage;

	@BeforeClass
	public void setup() throws IOException {
		driver = initializeDriver();
		//driver=initializeDriver(config.getbrowser());
		objSimpleformDemopage = new SimpledemoForm(driver);
		objSimpleformDemopage.openInputformMenu();
	}

	@Test(priority = 1)
	public void verifyTitleofsimpleform() {
		//AssertJUnit.assertEquals(objSimpleformDemopage.launchSimpleFormDemopage(), "ABC");
		Assert.assertEquals(objSimpleformDemopage.launchSimpleFormDemopage(), TestData.simpleformpageExpectedtitle);
	}

	@Test(priority = 2)

	public void verifyShowMessageFeature() {
		objSimpleformDemopage.enterMessage("Hello");
		objSimpleformDemopage.ClickshowmegButton();
		//AssertJUnit.assertEquals(objSimpleformDemopage.getMessage(), "XYZ");
		Assert.assertEquals(objSimpleformDemopage.getMessage(), TestData.showmessage);;
	}
	
	@AfterClass
	public void tearDown()
	{
		super.closeAllDriver();
	}
	
}
