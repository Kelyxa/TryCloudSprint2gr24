
Feature: Users should be able to login




  @B32G24-213
  Scenario:  Users can login with valid credentials by clicking on the "Login" button.
    Given  user navigate to the application
    Then  user logged in with a valid credentials
    Then user click on the login button
    And the user is redirected to the dashboard page
