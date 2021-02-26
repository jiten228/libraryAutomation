@wip
Feature:  User status feature

  @StatusFeature
  Scenario: verify user can change status
    Given the user(librarian)on the homepage
    When the user click users  module
    And the user click Status dropdown
    Then the user should see the following option

      | ACTIVE   |
      | INACTIVE |