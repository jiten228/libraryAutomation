
@wip
Feature:

Feature: User should be able to see borrowing books table column names
  As a user, I should able to see my borrowing books.

  @1
  Scenario: borrowing books tabe column names
    Given the user on the homepage
    When the user click Borrowing Books module
    Then the user should see the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Data       |
      | Planned Return Data |
      | Return Data         |
      | Is Returned         |