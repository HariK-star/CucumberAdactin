$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing hotel booking and cancellation functionalities in adactin application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 209928,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-function",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"hari1993skr\" the valid  username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter \"123456\" the valid Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter the login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 5630840427,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hari1993skr",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 467514672,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_Password(String)"
});
formatter.result({
  "duration": 148725038,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_login_Button()"
});
formatter.result({
  "duration": 3976011930,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_homepage_successfully()"
});
formatter.result({
  "duration": 89569,
  "status": "passed"
});
formatter.after({
  "duration": 128444,
  "status": "passed"
});
formatter.before({
  "duration": 85526,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User search the hotel in application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-search-the-hotel-in-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User select the location of the Hotel in the dropdown list",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User select the Hotel in the dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User select the room type",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User select the number of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enter \"04/06/2020\" the chekin date",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enter \"05/06/2020\" the chekout date",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User select number of Adults from room",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User select number of childs per room",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Click search button for Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "It lands to the search page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_the_location_of_the_Hotel_in_the_dropdown_list()"
});
formatter.result({
  "duration": 261487409,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_Hotel_in_the_dropdown_list()"
});
formatter.result({
  "duration": 262072408,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_room_type()"
});
formatter.result({
  "duration": 255329524,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_number_of_Rooms()"
});
formatter.result({
  "duration": 233376666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04/06/2020",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_chekin_date(String)"
});
formatter.result({
  "duration": 159640355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/06/2020",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_chekout_date(String)"
});
formatter.result({
  "duration": 145373656,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_number_of_Adults_from_room()"
});
formatter.result({
  "duration": 202334709,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_number_of_childs_per_room()"
});
formatter.result({
  "duration": 61599061078,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_search_button_for_Hotel()"
});
formatter.result({
  "duration": 60250787307,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_search_page_successfully()"
});
formatter.result({
  "duration": 45718,
  "status": "passed"
});
formatter.after({
  "duration": 48205,
  "status": "passed"
});
formatter.before({
  "duration": 38254,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User select and confirm the Hotel from the application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-select-and-confirm-the-hotel-from-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@select"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "User confirms the selected hotel",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User clicks the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "It lands to select hotel page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_confirms_the_selected_hotel()"
});
formatter.result({
  "duration": 132889323,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_continue_button()"
});
formatter.result({
  "duration": 2944101648,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_select_hotel_page_successfully()"
});
formatter.result({
  "duration": 125645,
  "status": "passed"
});
formatter.after({
  "duration": 72775,
  "status": "passed"
});
formatter.before({
  "duration": 272440,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "User booking the room in Hotel and making payment",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-booking-the-room-in-hotel-and-making-payment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Booking"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User enter \"hari\" the first name",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User enter \"k\" the last name",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enter \"Texas,America\" the Address",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User enter \"9876543211234571\" the credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enter \"VISA\" the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enter \"7\" the expiry month of credit card",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User enter \"2021\" the expiry Year of credit card",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enter \"333\" the CVV number",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User click on Book Hotel button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User finally click on Itenary button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "It lands to Booking the seleted Hotel",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hari",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_first_name(String)"
});
formatter.result({
  "duration": 154900338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "k",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_last_name(String)"
});
formatter.result({
  "duration": 127199500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Texas,America",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_Address(String)"
});
formatter.result({
  "duration": 146319420,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9876543211234571",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_credit_card_number(String)"
});
formatter.result({
  "duration": 172581553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_credit_card_type(String)"
});
formatter.result({
  "duration": 118822289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_expiry_month_of_credit_card(String)"
});
formatter.result({
  "duration": 107378576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2021",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_expiry_Year_of_credit_card(String)"
});
formatter.result({
  "duration": 107098050,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "333",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_the_CVV_number(String)"
});
formatter.result({
  "duration": 132019755,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_Book_Hotel_button()"
});
formatter.result({
  "duration": 103344540,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_finally_click_on_Itenary_button()"
});
formatter.result({
  "duration": 8553720077,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_Booking_the_seleted_Hotel()"
});
formatter.result({
  "duration": 81794,
  "status": "passed"
});
formatter.after({
  "duration": 78373,
  "status": "passed"
});
formatter.before({
  "duration": 127512,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "User wants to cancel the selected Hotel booking and logout",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-wants-to-cancel-the-selected-hotel-booking-and-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@Itenery"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "User selects the Overall Bookings made",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "User click on cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User confirms the Alert",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User Logout the session",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "It lands to logout the session",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Overall_Bookings_made()"
});
formatter.result({
  "duration": 110932111,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_cancel_button()"
});
formatter.result({
  "duration": 101972078,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirms_the_Alert()"
});
formatter.result({
  "duration": 18872983,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Logout_the_session()"
});
formatter.result({
  "duration": 804939370,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_logout_the_session()"
});
formatter.result({
  "duration": 85818827,
  "status": "passed"
});
formatter.after({
  "duration": 57536,
  "status": "passed"
});
});