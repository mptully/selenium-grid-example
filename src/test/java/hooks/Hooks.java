package hooks;

import config.Configuration;
import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.PageFactory_BK;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.MyWebDriver;

import javax.inject.Inject;

//import org.junit.Before;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class Hooks {

    private final EventFiringWebDriver webDriver;

    @Inject
    public Hooks(MyWebDriver webDriver) {

        System.out.println("**** In hooks constructor ****");
        this.webDriver = webDriver;


    }

    @Before
    public void beforeScenario() throws Exception {

        System.out.println("**** In before hooks - Hooks class ****");

        Configuration config = Configuration.getConfiguration();

        String browser = config.getBrowserType();


        //WebDriver driver = null;

//        if (config.getIsGridRun()) {
//
//            webDriver = PageFactory.getRemoteWebDriver();
//
//        } else {
//
//            if (browser.equals("chrome")) {
//                webDriver = PageFactory.getChromeDriver();
//
//            } else if (browser.equals("firefox")) {
//                webDriver = PageFactory.getFireFoxDriver();
//
//            } else if (browser.equals("internetexplorer")) {
//                driver = PageFactory.getInternetExploerDriver();
//
//            } else {
//                throw new Exception();
//            }
//            maximise window
//            driver.manage().window().maximize();
//        }
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {

        System.out.println("**** In after hooks - Hooks class ****");

        try {
            byte[] screenshot = webDriver.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        } finally {
            PageFactory_BK.tearDown();
        }
    }

}
