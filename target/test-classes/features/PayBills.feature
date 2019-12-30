
Feature: Pay Bills
  Account Activity page should have the title Zero–Pay Bills. When user completes a successful Pay operation,
  "The payment was successfully submitted"should be displayed. When user tries to make a payment without entering the amount or date,
  Please fill out this field message!should be displayed.Amount field should not accept alphabetical or special characters. Date field should
  not accept alphabetical characters.


  Scenario: Pay Bills page should have the title Zero–Pay Bills
    Given user is on home page
    Then click signin button
    Then user is on login page
    Then user navigates to "Pay Bills" module
    Then user verifies that "Zero - Pay Bills" page should  be diplayed
  @PayBills
    Scenario: Verify user completes a successful Pay operation
      Given user is on home page
      Then click signin button
      Then user is on login page
      Then user navigates to "Pay Bills" module
      Then  I entered valid data on the page
        |Payee   |Apple         |
        |Account |Savings       |
        |Amount  |50            |
        |Date    |2019-12-31    |
        |Description|Hello money|
      Then User pay operation  successfully submitted

#  User is on the home page
#  User clicked home page sign in button
#  User entered valid credential
#  User navigate to Pay Bills module
#  User is on the Pay Bills page
#  User entered valid data
#  User pay operation successfully submitted
#  Actual message is: The payment was successfully submitted.
#  Test completed!