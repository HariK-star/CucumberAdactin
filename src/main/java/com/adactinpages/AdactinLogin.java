package com.adactinpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin {
	
	private static WebDriver driver;
	
	@FindBy(id ="login")
	private WebElement loginbtn;
	
	@FindBy(id ="username")
	private WebElement usernamefld;
	
	@FindBy(id ="password")
	private WebElement passwordfld;
	
	public AdactinLogin(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	public WebElement getUsername()
	{
		return usernamefld;
		
	}
	public WebElement getPassword()
	{
		return passwordfld;
		
	}
public WebElement getLogin()
{
	return loginbtn;
	
}
}