@Trycloud
Feature:
  User Story  :  Users should be able to login

  Background: For all the scenarios user is on the login page of application Trycloud
    Given Users Log to the application Trycloud

  @B32G24-213 @positive
  Scenario:  Users can login with valid credentials by clicking on the "Login" button.
    Then  user logged in with a valid credentials
      | username | Employee61  |
      | password | Employee123 |
    Then user click on the login button
    And the user is redirected to the dashboard page

  @B32G24-220 @positive
  Scenario: Users can login with valid credentials by hitting the"Enter"key from the keyboard.
    Then  user logged in with a valid credentials
      | username | Employee61  |
      | password | Employee123 |
    Then user hit the Enter key from the keyboard
    And the user is redirected to the dashboard page

  @B32G24-223 @negative
  Scenario: User logs in with invalid credentials
    Given the user enters invalid credentials
      | user | Employe12 |
      | pass | 1456      |
    Then user click on the login button
    And an error message should be displayed "Wrong username or password"

  @B32G24-224 @negative
  Scenario: User gets error message for empty username field
    Given the user enters a valid password
      | passWord | Employee123 |
    When the user leaves the username field empty
    And user click on the login button
    Then the user should see the  "Please fill out this field" ,message for the username field

  @B32G24-225 @negative
  Scenario: User gets error message for empty password field
    Given the user enters a valid username
      | username | Employee61 |
    When the user leaves the password field empty
    And user click on the login button
    Then the user should see the  "Please fill out this field",message for the password field

  @B32G24-226 @positive
  Scenario: User sees the password field masked with dots
    Given the user enters a valid password
      | passWord | Employee123 |
    Then the password field should be masked with dots

  @B32G24-227 @positive
  Scenario: User has the option to view the entered password explicitly
    Given the user enters a valid password
      | passWord | Employee123 |
    And the user click on the icone eye option
    Then the user should see the entered password explicitly

  @B32G24-228 @positive
  Scenario: User accesses the "Forgot password?" link and resets the password
    Given the user clicks on the "Forgot password?" link
    When the user is redirected to the password reset page
    Then the user should see a "Reset Password" button

  @B32G24-229 @positive
  Scenario: User can see valid placeholders on the Username and Password fields
    Given the user should see a valid placeholder on the "Username or email" on the box input
    Then the user should see a valid placeholder on the "Password" field

  @B32G24-232 @negative
    Scenario: Login with Case-Insensitive Username
    Given the user enters a username with any case "EMPLOYEE61"
    When the user enters a valid password
      | passWord | Employee123 |
    Then user click on the login button
    And the user is redirected to the dashboard page


  @B32G24-236
  Scenario: Throttled Login Due to Multiple Invalid Attempts
    Given the user enters a valid username
      | username | Employee61 |
    Then  the user enters invalid password
      | pass | 1456 |
    And user click on the login button
    Then my next login attempt should be delayed by 30 seconds
    And the user should see an error message




