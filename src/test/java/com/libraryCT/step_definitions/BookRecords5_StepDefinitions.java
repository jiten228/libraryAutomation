package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;

import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class BookRecords5_StepDefinitions {

    BooksPage booksPage = new BooksPage();
    Select selectRecords;


    @When("I click on {string} link")
    public void i_click_on_link(String link) {

        switch (link.toLowerCase()) {
            case "dashboard":
                booksPage.dashboardLink.click();
                break;
            case "users":
                booksPage.usersLink.click();
                break;
            case "books":
                booksPage.booksLink.click();
                break;
        }

    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {

        selectRecords = new Select(booksPage.showRecordsDropdown);
        String actual = selectRecords.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected + "");

    }


    @Then("Show records for {string} options")
    public void showRecordsForOptions(String options) {

        selectRecords = new Select(booksPage.showRecordsDropdown);
        BrowserUtils.wait(1);

        switch (options) {
            case "5":
                selectRecords.selectByIndex(0);
                break;
            case "10":
                selectRecords.selectByIndex(1);
                break;
            case "15":
                selectRecords.selectByIndex(2);
                break;
            case "50":
                selectRecords.selectByIndex(3);
                break;
            case "100":
                selectRecords.selectByIndex(4);
                break;
            case "200":
                selectRecords.selectByIndex(5);
                break;
            case "500":
                selectRecords.selectByIndex(6);



        }

        BrowserUtils.wait(3);
        List<WebElement> list = new ArrayList<>(booksPage.editBookButton);
        int number = list.size();
        Assert.assertEquals(number, Integer.parseInt(options));

    }
}






