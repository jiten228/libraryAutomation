package com.libraryCT.step_definitions;

import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BorrowingBooks8_StepDefinitions {

    @Given("the user on the homepage")
    public void the_user_on_the_homepage() {
        Driver.getDriver().get("http://library2.cybertekschool.com/#books");
    }


    @When("the user click Borrowing Books module")
    public void the_user_click_borrowing_books_module() {

    }


    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(io.cucumber.datatable.DataTable dataTable) {

    }
}
