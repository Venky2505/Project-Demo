Feature: Hotel Booking Functionality 


Scenario: User want to login the application 
	Given User want to lauch the adactin application 
	When User want to enter the "venkatalakshmi25" login details 
	And User enter the "Devkalyan@123" valid password 
	Then User verify the details 

Scenario: User want to search hotel 
	When User want to enter the location 
	And User want to enter the hotel 
	And User want to enter the room type 
	And User want to enter the number of rooms 
	And User want to enter the check in date 
	And User want to enter the check out date 
	And User want to enter the number of adults 
	And User want to enter the number of children 
	Then User want to enter the search hotel 
	
Scenario: User want to select hotel 
	When User want to click the selected hotel 
	And User want to confirm the hotel 
	
Scenario: User want to enter the details 
	When User want to enter the first name 
	When User want to enter the last name 
	And User want to enter the billing address 
	And User want to enter the credit card number 
	And User want to enter the credit card type 
	And User want to enter the expiry month 
	And user want to eneter the expiry year 
	And user want to enter the Cvv number 
	Then User want to click the book now 
	 