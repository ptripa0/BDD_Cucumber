#Author: prabodh.tripathi@datametica.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@BookFlightAndHotel
Feature: I am going on holiday
		I want to book flight and hotel

@BookFlight
Scenario Outline: Call agent for FlightBooking
    Given I live in Pune
    And Going to visit city for holiday around kms
    |CITY1|CITY2|
    |Delhi|Goa  |
    |1200 |500  |
    When Holiday from <startdate> to <enddate>
    And There are 2 adults and a child
    Then If flights are not available, book train tickets
    And AC tickets only
    
Examples:
|startdate|enddate|
|15112018|20112018|

@BookHotel
Scenario: Call agent for HotelBooking
    Given We are 2 adult and a child
    And need double room
    When From 15th Nov 2018 to 19th Nov 2018
    And Need a bike
    Then Stay should be comfertable
    And With swimming pool
