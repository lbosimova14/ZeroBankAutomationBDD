package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class AccountActivityStepDefinitions {
       LoginPage loginPage=new LoginPage();
       AccountActivityPage accountActivityPage=new AccountActivityPage();


    @Then("user navigates to {string} module")
    public void user_navigates_to_module(String string) {
        loginPage.navigateTo(string);
        System.out.println("User navigate to "+ string+" module");
        System.out.println("User is on the "+string+" page");

    }

    @Given("user verifies Account drop down default option is {string}")
    public void user_verifies_Account_drop_down_default_option_is(String string) {
        BrowserUtils.wait(3);
        Select select =new Select(accountActivityPage.selectAccountDropdown);
        select.selectByVisibleText(string);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),string);
        System.out.println("Account dropdown default option is: "+ select.getFirstSelectedOption().getText());

    }

    @Given("user verifies Account drop down options are displayed")
    public void user_verifies_Account_drop_down_options_are_displayed(List<String> dataTable) {
        Assert.assertEquals(dataTable,accountActivityPage.getDropDownOptions());
        BrowserUtils.wait(3);
        System.out.println("Account drop down options are: "+dataTable);

    }

    @Given("user verifies Transactions table column names are displayed")
    public void user_verifies_Transactions_table_column_names_are_displayed(List<String> dataTable) {
        Assert.assertEquals(dataTable,accountActivityPage.getTransactionsColumn());
        System.out.println(" Transactions table column names are: "+dataTable);

    }





}
