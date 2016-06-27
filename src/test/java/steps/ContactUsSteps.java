package steps;

import com.google.inject.Inject;
import cucumber.runtime.java.guice.ScenarioScoped;
import pages.ContactPage;
import pages.HomePage;
import cucumber.api.java.en.Then;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

@ScenarioScoped
public class ContactUsSteps {

    private Map<String, String> emailDetails;

    private final ContactPage contactPage;

    private final HomePage homePage;


    @Inject
    public ContactUsSteps(HomePage homePage, ContactPage contactPage) {

        this.homePage = homePage;
        this.contactPage = contactPage;

    }

    @Then("^I am on the QAWorks Contact Page$")
    public void navigateToContactPage() throws Throwable {

        // open contacts page.
        homePage.getHomePage();
        homePage.clickContactLink();

    }


    @Then("^I should be able to contact QAWorks with the following information$")
    public void submitEmailMessage(Map<String, String> emailDetails) throws Throwable {

        // open contacts page.
        homePage.clickContactLink();

        // submit message
        this.emailDetails = emailDetails;
        contactPage.setNameField(emailDetails.get("name"));
        contactPage.setEmailFieldField(emailDetails.get("email"));
        contactPage.setMessageField(emailDetails.get("message"));
        contactPage.clickSendButton();

    }

    @Then("^I should be able to view the contact telephone number (.*)$")
    public void verifyContactTelephoneNumber(String telephoneNumber) throws Throwable {

        // get telephone number
        String displayedTelephoneNumber = contactPage.getTelephoneNumber();

        // compare with expected value
        assertTrue("Contact telephone number not displayed correctly. Expected = " + telephoneNumber + " Actual = "
                + displayedTelephoneNumber, telephoneNumber.equals(displayedTelephoneNumber));

    }
}