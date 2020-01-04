$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resourses/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user,I want to be able to login into zerobank\n  Only authorized users should be able to login to the application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Users with wrong username should not be able to login.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative_test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"wrongUsername\" username and \"password\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Login and/or password are wrong.\" message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_message_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Users with  wrong password should not be able to login.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative_test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"username\" username and \"WrongPassword\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Login and/or password are wrong.\" message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_message_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Users with blank username should not be able to login.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative_test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"\" username and \"password\" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Login and/or password are wrong.\" message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_message_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Users with blank password should not be able to login.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative_test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"username\" username and \" \" password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Login and/or password are wrong.\" message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_message_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});