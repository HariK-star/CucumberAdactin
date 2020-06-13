Feature: Testing hotel booking and cancellation functionalities in adactin application

@Login
Scenario: Checking the valid username and password for login function
Given user launch the adactin application
When User enter "hari1993skr" the valid  username
And  User enter "123456" the valid Password
And User enter the login Button
Then It lands to the homepage successfully

@search
Scenario: User search the hotel in application
When User select the location of the Hotel in the dropdown list
And User select the Hotel in the dropdown list
And User select the room type
And User select the number of Rooms
And User enter "04/06/2020" the chekin date
And User enter "05/06/2020" the chekout date 
And User select number of Adults from room 
And User select number of childs per room
And User Click search button for Hotel
Then It lands to the search page successfully

@select
Scenario: User select and confirm the Hotel from the application
When User confirms the selected hotel
And User clicks the continue button
Then It lands to select hotel page successfully

@Booking
Scenario: User booking the room in Hotel and making payment
When User enter "hari" the first name
And User enter "k" the last name
And User enter "Texas,America" the Address
And User enter "9876543211234571" the credit card number
And User enter "VISA" the credit card type
And User enter "7" the expiry month of credit card 
And User enter "2021" the expiry Year of credit card 
And User enter "333" the CVV number
And User click on Book Hotel button
And User finally click on Itenary button
Then It lands to Booking the seleted Hotel

@Itenery
Scenario: User wants to cancel the selected Hotel booking and logout
When User selects the Overall Bookings made
And User click on cancel button
And User confirms the Alert
And User Logout the session
Then It lands to logout the session
