Feature: Hotel Room Booking 

Scenario: Login Page 
	Given User can able to launch the URL 
	When User can able to enter the username in the username field 
	And user can able to enter the password in the password field 
	Then User can able to click the login button
	
	
Scenario: Search Hotel 
	When User can able to select hotel location from location dropdown 
	And User can able to select hotel from select hotel dropdown 
	And User can able to select room type from room type dropdown 
	And User can able to select No,of Room from No.of Room dropdown 
	And User can able to enter the CheckIn date in the checkIn date field 
	And User can able to enter the CheckOut date in the checkOut date field 
	And User can able to select adult per room from Adults per room dropdown 
	And User can able to select children per room from children per room dropdown 
	Then User can able to click the search button
	
	Scenario: Select Hotel
	    When User can able to select and click radio button
	    Then user can able to click the continue button
	    
	    Scenario: Book a Hotel
	        When User can able to enter the First Name in the First Name field
	        And User can able to enter the Last Name in the Last Name field
	        And User can able to enter the address details in the Billing Address field
	        And User can able to enter the Creditcard Number in the Credit Card No field
	        And User can able to select card type from Credit Card Type dropdown
	        And User can able to select Exp Month from Select month dropdown
	        And User can able to select Exp Year from Select year dropdown
	        And User can able to enter the CVV number in the CVV number field
	        Then User can able to click the BookNow button
	        
	       Scenario: Booking Confirmation
	           When User can able to scroll down the current page
	           Then User can to able to click the logout button