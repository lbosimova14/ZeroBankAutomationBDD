#done
Feature:Purchase Foreign Currency

  Scenario:Available currencies
    Given user is on home page
    Then click signin button
    Then user is on login page
    Then user navigates to "Pay Bills" module
    Then the user accesses the "Purchase Foreign Currency" cash tab
    Then following currencies should be available
      |Select One|
      |Australia (dollar)|
      |Canada (dollar)|
      |Switzerland (franc)|
      |China (yuan)|
      |Denmark (krone)|
      |Eurozone (euro)|
      |Great Britain (pound)|
      |Hong Kong (dollar)   |
      |Japan (yen)|
      |Mexico (peso)|
      |Norway (krone)|
      |New Zealand (dollar)|
      |Sweden (krona)      |
      |Singapore (dollar)|
      |Thailand (baht)   |

  Scenario:Error message for not selecting currency
    Given user is on home page
    Then click signin button
    Then user is on login page
    Then user navigates to "Pay Bills" module
    Then the user accesses the "Purchase Foreign Currency" cash tab
    When user tries to calculate cost without selecting a currency
    Then  error message should be displayed

  @PurchaseForeignCurrency
  Scenario: Error message for not entering value
    Given user is on home page
    Then click signin button
    Then user is on login page
    Then user navigates to "Pay Bills" module
    Then the user accesses the "Purchase Foreign Currency" cash tab
    When user tries to calculate cost without entering a value
    Then error message should be displayed

#  User is on the home page
#  User clicked home page sign in button
#  User entered valid credential
#  User navigate to Pay Bills module
#  User is on the Pay Bills page
#  User clicked Purchase Foreign Currency tab
#  User tried to calculate cost without entering a value
#  Error message is displayed:
#  Please, ensure that you have filled all the required fields with valid values.
#  Test completed!

