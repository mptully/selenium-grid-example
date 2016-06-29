package steps;

import cucumber.api.java.en.Given;
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

}
