package support;

import config.Configuration;
import org.openqa.selenium.WebDriver;
import pages.PageFactory;

/**
 * Created by matttully on 09/06/2016.
 */
public class WebDriverProvider {

    private Configuration config;

    private String browser = "";

    public WebDriverProvider(Configuration config) {

        this.config = config;
    }

    public WebDriver getWebDriver() {

        browser = config.getBrowserType();

        try {
            if (config.getIsGridRun()) {
                return PageFactory.getRemoteWebDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                return PageFactory.getIEWebDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                return PageFactory.getChromeWebDriver();
            } else {
                return PageFactory.getFireFoxWebDriver();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}