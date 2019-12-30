package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class PurchaseForeignCurrencyStepDefinitions {

              PayBillsPage payBillsPage=new PayBillsPage();

    @Given("the user accesses the {string} cash tab")
    public void the_user_accesses_the_cash_tab(String string) {
        System.out.println("User clicked "+ string+" tab");
        payBillsPage.navigateTo(string);

    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> dataTable) {
        Assert.assertEquals(dataTable, payBillsPage.getListOfRepeatsOptions());
        System.out.println("User can see following currency availability: "+payBillsPage.getListOfRepeatsOptions());

    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        System.out.println("User tried to calculate cost without selecting a currency");
        BrowserUtils.wait(3);
        payBillsPage.pcAmount.sendKeys("100");
        payBillsPage.pc_inDollars.click();
        payBillsPage.pcCalculateCostButton.click();


    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        System.out.println("Error message is displayed:");
       BrowserUtils.wait(2);
        Alert alert = Driver.get().switchTo().alert();
        String ExpectedErrorMsg="Please, ensure that you have filled all the required fields with valid values.";
        Assert.assertEquals(alert.getText(),ExpectedErrorMsg);
        System.out.println(alert.getText());

    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        System.out.println("User tried to calculate cost without entering a value   ");
        BrowserUtils.wait(3);
        Select select = new Select(payBillsPage.currencyDropdown);
        select.selectByIndex(4);
        BrowserUtils.wait(3);
        payBillsPage.pcAmount.sendKeys("");
        payBillsPage.pc_inDollars.click();
        payBillsPage.pcCalculateCostButton.click();
    }




}
