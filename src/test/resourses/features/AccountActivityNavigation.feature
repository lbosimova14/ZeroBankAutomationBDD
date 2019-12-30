@AccountActivityNavigation
Feature:
  Navigating to specific accounts in Accounts Activity
  Background: open login page and login with valid credentials
    Given user is on home page
    Then click signin button
    Then user is on login page

  Scenario: Savings account redirect
     Given the user clicks on "Savings" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" page should  be diplayed
    And Account drop down should have "Savings" selected

  Scenario: Brokerage account redirect
    Given the user clicks on "Brokerage" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" page should  be diplayed
   And Account drop down should have "Brokerage" selected

  Scenario: Checking account redirect
    Given the user clicks on "Checking" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" page should  be diplayed
   And Account drop down should have "Checking" selected

  Scenario: Credit Card account redirect
  Given the user clicks on "Credit Card" link on the Account Summary page
    Then user verifies that "Zero - Account Activity" page should  be diplayed
    And Account drop down should have "Credit Card" selected

  Scenario: Loan account redirect
  Given the user clicks on "Loan" link on the Account Summary page
  Then user verifies that "Zero - Account Activity" page should  be diplayed
  And Account drop down should have "Loan" selected