package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserGroupPage {
    public UserGroupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Users']")
    public static WebElement usersCategory;

    @FindBy(id = "user_groups")
    public static WebElement userGroupsDropdown;

//    @FindBy()
//    public WebElement allDropDown;



}
