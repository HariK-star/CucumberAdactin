package com.adactinpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingIteneryPage {
	
	private static WebDriver driver;

	@FindBy(id ="check_all")
	private WebElement checkall;
	
	@FindBy(xpath ="//input[@class='reg_button']")
	private WebElement cancelbtn;
	
	@FindBy(id ="logout")
	private WebElement logoutbtn;
	
	public BookingIteneryPage(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	public WebElement getCheckall()
	{
		return checkall;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
		
	}
	public WebElement getLogout()
	{
		return logoutbtn;
	}
}
