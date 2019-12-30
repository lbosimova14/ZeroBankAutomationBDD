package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AccountActivityNavigationStepDefinitions {  //done
    AccountActivityPage accountActivityPage=new AccountActivityPage();
//clicks on "Savings
    @Given("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String string) {
        accountActivityPage.navigateTo(string);
        System.out.println("User clicked on "+string+" link");
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        WebElement dropdown = Driver.get().findElement(By.id("aa_accountId"));
        Select select =new Select(dropdown);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),string);
        System.out.println("Account drop down "+string+" is selected by default: "
                + select.getFirstSelectedOption().isDisplayed());
    }





}
