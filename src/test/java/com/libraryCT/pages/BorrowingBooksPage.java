package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BorrowingBooksPage extends BasePage{

   // public BorrowingBooksPage(){
       // PageFactory.initElements(Driver.getDriver(), this);
   // }
   // @FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]/a/span[1]")
   // public WebElement borrowingBooksLink;
   // @FindBy(xpath = "//*[@id=\"borrowed_list\"]/thead/tr")
    //public List<WebElement> actualBorrowingLinks;
    //@FindBy(xpath = "//table[@id='borrowed_list']//tr/th")
   // public List<WebElement> borrowingBooksColumnNames;




     @FindBy(xpath = "//*[@id=\"borrowing-books\"]/div[1]/div[1]/h3")
     public WebElement borrowingBook;

    @FindBy(xpath = "//th")
    public List <WebElement> tableHeaders;

    @FindBy(xpath ="//*[@id=\"borrowed_list\"]/thead/tr/th[1]")
    public  WebElement Action;

    @FindBy(xpath =" //*[@id=\"borrowed_list\"]/thead/tr/th[2]")
    public WebElement BookName;

   @FindBy(xpath ="//*[@id=\"borrowed_list\"]/thead/tr/th[3]")
    public WebElement BorrowedData;

    @FindBy(xpath = "//*[@id=\"borrowed_list\"]/thead/tr/th[4]")
    public WebElement PlannedReturnedData;

    @FindBy(xpath = "//*[@id=\"borrowed_list\"]/thead/tr/th[5]")
    public WebElement ReturnData;

    @FindBy(xpath = "//*[@id=\"borrowed_list\"]/thead/tr/th[6]")
    public WebElement IsReturned;


    }


