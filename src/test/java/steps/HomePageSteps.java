package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;

/**
 * Created by matttully on 21/06/2016.
 */

public class HomePageSteps {

    private final HomePage homePage;

    public HomePageSteps(HomePage homePage) {

        this.homePage = homePage;

    }

    @Given("^I am on the QAWorks Home Page$")
    public void getQAWorksHomePage() throws Throwable {

        homePage.getHomePage();

    }


    @Then("^I should be able to see the following tabs$")
    public void i_should_be_able_to_see_the_following_tabs(DataTable arg1) throws Throwable {

        String msg = "";

        switch (false) {
            case homePage.isAboutUsTabDisplayed():
                msg = "about us tab not displayed";
            case homePage.isHomeTabDisplayed():
                msg = "home tab not displayed";
        }
    }

}
