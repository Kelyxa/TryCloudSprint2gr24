@B32G24-217
Feature: as a user I should be able to modify dashboard page

  Background:
    Given Users Log to the application Trycloud
    Then  user logged in with a valid credentials
      | username | Employee61  |
      | password | Employee123 |
    Then user click on the login button
    And the user is redirected to the dashboard page

  @B32G24-214
  Scenario: After login user can see all modules and username
    Then user should see below modules on the header
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |
    When user clicks on the user icon
    And user should see the username

  @B32G24-215
  Scenario Outline: User can click on customize button and select any of the widgets
    When user should be able to click on the customize button
    Then user is able to click on the "<expectedWidgetButton>" button
    Then user closes the customize widgets window
    Examples:
      | expectedWidgetButton |
      | Status               |
      | Weather              |
      | Talk mentions        |
      | Upcoming events      |
      | Upcoming cards       |
      | Recommended files    |
      | Recent statuses      |

  @B32G24-216
  Scenario: User can click on set status button and select any of the status options
    When set status button is enabled on the dashboard page
    Then user should be able to click on the set status button
    And user should be able to select below status options
      | Online         |
      | Away           |
      | Do not disturb |
      | Invisible      |