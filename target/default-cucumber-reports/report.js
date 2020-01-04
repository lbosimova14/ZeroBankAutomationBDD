$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resourses/features/PayBills.feature");
formatter.feature({
  "name": "Pay Bills",
  "description": "  Account Activity page should have the title Zero–Pay Bills. When user completes a successful Pay operation,\n  \"The payment was successfully submitted\"should be displayed. When user tries to make a payment without entering the amount or date,\n  Please fill out this field message!should be displayed.Amount field should not accept alphabetical or special characters. Date field should\n  not accept alphabetical characters.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "When user tries to make a payment without entering the amount or date,",
  "description": "  Please fill out this field message!should be displayed.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PayBills"
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
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Pay Bills\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivityStepDefinitions.user_navigates_to_module(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to make a payment without entering the amount",
  "rows": [
    {
      "cells": [
        "Payee",
        "Apple"
      ]
    },
    {
      "cells": [
        "Account",
        "Savings"
      ]
    },
    {
      "cells": [
        "Amount",
        ""
      ]
    },
    {
      "cells": [
        "Date",
        "2019-12-31"
      ]
    },
    {
      "cells": [
        "Description",
        "Hello money"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "PayBillsStepDefinitions.user_tries_to_make_a_payment_without_entering_the_amount(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Mandatory field error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsStepDefinitions.mandatory_field_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});