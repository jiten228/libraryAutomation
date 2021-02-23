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
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StatusVerification10_StepDefinitions {

     LoginPage loginPage = new LoginPage();
     UsersPage usersPage = new UsersPage();
     Select select;
    @Given("the user\\(librarian)on the homepage")
    public void the_user_librarian_on_the_homepage() {

        String Url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(Url);
       loginPage.login_As_A_Librarian();
        BrowserUtils.wait(2);

    }

    @When("the user click users  module")
    public void the_user_click_users_module() {

    usersPage.usersButton.click();


    }
    @When("the user click Status dropdown")
    public void the_user_click_status_dropdown() {

     usersPage.statusDropdown.click();
      select= new Select(usersPage.statusDropdown);
        WebElement firstSelectOption = select.getFirstSelectedOption();

    }
    @Then("the user should see the following option")
    public void the_user_should_see_the_following_option(List<String>listOfStatus) {

        List<WebElement> elements = select.getOptions();
        for (int i = 1; i < listOfStatus.size(); i++) {

            BrowserUtils.waitForVisibility(usersPage.statusDropdown,5);
            select.selectByIndex(i);

            if (i < 2) BrowserUtils.wait(3);
            else BrowserUtils.wait(1);

            Assert.assertTrue(listOfStatus.get(i).equals(usersPage.findUserStatus.getText()));

        }


    }


}
