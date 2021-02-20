package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBooks7_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("User is on login page")
    public void user_is_on_login_page() {

        String libraryUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(libraryUrl);

    }
    @Given("with Student login credential login successfully")
    public void with_student_login_credential_login_successfully() {

       loginPage.login_As_A_Student();   // login as a Student in my case

       // loginPage.login_As_A_Librarian(); // if your story related Librarian then use this one
        BrowserUtils.wait(7);
    }

    @When("Student click on different categories")
    public void student_click_on_different_categories() {

    }

    @Then("It should display all categories")
    public void it_should_display_all_categories() {

    }

    @Then("Student able to select any categories and search Books")
    public void student_able_to_select_any_categories_and_search_books(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
}
