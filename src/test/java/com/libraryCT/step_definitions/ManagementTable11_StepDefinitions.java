package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ManagementTable11_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();

    @Given("the user\\(librarian) on the homepage")
    public void the_user_librarian_on_the_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        loginPage.submitButton.click();

    }
    @When("the user click users module")
    public void the_user_click_users_module() {

        usersPage.usersLink.click();
        BrowserUtils.wait(2);
    }


    @Then("the user should see the following column names :")
    public void the_user_should_see_the_following_column_names(List<String> expectedColumnNames) {

        List<String> actualColumnNames = new ArrayList<>();

        for (WebElement each : usersPage.managementColumns){
            actualColumnNames.add(each.getText());
        }
        System.out.println("expectedColumnNames = " + expectedColumnNames);
        System.out.println("actualColumnNames = " + actualColumnNames);

        Assert.assertTrue(expectedColumnNames.equals(actualColumnNames));


    }

}
