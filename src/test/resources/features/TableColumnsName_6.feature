@wip
Feature: Table Column Name
  As a students, I should be able to see tables with default info

  @6
  Scenario: Table columns names
    Given I am on the login page
    And I login using "student107@library" and "zZr8iI13"
    Then table should have following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |