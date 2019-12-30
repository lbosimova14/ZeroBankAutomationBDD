package com.zerobank.pages;

;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayBillsPage extends BasePage {

    public PayBillsPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "sp_payee")
    public WebElement payeeDropdown;

    @FindBy (id = "sp_account")
    public WebElement accountDropdown;

    @FindBy(id = "sp_amount")
    public WebElement amountElement;

    @FindBy (id = "sp_date")
    public WebElement dateElement;

    @FindBy (id = "sp_description")
    public  WebElement descriptionElement;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;

   // @FindBy(xpath = "//span[contains(text(),'The payment was successfully submitted.')]")
    @FindBy(xpath = "//div[@id='alert_content']")
    public WebElement SuccessMsg;

    @FindBy (id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy (id = "np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy (id = "np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy (id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement newPayeeAddButton;

    @FindBy(id = "alert_content")
    public  WebElement newPayeeSuccessMsg;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropdown;

    @FindBy(id = "pc_amount")
    public WebElement pcAmount;

    @FindBy(id = "pc_calculate_costs")
    public WebElement pcCalculateCostButton;

    @FindBy(id = "pc_inDollars_true")
    public WebElement pc_inDollars;

    public List<String> getListOfRepeatsOptions() {
        Select select = new Select(currencyDropdown);
        return BrowserUtils.getListOfString(select.getOptions());
    }




}
