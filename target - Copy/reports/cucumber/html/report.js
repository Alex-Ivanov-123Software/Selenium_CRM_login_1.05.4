$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CRMLoginPage.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "User wants to be logged in CRM System use and make operations in account page",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CRMLoginPage"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "user decides to login having e-mail and password",
  "description": "",
  "id": ";user-decides-to-login-having-e-mail-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@possitive"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user logins entering email as \u003cemail\u003e and password as \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should see MyAccountPage",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": ";user-decides-to-login-having-e-mail-and-password;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 13,
      "id": ";user-decides-to-login-having-e-mail-and-password;;1"
    },
    {
      "cells": [
        "alexanderiv@123software.ru",
        "123software.ru"
      ],
      "line": 14,
      "id": ";user-decides-to-login-having-e-mail-and-password;;2"
    },
    {
      "cells": [
        "alexanderiv@123software.ru",
        "123software.ru"
      ],
      "line": 15,
      "id": ";user-decides-to-login-having-e-mail-and-password;;3"
    },
    {
      "cells": [
        "alexanderiv@123software.ru",
        "123software.ru"
      ],
      "line": 16,
      "id": ";user-decides-to-login-having-e-mail-and-password;;4"
    },
    {
      "cells": [
        "alexanderiv@123software.ru",
        "123software.ru"
      ],
      "line": 17,
      "id": ";user-decides-to-login-having-e-mail-and-password;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4195400746,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the user is on CRMLoginPage",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "CRMLoginPage",
      "offset": 15
    }
  ],
  "location": "Given_Steps.theUserIsOnPage(String)"
});
formatter.result({
  "duration": 7078861988,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "user decides to login having e-mail and password",
  "description": "",
  "id": ";user-decides-to-login-having-e-mail-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@CRMLoginPage"
    },
    {
      "line": 8,
      "name": "@possitive"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user logins entering email as alexanderiv@123software.ru and password as 123software.ru",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should see MyAccountPage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "alexanderiv@123software.ru",
      "offset": 30
    },
    {
      "val": "123software.ru",
      "offset": 73
    }
  ],
  "location": "When_Steps.user_logins_in_CRM_having_email_and_passsword(String,String)"
});
formatter.result({
  "duration": 3805830921,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyAccountPage",
      "offset": 16
    }
  ],
  "location": "Then_Steps.user_Should_See(String)"
});
formatter.result({
  "duration": 2366698,
  "status": "passed"
});
formatter.after({
  "duration": 653408976,
  "status": "passed"
});
formatter.before({
  "duration": 2883108605,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "the user is on CRMLoginPage",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "CRMLoginPage",
      "offset": 15
    }
  ],
  "location": "Given_Steps.theUserIsOnPage(String)"
});
