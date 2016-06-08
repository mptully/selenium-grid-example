$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Contact us page",
  "description": "\n  As an end user\n  I want a contact us page\n  So that I can find out more about QAWorks exciting services",
  "id": "contact-us-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2249380277,
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
  "duration": 151651791250,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.submitEmailMessage(String,String\u003e)"
});
formatter.result({
  "duration": 80156120421,
  "error_message": "java.lang.Exception: Element not found on page title: http://staging.qaworks.com:1403/ is not available and page url: data:text/html,chromewebdata\n\tat com.qaworks.test.framework.helpers.WaitHelper.waitForElement(WaitHelper.java:60)\n\tat com.qaworks.test.framework.pages.BasePage.getElement(BasePage.java:44)\n\tat com.qaworks.test.framework.pages.BasePage.clickElement(BasePage.java:55)\n\tat com.qaworks.test.ContactUsSteps.submitEmailMessage(ContactUsSteps.java:30)\n\tat ✽.Then I should be able to contact QAWorks with the following information(ContactUs.feature:9)\n",
  "status": "failed"
});
formatter.after({
  "duration": 99039591,
  "status": "passed"
});
formatter.before({
  "duration": 1476549643,
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
  "duration": 3655425445,
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
  "duration": 5097596522,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d51.0.2704.84)\n  (Driver info: chromedriver\u003d2.20.353124 (035346203162d32c80f1dce587c8154a1efa0c3b),platform\u003dMac OS X 10.11.4 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 3 milliseconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027MacBook-Pro\u0027, ip: \u0027192.168.0.15\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.4\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003d/var/folders/fs/kvnq0v1n5dzc5yj124pk9d6h0000gp/T/.org.chromium.Chromium.E5auL1}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d51.0.2704.84, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 3ad35990c5834759cf1e569993b1b7a2\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:320)\n\tat com.qaworks.test.framework.helpers.WaitHelper.waitForElement(WaitHelper.java:56)\n\tat com.qaworks.test.framework.pages.BasePage.getElement(BasePage.java:44)\n\tat com.qaworks.test.framework.pages.BasePage.clickElement(BasePage.java:55)\n\tat com.qaworks.test.ContactUsSteps.verifyContactTelephoneNumber(ContactUsSteps.java:47)\n\tat ✽.Then I should be able to view the contact telephone number Tel: +44 (0) 1923 800 885(ContactUs.feature:16)\n",
  "status": "failed"
});
formatter.after({
  "duration": 81626277,
  "status": "passed"
});
});