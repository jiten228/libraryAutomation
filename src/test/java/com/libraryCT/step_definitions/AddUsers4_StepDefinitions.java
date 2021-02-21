package com.libraryCT.step_definitions;

import com.github.javafaker.Faker;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUsers4_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    UsersPage userPage = new UsersPage();
    Faker faker = new Faker();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String libraryUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(libraryUrl);
    }
    @Given("with librarian login credential login successfully")
    public void with_librarian_login_credential_login_successfully() {
        loginPage.login_As_A_Librarian();
        BrowserUtils.wait(10);
    }

    @When("user add users with all valid info")
    public void user_add_users_with_all_valid_info() {
        userPage.addUserButton.click();
        userPage.fullName.sendKeys(faker.name().fullName());
        userPage.password.sendKeys(faker.lorem().characters());



    }
    @When("user close the add user window with {string} button")
    public void user_close_the_add_user_window_with_button(String string) {

    }
    @Then("user able to add users with all valid info and close the add user window")
    public void user_able_to_add_users_with_all_valid_info_and_close_the_add_user_window() {

    }

    @When("user click {string} button")
    public void user_click_button(String string) {

    }
    @Then("user able to edit user info")
    public void user_able_to_edit_user_info() {

    }


}
