package com.qa.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpledemoForm {
	WebDriver driver;
	
	@FindBy(linkText="Input Forms")
	WebElement inputformsmenu;
	
	@FindBy(linkText="Simple Form Demo")
	WebElement simpleformDemomenu;

	@FindBy(id="user-message")
	WebElement checkmessagetextbox;
	
	@FindBy(xpath="//button[text()='Show Message']")
	WebElement checkmessagebutton;
	
	@FindBy(xpath="//span[@id='display']")
	WebElement outputmsg;
	
	public SimpledemoForm(WebDriver driver)
	{
		this.driver=driver;
		//this is initelement method will call all WebElement
		PageFactory.initElements(driver, this);
	}
	
	//page operation
	public void openInputformMenu()
	{
		inputformsmenu.click();
	}
    public String launchSimpleFormDemopage()
    {
    	simpleformDemomenu.click();
    	return driver.getTitle();
    	
    }
    public void enterMessage(String msg)
    {
    	checkmessagetextbox.sendKeys(msg);
    }
    public void ClickshowmegButton()
    {
    	checkmessagebutton.click();
    }
    public String getMessage()
    {
    	return outputmsg.getText();
    }
}
