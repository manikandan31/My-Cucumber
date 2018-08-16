$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/mani/workspace/CucumberProject/src/main/java/Features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionalty of CRM",
  "description": "",
  "id": "login-functionalty-of-crm",
  "keyword": "Feature"
});
formatter.before({
  "duration": 51696272642,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "login-functionalty-of-crm;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_loginpage()"
});
formatter.result({
  "duration": 12623560644,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2594681403,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 9031370760,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_homepage()"
});
formatter.result({
  "duration": 173497,
  "status": "passed"
});
formatter.after({
  "duration": 16020554791,
  "status": "passed"
});
});