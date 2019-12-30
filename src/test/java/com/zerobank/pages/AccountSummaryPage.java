package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {//done

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "//div[3]/div/table/thead/tr/th")
    public List<WebElement> columnName;


    public List<String> getAccountTypes() {
        return BrowserUtils.getListOfString(accountTypes);
    }

    public List<String> getColumn() {
        return BrowserUtils.getListOfString(columnName);
    }


}
