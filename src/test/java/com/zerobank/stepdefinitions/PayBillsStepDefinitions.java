package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.Map;


public class PayBillsStepDefinitions {//done

     PayBillsPage payBillsPage=new PayBillsPage();

    @Given("I am on pay bills page")
    public void i_am_on_pay_bills_page() {
        System.out.println("I am on the Pay Bills Page");
    }

    @Then("I entered valid data on the page")
    public void i_entered_valid_data_on_the_page(Map<String,String> dataTable) {
        System.out.println("User entered valid data");
        Select dropdownP = new Select(payBillsPage.payeeDropdown);
        dropdownP.selectByVisibleText(dataTable.get("Payee"));
        Select dropdownA = new Select(payBillsPage.accountDropdown);
        dropdownA.selectByVisibleText(dataTable.get("Account"));
        BrowserUtils.wait(2);
        payBillsPage.amountElement.sendKeys(dataTable.get("Amount"));
        BrowserUtils.wait(2);
        payBillsPage.dateElement.sendKeys(dataTable.get("Date"));
        payBillsPage.descriptionElement.sendKeys(dataTable.get("Description"));
        BrowserUtils.wait(2);
        payBillsPage.payButton.click();
    }


    @Then("User pay operation  successfully submitted")
    public void user_pay_operation_successfully_submitted() {
        System.out.println("User pay operation successfully submitted");
        String ExpectedMsg="The payment was successfully submitted.";
        BrowserUtils.waitForClickablility(payBillsPage.payButton,3);
        Assert.assertEquals(ExpectedMsg,payBillsPage.SuccessMsg.getText());
        System.out.println("Actual message is: "+payBillsPage.SuccessMsg.getText());
    }


    @Then("click {string} tab")
    public void click_tab(String string) {
        System.out.println("User clicked "+ string+" tab");
     payBillsPage.navigateTo(string);
    }


    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String>dataTable) {
        System.out.println("User entered information");
        BrowserUtils.waitForVisibility(payBillsPage.payeeName,5);
        payBillsPage.payeeName.sendKeys(dataTable.get("Payee Name"));
        payBillsPage.payeeAddress.sendKeys(dataTable.get("Payee Address"));
        payBillsPage.payeeAccount.sendKeys(dataTable.get("Account"));
        payBillsPage.payeeDetails.sendKeys(dataTable.get("Payee details"));
        BrowserUtils.wait(2);
        payBillsPage.newPayeeAddButton.click();


    }

    @Then("message The new payee The Law Offices of Hyde,Price & Scharks was successfully created. should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {
        System.out.println("User new payee successfully submitted");
        String ExpectedMsg="The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";
        Assert.assertEquals(ExpectedMsg,payBillsPage.newPayeeSuccessMsg.getText());
        System.out.println("Actual message is: "+payBillsPage.newPayeeSuccessMsg.getText());
    }

    @When("user tries to make a payment without entering the amount")
    public void user_tries_to_make_a_payment_without_entering_the_amount(Map<String,String> dataTable) {
        System.out.println("User tried to make payment without enterin amount");
        Select dropdownP = new Select(payBillsPage.payeeDropdown);
        dropdownP.selectByVisibleText(dataTable.get("Payee"));
        Select dropdownA = new Select(payBillsPage.accountDropdown);
        dropdownA.selectByVisibleText(dataTable.get("Account"));
        BrowserUtils.wait(2);
        payBillsPage.amountElement.sendKeys(dataTable.get("Amount"));
        BrowserUtils.wait(2);
        payBillsPage.dateElement.sendKeys(dataTable.get("Date"));
        payBillsPage.descriptionElement.sendKeys(dataTable.get("Description"));
        BrowserUtils.wait(2);
        payBillsPage.payButton.click();
    }

    @Then("Mandatory field error message should be displayed")
    public void mandatory_field_error_message_should_be_displayed() {
     //   String ErrorMessage= Driver.get().findElement(By.id("sp_amount")).getAttribute("validationMessage");
        String ErrorMessage="Please fill out this field message!";
        Assert.assertEquals(payBillsPage.amountElement.getAttribute("validationMessag"),ErrorMessage);
        System.out.println("Error message is:  "+payBillsPage.amountElement.getAttribute("validationMessag"));
    }











    }
