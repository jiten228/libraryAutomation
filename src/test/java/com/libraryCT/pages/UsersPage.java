package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsersPage extends BasePage{

    @FindBy(className = "btn btn-lg btn-outline btn-primary btn-sm")
    public WebElement addUserButton;

    @FindBy(xpath = "//input[@class='form-control'][1]")
    public WebElement fullName;

    @FindBy(xpath = "//input[@class='form-control'][2]")
    public WebElement password;

    @FindBy(xpath = "//input[@class='form-control'][3]")
    public WebElement email;

    @FindBy(id = "user_group_id")
    public WebElement userGroup;

    @FindBy(id = "status")
    public WebElement status;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(xpath = "//input[@class='form-control'][4]")
    public WebElement startDate;

    @FindBy(xpath = "//input[@class='form-control'][5]")
    public WebElement endDate;

    @FindBy(xpath = "//button[@type='cancel']")
    public WebElement closeButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChangesButton;







}
