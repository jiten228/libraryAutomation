
Feature: As a librarian, I should be able to see book records on user page


  Scenario: Verify that the default record is 10
    Given I am on the login page
    When I login using "librarian17@library" and "tXqOoIOS"
    And I click on "Books" link
    Then show records default value should be 10
  @ruzanna
  Scenario Outline: Show records option
    Given I am on the login page
    When I login using "librarian17@library" and "tXqOoIOS"
    And I click on "Books" link
    Then Show records for "<count>" options
    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |
