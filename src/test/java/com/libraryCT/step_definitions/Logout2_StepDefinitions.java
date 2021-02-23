package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout2_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @When("User click on logout button")
    public void user_click_on_logout_button() {
        BrowserUtils.waitForVisibility(loginPage.usernameLink, 10);
        loginPage.usernameLink.click();
        loginPage.logoutButton.click();
    }

    @Then("User should be on login home page")
    public void user_should_be_on_login_home_page() {
        BrowserUtils.waitForVisibility(loginPage.username,10);
        Assert.assertTrue(loginPage.username.isDisplayed());
    }
}
