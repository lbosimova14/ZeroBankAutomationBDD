
Feature:Add new payee under pay bills
  @addNewPayee
  Scenario:Add a new payee
    Given user is on home page
    And click signin button
    Then user is on login page
    And user navigates to "Pay Bills" module
    And click "Add New Payee" tab
    And creates new payee using following information
    |Payee Name   |The Law Offices of Hyde, Price & Scharks|
    |Payee Address|100 Same st, Anytown, USA, 10001|
    |Account      |Checking|
    |Payee details|XYZ account|
  Then message The new payee The Law Offices of Hyde,Price & Scharks was successfully created. should be displayed

#  User is on the home page
#  User clicked home page sign in button
#  User entered valid credential
#  User navigate to Pay Bills module
#  User is on the Pay Bills page
#  User clicked Add New Payee tab
#  User entered information
#  User new payee successfully submitted
#  Actual message is: The new payee The Law Offices of Hyde, Price & Scharks was successfully created.
#  Test completed!
###############################


