@files
Feature: As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  Background:
    Given user is logged in
    When user clicks on the files icon at top left

  @Name
  Scenario: Folder View order by Name
    And user clicks on Name button
    Then user sees list in alphabetical order

  @Size
  Scenario: Folder View order by Size
    When user clicks on the Size button
    Then user sees list in order based on size

  @Modified
  Scenario: Folder View order by Modified
    When user clicks on the Modified button
    Then user sees list in order of modified dates

  @allFiles
  Scenario: Select All files
    When user clicks on All files button
    And user clicks on Select All checkbox
    Then user sees all checkboxes are checked
    And total values of folders and files are displayed
