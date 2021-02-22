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
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
        BrowserUtils.wait(3);
    }

    @When("user add users with all valid info")
    public void user_add_users_with_all_valid_info() {

        userPage.usersButton.click();
        userPage.addUserButton.click();
        userPage.fullName.click();
        userPage.fullName.clear();
        userPage.fullName.sendKeys(faker.name().fullName());
        userPage.password.click();
        userPage.password.clear();
        userPage.password.sendKeys(faker.lorem().characters());
        userPage.email.click();
        userPage.email.clear();
        userPage.email.sendKeys(faker.internet().safeEmailAddress());
        Select selectUserGroup = new Select(userPage.userGroup);
        selectUserGroup.selectByVisibleText("Librarian");

        Select status = new Select (userPage.status);
        status.selectByVisibleText("ACTIVE");

        userPage.address.click();
        userPage.address.clear();
        userPage.address.sendKeys(faker.address().fullAddress());
        userPage.saveChangesButton.click();

    }
    @When("user close the add user window with close button")
    public void user_close_the_add_user_window_with_button() {
        userPage.addUserButton.click();
        userPage.closeButton.click();


    }
    @Then("user able to add users with all valid info and close the add user window")
    public void user_able_to_add_users_with_all_valid_info_and_close_the_add_user_window() {
        userPage.saveChangesButton.click();
    }

    @When("user click edit user button")
    public void user_click_button() {
        userPage.usersButton.click();
        userPage.editUserButton.click();
        BrowserUtils.wait(2);
        userPage.fullName.click();
        userPage.fullName.clear();
        userPage.fullName.sendKeys(faker.name().fullName());
        userPage.saveChangesButton.click();
    }

    @Then("user able to edit user info")
    public void user_able_to_edit_user_info() {

//      wait.until(ExpectedConditions.visibilityOf(userPage.userUpdatedMessage));
//      if (userPage.userUpdatedMessage.isDisplayed()){
//          System.out.println("Passed");
//      }else{
//          System.out.println("Failed!!!");
//      }

    }


}
