package com.libraryCT.pages;


import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class BooksPage extends BasePage{


    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "book_categories")
    public WebElement bookCategories;

    @FindBy(xpath = "//table[@id='tbl_books']/tbody/tr/td[5]")
    public List<WebElement> getBookCategories;

    @FindBy(xpath = "//*[@id=\"tbl_books\"]/tbody/tr[1]/td[5]")
    public WebElement getBook;


    @FindBy(name = "tbl_books_length")
    public WebElement showRecordsDropdown;

    @FindBy(xpath = "//th")
    public List<WebElement>  tableHeaders;

    @FindBy(xpath = "//a[.=' Edit Book']")
    public List<WebElement> editBookButton;




}
