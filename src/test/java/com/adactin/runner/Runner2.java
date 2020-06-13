package com.adactin.runner;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import com.adactinpages.AdactinLogin;
import com.adactinpages.AdactinSelect;
import com.adactinpages.Baseclass;
import com.adactinpages.BookHotel;
import com.adactinpages.BookingIteneryPage;
import com.adactinpages.SearchHotel;


public class Runner2 extends Baseclass{

	public static WebDriver driver;
	
	@Test
	public void testAdactin() throws Exception {
		driver = browserLaunch("chrome");
		getUrl("http://adactinhotelapp.com");
		driver();
		
		AdactinLogin al = new AdactinLogin(driver);
		inputValuestoWebelement(al.getUsername(),"hari1993skr");
		inputValuestoWebelement(al.getPassword(), "123456");
		clickonWebElement(al.getLogin());
		
		SearchHotel s = new SearchHotel(driver);
		clickonWebElement(s.getLocation());
		clickonWebElement(s.getHotels());
		clickonWebElement(s.getRoomType());
		clickonWebElement(s.getNumberofrooms());
		inputValuestoWebelement(s.getCheckIn(), "22/05/2020");
		inputValuestoWebelement(s.getCheckout(), "23/05/2020");
		clickonWebElement(s.getAdultsroom());
		clickonWebElement(s.getChildrenRoom());
		clickonWebElement(s.getSubmit());
		
		Thread.sleep(1000);
		
		AdactinSelect as = new AdactinSelect(driver);
		clickonWebElement(as.getRadioButton());
		clickonWebElement(as.getContinueBtn());
		
		Thread.sleep(1000);
		
		BookHotel bh = new BookHotel(driver);
		inputValuestoWebelement(bh.getFirstName(),"hari");
		inputValuestoWebelement(bh.getLastName(),"K");
		inputValuestoWebelement(bh.getAddress(),"Texas,America");
		inputValuestoWebelement(bh.getCreditCardNo(),"9876543211234571");
		selectDropDownOption(bh.getCreditCardType() , "value" , "VISA");
		selectDropDownOption(bh.getCreditCardExpiryMonth() , "value" , "7");
		selectDropDownOption(bh.getCreditCardExpiryYear() , "value" , "2021");
		inputValuestoWebelement(bh.getCvv(), "333");
		clickonWebElement(bh.getBookNowBtn());
		
		Thread.sleep(1000);
		
		clickonWebElement(bh.getItineryBtn());
		
		BookingIteneryPage bi = new BookingIteneryPage(driver);
		clickonWebElement(bi.getCheckall());
		clickonWebElement(bi.getCancelbtn());
		
		Thread.sleep(2000);
		
		ConfirmAlert(bi.getCancelbtn(),"dismiss");
		
		
		
		clickonWebElement(bi.getLogout());
		
	Closeapplication();
		
		
		
	}

}
