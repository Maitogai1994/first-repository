@Search
Feature: Verify User is on the Search Hotel Page

Scenario Outline: Verifying Adactin Login Details with valid Login Credentials
	Given User is on the Adactin page
	When User should enter "<username>","<passowrd>" 
	Then User should verify after login "Hello Selvaraj"
	And User should select all fields in search hotel page "<Location>", "<Hotels>", "<RoomType>", "<NumberOfRooms>", "<CheckInDate>", "<CheckOutDate>", "<AdultsPerRoom>" and "<ChildrenPerRoom>"
	Then User should verify the message after search hotel "Search Hotel"
	
	Examples: 
		|username   |password|Location|Hotels |RoomType |NumberOfRooms |CheckInDate |CheckOutDate |AdultsPerRoom|ChildrenPerRoom|
		|Selvarajd12|C6T72M  |Melbourne|Hotel Creek|Double|2 - Two| 14/11/2022 | 15/11/2022| 1 - One| 0-None|
		
Scenario Outline: Verify whether all mandatory fields are Selected
	Given User is on the Adactin page
	When User should enter "<username>","<passowrd>" 
	Then User should verify after login "Hello Selvaraj"
	And User should select all fields in search hotel page "<Location>", "<NumberOfRooms>", "<CheckInDate>", "<CheckOutDate>", "<AdultsPerRoom>" 
	Then User should verify the message after search hotel "Search Hotel"		
	
	Examples:
	|username   |password|Location|NumberOfRooms |CheckInDate |CheckOutDate |AdultsPerRoom|
	|Selvarajd12|C6T72M  |Melbourne|2 - Two| 14/11/2022 | 15/11/2022| 1 - One|
		
Scenario Outline: Verify whether all mandatory fields are Selected
	Given User is on the Adactin page
	When User should enter "<username>","<passowrd>" 
	Then User should verify after login "Hello Selvaraj"
	And User should select all fields in search hotel page "<Location>", "<NumberOfRooms>", "<CheckInDate>", "<CheckOutDate>", "<AdultsPerRoom>" 
	Then User should verify the message after search hotel "please Select a Location"
	
	
		Examples:
	|username		|password|
	|Selvarajd12|C6T72M	|
		
		