@wip
Feature: User management table feature

  @managementTable
  Scenario: user management table columns names

    Given the user(librarian) on the homepage
    When the user click users module
    Then the user should see the following column names :
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |