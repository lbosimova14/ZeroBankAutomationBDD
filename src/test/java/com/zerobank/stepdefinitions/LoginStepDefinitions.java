package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class LoginStepDefinitions {

  LoginPage loginPage=new LoginPage();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("User is on the home page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("click signin button")
    public void click_signin_button() {
        System.out.println("User clicked home page sign in button");
       loginPage.HomePageSignInButton.click();
    }

    @Then("user is on login page")
    public void user_is_on_login_page() {
        String Username=ConfigurationReader.getProperty("username");
        String Password=ConfigurationReader.getProperty("password");
        loginPage.login(Username,Password);
        System.out.println("User entered valid credential");

    }

    @Then("user verifies that {string} page should  be diplayed")
    public void user_verifies_that_page_should_be_diplayed(String string) {
        Assert.assertEquals(Driver.get().getTitle(),string);
        System.out.println("Test Pass: User verified page subtitle: "+ string);
    }

    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        loginPage.login(string,string2);
        System.out.println("Login with "+string+" username and "+string2+" password.");



    }
     //warning message:Login and/or password are wrong.
    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {

        Assert.assertEquals(loginPage.warningMessage.getText(),string);
        System.out.println("Verified that warning message is displayed: "+string);
    }


}
