package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {//done
       AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @Given("user verifies account types are displayed")
    public void user_verifies_account_types_are_displayed(List<String> dataTable) {

        Assert.assertEquals(dataTable,accountSummaryPage.getAccountTypes());
        System.out.println("Account types are: "+dataTable);

    }

    @Given("user verifies Credit Accounts table column names are displayed")
    public void user_verifies_Credit_Accounts_table_column_names_are_displayed(List<String> dataTable) {
        Assert.assertEquals(dataTable,accountSummaryPage.getColumn());
        System.out.println("Table column names are: "+dataTable);
    }




}
