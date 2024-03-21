@B32G24-235
Feature: Default

	
	@B32G24-233
	Scenario: User can search file typing its name through the magnifying glass icon inside any Module and see the details side page of the file when clicked on it.
		Given User is on the home page
		    When user click on Files module
		    And User click on the magnifying glass icon
		    And User type the file name in search input box
		    Then User should be able to open the file and see the details side page of the file.
		
		

	@B32G24-234
	Scenario: User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page.
		Given User is on the home page
		    When User click on Files module
		    And User click on TryCloud icon at the top left corner
		    Then Users should be able to navigate to the Dashboard page