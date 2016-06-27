package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

/**
 * Created by matttully on 21/06/2016.
 */

@ScenarioScoped
public class HomePageSteps {

    private final HomePage homePage;

    @Inject
    public HomePageSteps(HomePage homePage) {

        this.homePage = homePage;

    }

    @Given("^I am on the QAWorks Home Page$")
    public void getQAWorksHomePage() throws Throwable {

        homePage.getHomePage();

    }

}
