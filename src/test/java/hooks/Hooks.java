package hooks;

import config.Configuration;
import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.Augmenter;
import pages.PageFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.WebDriverProvider;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class Hooks {

    private WebDriver webDriver;

    public Hooks(WebDriverProvider webDriver) {

        System.out.println("**** In hooks constructor ****");
        this.webDriver = webDriver.getWebDriver();

    }

    @Before
    public void beforeScenario() throws Exception {

        System.out.println("**** In before hooks - Hooks class ****");
        Configuration config = Configuration.getConfiguration();
        //maximise window
        webDriver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {

        System.out.println("**** In after hooks - Hooks class ****");

        try {
            byte[] screenshot;
            if(false /*Remote Driver flow*/) { //Get Screen shot from remote driver
                Augmenter augmenter = new Augmenter();
                TakesScreenshot ts = (TakesScreenshot) augmenter.augment(webDriver);
                screenshot = ts.getScreenshotAs(OutputType.BYTES);
            } else { //get screen shot from local driver
                //local webdriver user flow
                screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            }
            //byte[] screenshot = webDriver.getScreenshotAs(OutputType.BYTES);
            //System.out.println("**** In after hooks - screenshot ****");
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.out.println("**** In after hooks - WebDriverException ****");
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        } finally {
            System.out.println("**** In after hooks - finally - PageFactory_BK.tearDown() ****");
            PageFactory.tearDown();
        }
    }

}
