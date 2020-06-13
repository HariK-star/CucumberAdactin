package com.adactinpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdactinSelect {
	private static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id = "continue")
	private WebElement continuefld;
	
	public AdactinSelect(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	public WebElement getRadioButton()
	{
		
		return radiobtn;
	}
	public WebElement getContinueBtn()
	{
		
		return continuefld;
	}
}
