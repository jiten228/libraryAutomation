package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


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
        selectRecords.selectByVisibleText(options);

        booksPage.showRecordsDropdown.sendKeys(options);

//       List<WebElement> webElements = selectRecords.getOptions();
//        List<String> actual = BrowserUtils.getElementsText(webElements);
//        Assert.assertEquals(actual, options);


    }
}






