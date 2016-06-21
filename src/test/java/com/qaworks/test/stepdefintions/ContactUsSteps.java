package com.qaworks.test.stepdefintions;

import com.google.inject.Inject;
import com.qaworks.test.pages.ContactPage;
import com.qaworks.test.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;

import java.util.Map;

import static org.junit.Assert.assertTrue;

@ScenarioScoped
public class ContactUsSteps {

    private HomePage homePage;

    private ContactPage contactPage;

    private Map<String, String> emailDetails;

    @Inject
    public ContactUsSteps(HomePage homePage, ContactPage contactPage) {
        this.homePage = homePage;
        this.contactPage = contactPage;
    }

    @Given("^I am on the QAWorks Staging Site$")
    public void getQAWorksStagingSite() throws Throwable {

        homePage.navigate();
    }

    @Then("^I should be able to contact QAWorks with the following information$")
    public void submitEmailMessage(Map<String, String> emailDetails) throws Throwable {

        // open contacts page.
        homePage.clickElement("ContactLink");

        // submit message
        this.emailDetails = emailDetails;
        contactPage.setInputFieldWithText("nameField", emailDetails.get("name"));
        contactPage.setInputFieldWithText("emailField", emailDetails.get("email"));
        contactPage.setInputFieldWithText("messageField", emailDetails.get("message"));
        contactPage.clickElement("sendButton");

    }

    @Then("^I should be able to view the contact telephone number (.*)$")
    public void verifyContactTelephoneNumber(String telephoneNumber) throws Throwable {

        homePage.clickElement("ContactLink");

        // get telephone number
        String displayedTelephoneNumber = contactPage.getTelephoneNumber();

        // compare with expected value
        assertTrue("Contact telephone number not displayed correctly. Expected = " + telephoneNumber + " Actual = " + displayedTelephoneNumber, telephoneNumber.equals(displayedTelephoneNumber));

    }
}