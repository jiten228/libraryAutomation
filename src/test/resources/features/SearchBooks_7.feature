
Feature: Students able to search books

  Agile Story:  7. As a students, I should be able to search books with different categories.
  (student may create a scenario with pipeline to list all the categories)

  @Regression
  Scenario: Students able to search books in different Categories
    Given User is on login page
    And with Student login credential login successfully
    When Student click on different categories
    Then It should display all categories
    Then Student able to select any categories and search Books
      | All                     |
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |