package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BooksPage extends BasePage{


    @FindBy(name = "tbl_books_length")
    public WebElement showRecordsDropdown;



}
