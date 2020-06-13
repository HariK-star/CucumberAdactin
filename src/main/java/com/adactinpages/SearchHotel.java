package com.adactinpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	
	private static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement locationfld;
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement numOfRooms;
	
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id = "child_room")
	private WebElement childrenPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement submitBtn;
	
	public SearchHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	

	public WebElement getLocation()
	{
		String locationInput = "Sydney";
		Select locationSelect = new Select(this.locationfld);
		locationSelect.selectByVisibleText(locationInput);
		return locationfld;
	}
	
	public WebElement getHotels()
	{
		String hotelsInput = "Hotel Creek";
		Select hotelsSelect = new Select(this.hotels);
		hotelsSelect.selectByVisibleText(hotelsInput);
		return hotels;
		
	}
	public WebElement getRoomType()
	{
		String roomTypeInput = "Standard";
		Select roomTypeSelect = new Select(this.roomType);
		roomTypeSelect.selectByVisibleText(roomTypeInput);
		return roomType;
	}	
	
	public WebElement getNumberofrooms()
	{
		String numOfRoomsInput = "2";
		Select numOfRoomsSelect = new Select(this.numOfRooms);
		numOfRoomsSelect.selectByValue(numOfRoomsInput);
		return numOfRooms;
	}
	public WebElement getCheckIn()
	{
		
		return checkInDate;
	}
	
	public WebElement getCheckout()
		{
	
		return checkOutDate;
		}
	
		public WebElement getAdultsroom()
		{
		String adultsPerRoomInput = "3";
		Select adultsPerRoomSelect = new Select(this.adultsPerRoom);
		adultsPerRoomSelect.selectByValue(adultsPerRoomInput);
		return adultsPerRoom;
		}
		
		
		public WebElement getChildrenRoom()
		{
		String childrenPerRoomInput = "1";
		Select childrenPerRoomSelect = new Select(this.childrenPerRoom);
		childrenPerRoomSelect.selectByValue(childrenPerRoomInput);
		this.submitBtn.click();
		return childrenPerRoom;
		
		}
		
		public WebElement getSubmit()
		{
			return submitBtn;
		}
}	
	

