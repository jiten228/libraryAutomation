package com.libraryCT.step_definitions;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UserGroupPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class GroupCategory9_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    Select userGroups;
    UserGroupPage userGroupPage= new UserGroupPage();

    @Given("the Librarian is on the homepage")
    public void the_librarian_is_on_the_homepage() {
        String libraryUrl = ConfigurationReader.getProperty("url");
       Driver.getDriver().get(libraryUrl);

        loginPage.login_As_A_Librarian();
        BrowserUtils.wait(3);


    }
    @When("the user click users module.")
    public void the_user_click_users_module() {
    UserGroupPage.usersCategory.click();
    BrowserUtils.wait(3);

    }
    @And("the user click User Group dropdown")
    public void the_user_click_user_group_dropdown() {
        Select userGroups= new Select(UserGroupPage.userGroupsDropdown);
        userGroupPage.userGroupsDropdown.click();
        //userGroups.getFirstSelectedOption().click();
        BrowserUtils.wait(5);
    }
    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> allOptions) {

        userGroups=new Select(UserGroupPage.userGroupsDropdown);

        List<WebElement> webElements= userGroups.getOptions();
       List<String> actualTexts = BrowserUtils.getElementsText(webElements);
        BrowserUtils.wait(2);

        Assert.assertEquals(allOptions,actualTexts);


    }

}
