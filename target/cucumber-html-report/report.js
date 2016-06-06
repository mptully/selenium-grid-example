$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Contact us page",
  "description": "\n  As an end user\n  I want a contact us page\n  So that I can find out more about QAWorks exciting services",
  "id": "contact-us-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1575713051,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Valid Submission",
  "description": "",
  "id": "contact-us-page;valid-submission",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the QAWorks Staging Site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should be able to contact QAWorks with the following information",
  "rows": [
    {
      "cells": [
        "name",
        "j.Bloggs        6"
      ],
      "line": 10
    },
    {
      "cells": [
        "email",
        "j.Bloggs@qaworks.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "message",
        "please contact me I want to find out more"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.getQAWorksStagingSite()"
});
formatter.result({
  "duration": 4031486945,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.submitEmailMessage(String,String\u003e)"
});
formatter.result({
  "duration": 1606935571,
  "status": "passed"
});
formatter.after({
  "duration": 135035519,
  "status": "passed"
});
formatter.before({
  "duration": 1305439924,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Contact telephone number displayed",
  "description": "",
  "id": "contact-us-page;contact-telephone-number-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on the QAWorks Staging Site",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I should be able to view the contact telephone number Tel: +44 (0) 1923 800 885",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.getQAWorksStagingSite()"
});
formatter.result({
  "duration": 2185925123,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tel: +44 (0) 1923 800 885",
      "offset": 54
    }
  ],
  "location": "ContactUsSteps.verifyContactTelephoneNumber(String)"
});
formatter.result({
  "duration": 1374647062,
  "status": "passed"
});
formatter.after({
  "duration": 103527997,
  "status": "passed"
});
});