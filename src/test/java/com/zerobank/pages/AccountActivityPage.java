package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountActivityPage extends  BasePage {

//    @FindBy(id = "aa_accountId")
//     public WebElement DropDownOptions;

    @FindBy(xpath = "//*[@id='all_transactions_for_account']/table/thead/tr/th")
    public  List<WebElement> TransactionsColumnName;

    @FindBy(id = "aa_accountId")
    public  WebElement selectAccountDropdown;



    public List<String> getDropDownOptions() {
        Select select = new Select(selectAccountDropdown);
        List<WebElement> list = select.getOptions();
       return BrowserUtils.getListOfString(list);
    }

    public List<String> getTransactionsColumn() {

        return BrowserUtils.getListOfString(TransactionsColumnName);
    }


    public void clickLink(String LinkName) {
        String LinkLocator="//a[contains(text(),'"+LinkName+"')]";
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        WebElement link = Driver.get().findElement(By.xpath(LinkLocator));
        link.click();

    }

}
