package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class FindTransactionsPage  extends BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
    @FindBy(linkText = "Find Transactions")
    public WebElement FindTransactinsTabElement;

    @FindBy(id = "aa_fromDate")
    public WebElement fromDateElement;

    @FindBy(id = "aa_toDate")
    public WebElement toDateElement;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findButtonElement;
    ////*[@id="filtered_transactions_for_account"]/table/tbody/tr
    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]")
    public List<WebElement> transactionDateResultElement;

    @FindBy(id = "aa_description")
    public WebElement descriptionElement;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[2]")
    public List<WebElement> transactionDescriptionResultElement;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[3]")
    public List<WebElement> DepositResultElements;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[3]")
    public WebElement DepositElement;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[4]")
    public List<WebElement> WithdrawalResultElements;

    @FindBy(id = "aa_type")
    public WebElement DepositDropDown;

    @FindBy(xpath = "//div[contains(text(),'No results.')]")
    public WebElement noResultMsgElement;






    public FindTransactionsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void enterDate(String str, String str2) {
        wait.until(ExpectedConditions.visibilityOf(fromDateElement));
        fromDateElement.clear();
        fromDateElement.sendKeys(str, Keys.ENTER);
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(toDateElement));
        toDateElement.clear();
        toDateElement.sendKeys(str2, Keys.ENTER);
        BrowserUtils.wait(2);
    }



    public void transactionDateResult(String str, String str2) {
      // wait.until(ExpectedConditions.visibilityOf(tableElement));
      //  wait.until(ExpectedConditions.visibilityOf(dateResultElement));
     //  BrowserUtils.waitForStaleElement(dateResultElement);
       BrowserUtils.wait(3);
        for (WebElement each : transactionDateResultElement) {
            if (each.getText().contains(str) || each.getText().contains(str2)) {
                System.out.println(" table contained this entered date: " + each.getText());
            }
        }
    }

        public void SortedDate() {
            for (WebElement each : transactionDateResultElement) {
                System.out.print(each.getText() + " / ");
            }
            System.out.println("results table showed these transactions dates: ");
        }

        public void NotContainTransactionsDated(String str) {
            for (WebElement each : transactionDateResultElement) {
                if (!each.getText().contains(str)) {
                    System.out.println(str + " is not equal to " + each.getText() + " " + (!str.equals(each.getText())));
                }
            }
        }
    public void transactionDescriptionResult(String str) {

        BrowserUtils.wait(3);
        for (WebElement each : transactionDescriptionResultElement) {
            if (each.getText().contains(str)) {
                System.out.println(" table contained these entered description: " + each.getText());
            }else{
                System.out.println("invalid");
            }
        }

    }

    public void getTransactionDepositResult(){

        for(int i=0;i<=DepositResultElements.size()-1;i++){
            System.out.println(DepositResultElements.get(i).getText()+" deposit available  ");
          //  System.out.print(transactionDepositResultElement.get(i).getText().isEmpty());

        }
    }

    public void getTransactionWithdrawalResult(){
        for(int i=0;i<=WithdrawalResultElements.size()-1;i++){
            System.out.println(WithdrawalResultElements.get(i).getText()+" withdrawal available  ");
            //  System.out.print(transactionDepositResultElement.get(i).getText().isEmpty());
        }

    }
    public void getNoResultUnderDeposit(){
        for(int i=0;i<=DepositResultElements.size()-1;i++){

            Assert.assertNotEquals(WithdrawalResultElements.get(i).getText(),DepositResultElements.get(i).getText());
            System.out.println("Deposit result: "+DepositResultElements.get(i).getText()+
                    " is not  equal "+ WithdrawalResultElements.get(i).getText()+!DepositResultElements.get(i).getText().equals(WithdrawalResultElements.get(i).getText()));


        }
    }
    public void getNoResultUnderWithrawal(){
        for(int i=0;i<=DepositResultElements.size()-1;i++){
            //  System.out.println(DepositResultElements.get(i).getText()+" deposit available  ");
            //  System.out.print(transactionDepositResultElement.get(i).getText().isEmpty());
            Assert.assertNotEquals(WithdrawalResultElements.get(i).getText(),DepositResultElements.get(i).getText());
            System.out.println("Withdrawal result: "+WithdrawalResultElements.get(i).getText()+
                    " is not  equal: "+ DepositResultElements.get(i).getText()+ !WithdrawalResultElements.get(i).getText().equals( DepositResultElements.get(i).getText()));


        }
    }





















    }








