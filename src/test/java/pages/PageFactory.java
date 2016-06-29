package pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import support.WebDriverProvider;

import java.net.URL;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class PageFactory {

//    WebDriver webDriver;
//
//    @Inject
//    public PageFactory(WebDriverProvider webDriver) {
//
//        this.webDriver = webDriver;
//
//    }

    private static WebDriver webDriver = null;

    public static WebDriver getFireFoxWebDriver() {

        if (webDriver == null) {
            webDriver = new FirefoxDriver();
        }
        return webDriver;
    }

    public static WebDriver getIEWebDriver() {

        if (webDriver == null) {
            webDriver = new InternetExplorerDriver();
        }
        return webDriver;
    }

    public static WebDriver getChromeWebDriver() {

        if (webDriver == null) {
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    public static WebDriver getDriver() {

        return webDriver;
    }

    public static WebDriver getRemoteWebDriver() throws Exception {

        try {

            webDriver = new RemoteWebDriver(
                    new URL("http://localhost:4444/wd/hub"),
                    DesiredCapabilities.firefox());

        } catch (Exception e) {

        }
        return webDriver;
    }

    public static void tearDown() {

        System.out.println("**** In PageFactory tearDown ****");

        if (webDriver != null) {
            try {
                webDriver.manage().deleteAllCookies();
                System.out.println("**** In PageFactory tearDown - after deleteAllCookies ****");
            } catch (Exception e) {
                //TODO logging
                System.out.println("Exception: Unable to delete all coookies!");

            }
            try {
                webDriver.close();
                webDriver = null;
                System.out.println("**** In PageFactory tearDown - after webDriver.close ****");
                //webDriver.quit();
            } catch (Exception e) {
                //TODO logging
                System.out.println("Exception: Unable execute driver.quit");
            }
        }
    }
}
