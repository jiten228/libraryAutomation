Feature: As a user, I should be able to login to the library app.

 @Librarian
  Scenario: Login as a librarian
    Given I am on the login page
    When I login using "librarian17@library" and "tXqOoIOS"
    Then dashboard should be displayed "dashboard"


  @Student
  Scenario: Login as a student
    Given I am on the login page
    When I login using "student106@library" and "Yerj6ZHm"
    Then dashboard should be displayed "books"
