Feature: As a user, I should be able to upload a file, move or delete any selected file under the Files module

 Background:
#    Given  user  in login page
#    Given user clicks on files button
#    Then user clicks plus button

#  Scenario: user can create a new folder
#    Given  user  in login page
#    Given user clicks on files button
#    Then user clicks plus button
#    Then user selects New folder option
#    And user sends new name for folder
#    Then user should see new folder on the list
#
  Scenario: user can upload a file
    Given  user  in login page
    Given user clicks on files button
    Then user clicks plus button
    And user selects Upload file option

#  TODO  Then user uploads the file          -------->  could not upload file path
#   TODO And user should be able to see new file under the Name row




#  Scenario:  user can delete any selected item from its three dots menu
#    Given user clicks new upload file's three dots
#    Then user clicks on delete option
#    And user sees deleted files and folders in trash bin


#  Scenario:   user can see the total number of files and folders under the files list table
#    Given user should be able to see the total number of files and folders
#