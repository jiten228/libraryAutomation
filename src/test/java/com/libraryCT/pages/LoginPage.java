package com.libraryCT.pages;

import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement username;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement submitButton;

    //login as a Librarian  where we can pass data from configuration.properties
    public void login_As_A_Librarian(){
        username.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
        password.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        submitButton.click();
    }

    //login as a Student  where we can pass data from configuration.properties
    public void login_As_A_Student(){
        username.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
        password.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        submitButton.click();
    }

}
