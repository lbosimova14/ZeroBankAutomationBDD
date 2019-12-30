Feature: Login
  As user,I want to be able to login into zerobank
  Only authorized users should be able to login to the application

  @with_valid_credential
  Scenario:When user logs in with valid credentials,Account summary page should be displayed.
    Given user is on home page
    Then click signin button
    Then user is on login page
    And user verifies that "Zero - Account Summary" page should  be diplayed

  @negative_test
  Scenario: Users with wrong username should not be able to login.
      Given user is on home page
      Then click signin button
      And user enters "wrongUsername" username and "password" password
      And user verifies that "Login and/or password are wrong." message is displayed

  @negative_test
  Scenario: Users with  wrong password should not be able to login.
    Given user is on home page
    Then click signin button
    And user enters "username" username and "WrongPassword" password
    And user verifies that "Login and/or password are wrong." message is displayed
  @negative_test
  Scenario: Users with blank username should not be able to login.
    Given user is on home page
    Then click signin button
    And user enters "" username and "password" password
    And user verifies that "Login and/or password are wrong." message is displayed
  @negative_test
  Scenario: Users with blank password should not be able to login.
    Given user is on home page
    Then click signin button
    And user enters "username" username and " " password
    And user verifies that "Login and/or password are wrong." message is displayed



