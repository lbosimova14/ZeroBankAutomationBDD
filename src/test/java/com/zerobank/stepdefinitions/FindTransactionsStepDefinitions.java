package com.zerobank.stepdefinitions;

import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindTransactionsStepDefinitions {//done

    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
    FindTransactionsPage findTransactionsPage=new FindTransactionsPage();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        findTransactionsPage.FindTransactinsTabElement.click();
        System.out.println("User clicked Find Transactions Tab");
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {
             findTransactionsPage.enterDate(string,string2);
        System.out.println("User entered date range from "+string+" to "+string2);
    }

    @When("clicks search")
    public void clicks_search() {
        BrowserUtils.waitForClickablility(findTransactionsPage.findButtonElement,3);
       findTransactionsPage.findButtonElement.click();
        System.out.println("User clicked search button");
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) {
        System.out.println("User able to see entered date on the result table:");
           findTransactionsPage. transactionDateResult(string,string2);
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        System.out.println("Result sorted most recent date");
        findTransactionsPage.SortedDate();

    }


    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        System.out.println("User is not able to see "+string+" on transactions table:");
            findTransactionsPage.NotContainTransactionsDated(string);
    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {
        wait.until(ExpectedConditions.visibilityOf(findTransactionsPage.descriptionElement));
        System.out.println("User entered "+string+" in description box");
            findTransactionsPage.descriptionElement.clear();
            findTransactionsPage.descriptionElement.sendKeys(string);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
        System.out.println("User see only entered description on the result table:");
        findTransactionsPage.transactionDescriptionResult(string);

    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {

    }


    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
        System.out.println("User can see following deposits under Deposit: ");
        wait.until(ExpectedConditions.visibilityOf(findTransactionsPage.DepositElement));
           findTransactionsPage.getTransactionDepositResult();

    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {

        System.out.println("User can see following withdrawals under Withdrawal: ");
        findTransactionsPage.getTransactionWithdrawalResult();

    }

    @When("user selects type {string}")
    public void user_selects_type(String string) {
        System.out.println("User selected " +string+" type");
        Select depositSelect = new Select(findTransactionsPage.DepositDropDown);
        depositSelect.selectByVisibleText(string);
          findTransactionsPage.findButtonElement.click();
        BrowserUtils.wait(3);


    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
          findTransactionsPage.getNoResultUnderWithrawal();
    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {
        findTransactionsPage.getNoResultUnderDeposit();
    }






}
