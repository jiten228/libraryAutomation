@wip
Feature:As a user, I should be able to see several modules once user login


@s1
  Scenario: Student should access 2 modules

    Given student is on the home page
    Then  student should see the following modules
      | Books           |
      | Borrowing Books |

@s2
    Scenario: Librarians should access to 3 modules
      Given the Librarian  on the homepage
      Then  the Librarian should see the following modules
      | Dashboard       |
      | Users           |
      | Books           |