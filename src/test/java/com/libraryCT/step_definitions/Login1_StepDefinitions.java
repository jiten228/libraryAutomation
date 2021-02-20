package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login1_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String libraryUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(libraryUrl);

    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.submitButton.click();

    }

    @Then("dashboard should be displayed {string}")
    public void dashboard_should_be_displayed(String expected) {

        wait.until(ExpectedConditions.urlContains(expected));
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertTrue(actualUrl.contains(expected));
    }

    @When("User click on logout button")
    public void user_click_on_logout_button() {
        loginPage.usernameLink.click();
        loginPage.logoutButton.click();
    }

    @Then("User should be on login home page")
    public void user_should_be_on_login_home_page() {
        Assert.assertTrue(loginPage.username.isDisplayed());
    }
}
