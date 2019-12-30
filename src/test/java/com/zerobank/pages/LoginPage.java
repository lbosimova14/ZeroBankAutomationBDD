package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  extends BasePage {
    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    @FindBy(id = "user_login")
    public WebElement usernameElement;

    @FindBy(id = "user_password")
    public WebElement passwordElement;

    @FindBy(name = "submit")
    public WebElement signInButton;

    @FindBy(css = "[class='alert alert-error']")
    public WebElement warningMessage;

    @FindBy(id = "signin_button")
    public WebElement HomePageSignInButton;

    @FindBy(xpath = "//h3[text()='Log in to ZeroBank']")
    public WebElement pageHeader;


    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    /**
     * @param userName
     * @param password
     */
    public void login(String userName, String password) {
        wait.until(ExpectedConditions.visibilityOf(pageHeader));
        usernameElement.clear();
        usernameElement.sendKeys(userName);

      //  BrowserUtils.wait(2);
        passwordElement.clear();
       // wait.until(ExpectedConditions.textToBePresentInElement(passwordElement,password));
        passwordElement.sendKeys(password, Keys.ENTER);
       // BrowserUtils.wait(3);
    }


}