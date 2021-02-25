package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BasePage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy(xpath = "//li[@class='nav-item']")
    public List<WebElement> dashboard1;





}
