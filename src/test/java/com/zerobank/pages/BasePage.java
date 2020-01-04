package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    /**
     * This method stands for navigation zerobank app
     * provide tab name, for example "Account Summary" as a String
     * then based on these value, locator will be created
     * <li id="account_summary_tab" class="active">
     *     <a href="/bank/redirect.html?url=account-summary.html">Account Summary</a></li>
     *   //tagName[contains(text(),'part of the visible text')]
     *  @param moduleName
     */
    public void navigateTo(String moduleName) {
        String moduleLocator="//a[contains(text(),'"+moduleName+"')]";
        //String moduleLocator = "//*[normalize-space()='"+moduleName+"' and @id='account_activity_tab']";
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
        module.click();

    }

}
