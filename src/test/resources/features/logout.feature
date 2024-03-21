@B32G24-221
Feature: TryCloud Log out feature
	User Story:  As a user, I should be able to logout



	# 
	#h2.  
	@B32G24-218
	Scenario:  User can log out by using "Log out" button inside profile info and ends up in login page
		Given User is on the home page
		    When User click on profile button
		    And User click on Logout button
		    Then Users should end up in login page	

	
	@B32G24-219
	Scenario: Users cannot go to the home page again by clicking the step back button after successfully logged out
		Given User is on the home page
		    When User click on profile button
		    And User click on Logout button
		    And User clicks on the step back arrow button
		    Then User should not go back to the home page again