Feature: As a user, I should be able to group category features

  @groupcategory
Scenario: verify user categories
    Given the Librarian is on the homepage
  When the user click users module.
  And the user click User Group dropdown

  Then the user should see the following options:
    | All          |

  Then the user should see the following options

    |Librarian     |
    |Students      |





