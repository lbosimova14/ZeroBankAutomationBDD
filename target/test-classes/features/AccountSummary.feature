@account_summary
Feature: Account summary
  Account summary page should have the title Zero–Account summary.Account summary page should have to following account types:
  Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts.Credit Accounts table must have columns
  Account, Credit Card and Balance.
Background: open login page and login with valid credentials
  Given user is on home page
  Then click signin button
  Then user is on login page

  Scenario: Account summary page should have the title Zero–Account summary.
  Given user verifies that "Zero - Account Summary" page should  be diplayed

  Scenario:Verify account types
  Given user verifies account types are displayed
    |Cash Accounts|
    |Investment Accounts|
    |Credit Accounts    |
    |Loan Accounts      |

    Scenario: Verify Credit Accounts tables column
      Given user verifies Credit Accounts table column names are displayed
      |Account|
      |Credit Card|
      |Balance    |
