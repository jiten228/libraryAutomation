package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UsersTable6_StepDefinitions {

    BooksPage booksPage = new BooksPage();

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedColumnsNames) {

        System.out.println("expectedColumnsNames = " + expectedColumnsNames);
        System.out.println("expectedColumnsNames.size() = " + expectedColumnsNames.size());

       List<String> actualColumnNames = BrowserUtils.getElementsText(booksPage.tableHeaders);
        Assert.assertEquals(expectedColumnsNames,actualColumnNames);
    }

}
