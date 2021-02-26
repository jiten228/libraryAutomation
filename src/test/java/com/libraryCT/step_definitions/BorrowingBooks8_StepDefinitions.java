package com.libraryCT.step_definitions;

import com.libraryCT.pages.BorrowingBooksPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BorrowingBooks8_StepDefinitions {

   BorrowingBooksPage borrowingBooksPage= new BorrowingBooksPage();

   LoginPage loginpage = new LoginPage();


    @Given("the user on the homepage")
    public void the_user_on_the_homepage() {
        Driver.getDriver().get("http://library2.cybertekschool.com/#books");

       loginpage.login_As_A_Student();
    }


    @When("the user click Borrowing Books module")
    public void the_user_click_borrowing_books_module() {



    }


    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedColumnNames) {

        System.out.println("expectedColumnNames = " + expectedColumnNames);
        System.out.println("expectedColumnName.size = " + expectedColumnNames.size());

        BrowserUtils.wait(2);
        List<String> actualColumnNames = BrowserUtils.getElementsText(borrowingBooksPage.tableHeaders);



    }
}
