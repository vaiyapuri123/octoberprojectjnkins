$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "To validate login funtionality in adactin",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinitionClass.user_is_on_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify both valid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@unit"
    }
  ]
});
formatter.step({
  "name": "User enter the  valid Username and valid Password",
  "rows": [
    {
      "cells": [
        "Vaiyapuri12",
        "7708993200"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinitionClass.user_enter_the_valid_Username_and_valid_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is click  on login both valid",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinitionClass.user_is_click_on_login_both_valid()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});