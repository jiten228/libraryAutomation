package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]/a")
    public WebElement usersButton;

    @FindBy(xpath = "//*[@id=\"users\"]/div[1]/div[1]/span/a")
    public WebElement addUserButton;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(id = "user_group_id")
    public WebElement userGroup;

    @FindBy(id = "status")
    public WebElement status;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(xpath = "//div[@id='start_date']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@class='form-control'][5]")
    public WebElement endDate;

    @FindBy(xpath = "//button[@type='cancel']")
    public WebElement closeButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//*[@id=\"tbl_users\"]/tbody/tr[1]/td[1]/a")
    public WebElement editUserButton;

    @FindBy(xpath = "//*[@id=\"ajax\"]/div/div/div/script/text()")
    public WebElement userUpdatedMessage;








}
