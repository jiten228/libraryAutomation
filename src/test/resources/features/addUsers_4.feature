Feature: Able to add users from users page.

  @addUser
  Scenario: As a librarian, I should be able to add users from users page.
    Given user is on the login page
    And with librarian login credential login successfully
    When user add users with all valid info
    And user close the add user window with close button
    Then user able to add users with all valid info and close the add user window

  @editUser
  Scenario: As a librarian, I should be able to edit user info.
    Given user is on the login page
    And with librarian login credential login successfully
    When user click edit user button
    Then user able to edit user info
