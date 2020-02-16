package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;
import com.qatestcases.SinpleclassTestCases;

public class TestListener  implements ITestListener{

	AppConfigurations config=new AppConfigurations();
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		TakesScreenshot ts=(TakesScreenshot)SinpleclassTestCases.driver;
		File scrFile=ts.getScreenshotAs(OutputType.FILE);
		try
		{
			File destFile=new File(config.getscreenshotpath()+result.getName().toString().trim()+".png");
			System.out.println();
			Files.copy(scrFile, destFile);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
