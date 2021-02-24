package com.libraryCT.step_definitions;

import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
//added

public class SeveralModules_StepDefinitions {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("student is on the home page")
    public void student_is_on_the_home_page() {
        String studentUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(studentUrl);

        loginPage.login_As_A_Student();
        BrowserUtils.wait(2);
    }


    @Then("student should see the following modules")
    public void student_should_see_the_following_modules(List<String> modules) {
        List<String> actualText = BrowserUtils.getElementsText(dashboardPage.dashboard1);
        Assert.assertTrue(actualText.equals(modules));
        for (WebElement each : dashboardPage.dashboard1) {
            System.out.println(each.getText());
        }

    }


    @Given("the Librarian  on the homepage")
    public void theLibrarianOnTheHomepage() {
        String libraryUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(libraryUrl);

        loginPage.login_As_A_Librarian();
        BrowserUtils.wait(2);
    }


    @Then("the Librarian should see the following modules")
    public void theLibrarianShouldSeeTheFollowingModules(List<String> modules) {
        List<String> actualText = BrowserUtils.getElementsText(dashboardPage.dashboard1);
        Assert.assertTrue(actualText.equals(modules));
        for (WebElement each : dashboardPage.dashboard1) {
            System.out.println(each.getText());

        }


    }
}
