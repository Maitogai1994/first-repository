@Login
Feature: Verify Adactin Login Details
@smoke
Scenario Outline: Verifing Adactin Login Details with valid credentials
	Given User is on the Adactin page
	When User should enter "<username>","<password>"
	Then User should verify after login "Hello Selvaraj!"
	
	Examples:
	|username		|password|
	|Selvarajd12|C6T72M	|
	
@smoke
Scenario Outline: Verifying Login Details usiing Enter Key
	Given User is on Adactin page
	When User should login with the help of enter key"<username>", "<password>"
	Then User should verify after login "Hello selvarraj"
	
		Examples:
	|username		|password|
	|Selvarajd12|C6T72M	|
@smoke
	Scenario Outline: Verify Adactin Login Details using Invalid Credentials
	
	Given User is on the Adactin page
	When User should enter "<username>", "<password>"
	Then User should verify Login Error Message contains "Invalid Login details or Your password might have expired"
	
			Examples:
	|username		|password|
	|Selvarajd12|C6T72a	|
	
	