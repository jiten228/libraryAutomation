package com.libraryCT.step_definitions;

import com.libraryCT.pages.BooksPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchBooks7_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    BooksPage booksPage = new BooksPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Select select;

    @Given("User is on login page")
    public void user_is_on_login_page() {

        String libraryUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(libraryUrl);

    }
    @Given("with Student login credential login successfully")
    public void with_student_login_credential_login_successfully() {

       loginPage.login_As_A_Student();   // login as a Student in my case

       // loginPage.login_As_A_Librarian(); // if your story related Librarian then use this one

    }

    @When("Student click on different categories")
    public void student_click_on_different_categories() {
        BrowserUtils.waitForVisibility(booksPage.bookCategories,10);
        select = new Select(booksPage.bookCategories);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
    }

    @Then("It should display all categories")
    public void it_should_display_all_categories() {
        List<WebElement> elements = select.getOptions();
    }

    @Then("Student able to select any categories and search Books")
    public void student_able_to_select_any_categories_and_search_books(List<String> listOfCategories) {


        for (int i=1; i < listOfCategories.size(); i++) {

            BrowserUtils.waitForVisibility(booksPage.bookCategories,10);
            select.selectByIndex(i);
            if (i < 2) BrowserUtils.wait(4);
            else BrowserUtils.wait(1);
           // System.out.println(listOfCategories.get(i)+"*********" + booksPage.getBook.getText());
            Assert.assertTrue(listOfCategories.get(i).equals(booksPage.getBook.getText() ));
        }
    }
}
