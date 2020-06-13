package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.CucumberRunner;
import com.adactinpages.AdactinLogin;
import com.adactinpages.AdactinSelect;
import com.adactinpages.Baseclass;
import com.adactinpages.BookHotel;
import com.adactinpages.BookingIteneryPage;
import com.adactinpages.SearchHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Baseclass {
	public static WebDriver driver = CucumberRunner.driver;
	
	//public static WebDriver driver;
	@Given("^user launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		driver = browserLaunch("chrome");
		//ConfigurationReader con = new ConfigurationReader();
		getUrl("http://adactinhotelapp.com");
		//browserLaunch(con.getBrowserName());
		//getUrl(con.getUrl());
		//driver();
	}
	@When("^User enter \"([^\"]*)\" the valid  username$")
	public void user_enter_the_valid_username(String username) throws Throwable {
		AdactinLogin al = new AdactinLogin(driver);
		inputValuestoWebelement(al.getUsername(),username);
	}

	@When("^User enter \"([^\"]*)\" the valid Password$")
	public void user_enter_the_valid_Password(String password) throws Throwable {
		AdactinLogin al = new AdactinLogin(driver);
		inputValuestoWebelement(al.getPassword(), password);
	}


	/*
	 * @When("^User enter the valid username$") public void
	 * user_enter_the_valid_username() throws Throwable {
	 *  AdactinLogin al = new AdactinLogin(driver);
	 * inputValuestoWebelement(al.getUsername(),"hari1993skr"); }
	 * 
	 * @When("^User enter the valid Password$") public void
	 * user_enter_the_valid_Password() throws Throwable { AdactinLogin al = new
	 * AdactinLogin(driver); inputValuestoWebelement(al.getPassword(), "123456"); }
	 */

	@When("^User enter the login Button$")
	public void user_enter_the_login_Button() throws Throwable {
		AdactinLogin al = new AdactinLogin(driver);
		clickonWebElement(al.getLogin());
		
	}

	@Then("^It lands to the homepage successfully$")
	public void it_lands_to_the_homepage_successfully() throws Throwable {
	    System.out.println("successfully lands homepage");
	}

	
	@When("^User select the location of the Hotel in the dropdown list$")
	public void user_select_the_location_of_the_Hotel_in_the_dropdown_list() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		clickonWebElement(s.getLocation());
	}

	@When("^User select the Hotel in the dropdown list$")
	public void user_select_the_Hotel_in_the_dropdown_list() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		clickonWebElement(s.getHotels());
	}

	

	@When("^User select the room type$")
	public void user_select_the_room_type() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		clickonWebElement(s.getRoomType());

	}

	@When("^User select the number of Rooms$")
	public void user_select_the_number_of_Rooms() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		clickonWebElement(s.getNumberofrooms());

	}
	@When("^User enter \"([^\"]*)\" the chekin date$")
	public void user_enter_the_chekin_date(String checkin) throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		inputValuestoWebelement(s.getCheckIn(), checkin);
	}

	@When("^User enter \"([^\"]*)\" the chekout date$")
	public void user_enter_the_chekout_date(String checkout) throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		inputValuestoWebelement(s.getCheckout(), checkout);
	}

	

	@When("^User select number of Adults from room$")
	public void user_select_number_of_Adults_from_room() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		clickonWebElement(s.getAdultsroom());

	}

	@When("^User select number of childs per room$")
	public void user_select_number_of_childs_per_room() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		clickonWebElement(s.getChildrenRoom());

	}

	@When("^User Click search button for Hotel$")
	public void user_Click_search_button_for_Hotel() throws Throwable {
		SearchHotel s = new SearchHotel(driver);
		clickonWebElement(s.getSubmit());

}

	@Then("^It lands to the search page successfully$")
	public void it_lands_to_the_search_page_successfully() throws Throwable {
	    System.out.println("successfully search the hotels available");
	}

	@When("^User confirms the selected hotel$")
	public void user_confirms_the_selected_hotel() throws Throwable {
		AdactinSelect as = new AdactinSelect(driver);
		clickonWebElement(as.getRadioButton());

	}

	@When("^User clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable {
		AdactinSelect as = new AdactinSelect(driver);
		clickonWebElement(as.getContinueBtn());

	}

	@Then("^It lands to select hotel page successfully$")
	public void it_lands_to_select_hotel_page_successfully() throws Throwable {
	    System.out.println("Successfully selected  the Hotel and continued");
	}
	@When("^User enter \"([^\"]*)\" the first name$")
	public void user_enter_the_first_name(String firstname) throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValuestoWebelement(bh.getFirstName(),firstname);
	}

	@When("^User enter \"([^\"]*)\" the last name$")
	public void user_enter_the_last_name(String lastname) throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValuestoWebelement(bh.getLastName(),lastname);
	}

	@When("^User enter \"([^\"]*)\" the Address$")
	public void user_enter_the_Address(String address) throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValuestoWebelement(bh.getAddress(),address);
	}

	@When("^User enter \"([^\"]*)\" the credit card number$")
	public void user_enter_the_credit_card_number(String creditcard) throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValuestoWebelement(bh.getCreditCardNo(),creditcard);
	}

	@When("^User enter \"([^\"]*)\" the credit card type$")
	public void user_enter_the_credit_card_type(String cardtype) throws Throwable {
		BookHotel bh = new BookHotel(driver);
		selectDropDownOption(bh.getCreditCardType() , "value" , cardtype);
	}

	@When("^User enter \"([^\"]*)\" the expiry month of credit card$")
	public void user_enter_the_expiry_month_of_credit_card(String Expirymonth) throws Throwable {
		BookHotel bh = new BookHotel(driver);
		selectDropDownOption(bh.getCreditCardExpiryMonth() , "value" , Expirymonth);
	}

	@When("^User enter \"([^\"]*)\" the expiry Year of credit card$")
	public void user_enter_the_expiry_Year_of_credit_card(String expiryyear) throws Throwable {
		BookHotel bh = new BookHotel(driver);
		selectDropDownOption(bh.getCreditCardExpiryYear() , "value" , expiryyear); 
	}

	@When("^User enter \"([^\"]*)\" the CVV number$")
	public void user_enter_the_CVV_number(String cvv) throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValuestoWebelement(bh.getCvv(), cvv);
	}
	@When("^User click on Book Hotel button$")
	public void user_click_on_Book_Hotel_button() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		clickonWebElement(bh.getBookNowBtn());
	}
	
	
	@When("^User finally click on Itenary button$")
	public void user_finally_click_on_Itenary_button() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		clickonWebElement(bh.getItineryBtn());

	}

	@Then("^It lands to Booking the seleted Hotel$")
	public void it_lands_to_Booking_the_seleted_Hotel() throws Throwable {
System.out.println("sucessfully Done the payment");
	}

	@When("^User selects the Overall Bookings made$")
	public void user_selects_the_Overall_Bookings_made() throws Throwable {
		BookingIteneryPage bi = new BookingIteneryPage(driver);
		clickonWebElement(bi.getCheckall());

	}

	@When("^User click on cancel button$")
	public void user_click_on_cancel_button() throws Throwable {
		BookingIteneryPage bi = new BookingIteneryPage(driver);
		clickonWebElement(bi.getCancelbtn());

	}

	@When("^User confirms the Alert$")
	public void user_confirms_the_Alert() throws Throwable {
		BookingIteneryPage bi = new BookingIteneryPage(driver);
		ConfirmAlert(bi.getCancelbtn(),"dismiss");

	}

	@When("^User Logout the session$")
	public void user_Logout_the_session() throws Throwable {
		BookingIteneryPage bi = new BookingIteneryPage(driver);
		clickonWebElement(bi.getLogout());

	}

	@Then("^It lands to logout the session$")
	public void it_lands_to_logout_the_session() throws Throwable {
		
		Closeapplication();
System.out.println("Successfully closed");
	}



}
