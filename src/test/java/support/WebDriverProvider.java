package support;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import config.Configuration;
import org.openqa.selenium.WebDriver;
import pages.PageFactory;

//import org.openqa.selenium.support.PageFactory;

/**
 * Created by matttully on 09/06/2016.
 */
@Singleton
public class WebDriverProvider implements Provider<WebDriver> {

    @Inject
    private Configuration config;

    private String browser = config.getBrowserType();

    public WebDriver get() {

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