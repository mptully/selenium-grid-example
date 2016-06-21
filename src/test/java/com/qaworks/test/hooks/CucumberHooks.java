package com.qaworks.test.hooks;

import com.google.inject.Inject;
import com.qaworks.test.config.Configuration;
import com.qaworks.test.support.Webdriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class CucumberHooks {

    @Inject
    private Webdriver webdriver;

    @Before
    //@ScenarioScoped
    public void beforeScenario() throws Exception {

        Configuration config = Configuration.getConfiguration();

        String browser = config.getBrowserType();

        WebDriver driver = null;

        if (config.getIsGridRun()) {

            driver = webdriver.getRemoteWebDriver();

        } else {

            if (browser.equals("chrome")) {
                driver = webdriver.getChromeDriver();

            } else if (browser.equals("firefox")) {
                //driver = webdriver.getFireFoxDriver();

            } else if (browser.equals("internetexplorer")) {
                //driver = webdriver.getInternetExploerDriver();

            } else {
                throw new Exception();
            }
            //maximise window
            driver.manage().window().maximize();
        }
    }

    @After
    //@ScenarioScoped
    public void tearDown() throws Exception {

        webdriver.tearDown();

    }

}
