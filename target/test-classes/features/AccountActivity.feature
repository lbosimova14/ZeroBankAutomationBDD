#done
@account_Activity
Feature:  Account Activity
  Account Activity page should have the title Zero–Account activity.In the Account dropdown default option should be
  Savings. Account dropdown should have the following options:Savings, Checking, Loan, Credit Card, Brokerage.
  Transactions table should have column names Date, Description, Deposit,Withdrawal.
  Background: open login page and login with valid credentials
    Given user is on home page
    Then click signin button
    Then user is on login page
    Then user navigates to "Account Activity" module

  Scenario: Account Activity page should have the title Zero–Account activity.
    Given user verifies that "Zero - Account Activity" page should  be diplayed


  Scenario: Verify Account drop down default option should be Savings.
      Given user verifies Account drop down default option is "Savings"

  Scenario: Verify Transactions table should have column names
    Given user verifies Transactions table column names are displayed
      |Date|
      |Description|
      |Deposit   |
      |Withdrawal|

  Scenario:Verify account drop down options
    Given user verifies Account drop down options are displayed
      |Savings|
      |Checking|
      |Savings |
      |Loan|
      |Credit Card|
      |Brokerage   |