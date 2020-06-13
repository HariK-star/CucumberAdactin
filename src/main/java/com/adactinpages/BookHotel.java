package com.adactinpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	private static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstNameField;
	
	@FindBy(id = "last_name")
	private WebElement lastNameField;
	
	@FindBy(id = "address")
	private WebElement addressField;
	
	@FindBy(id = "cc_num")
	private WebElement creditCardNrField;
	
	@FindBy(id = "cc_type")
	private WebElement creditCardTypeField;
	
	@FindBy(id = "cc_exp_month")
	private WebElement creditCardExpMonthField;
	
	@FindBy(id = "cc_exp_year")
	private WebElement creditCardExpYearField;
	
	@FindBy(id = "cc_cvv")
	private WebElement creditCardCVVField;
	
	@FindBy(id = "book_now")
	private WebElement bookNowButton;
	
	@FindBy(id = "my_itinerary")
	private WebElement itineraryButton;

	public BookHotel(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	public WebElement getFirstName()
	{
		return firstNameField;
	}
	public WebElement getLastName()
	{
		return lastNameField;
	}
	public WebElement getAddress()
	{
		return addressField;
	}
    public WebElement getCreditCardNo()
    {
    	return creditCardNrField;
    }
    
    public WebElement getCreditCardType()
    {
    	return creditCardTypeField;
    	
    }
    public WebElement getCreditCardExpiryMonth()
    {
    	return creditCardExpMonthField;
    }
    public WebElement getCreditCardExpiryYear()
    {
    	return creditCardExpYearField;
    	
    }
    public WebElement getCvv()
    {
    	return creditCardCVVField;
    }
    public WebElement getBookNowBtn()
    {
    	return  bookNowButton;
    }
    public WebElement getItineryBtn()
    {
    	return itineraryButton;
    }
}
