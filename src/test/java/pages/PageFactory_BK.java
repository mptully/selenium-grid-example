package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class PageFactory_BK {

    private static WebDriver webDriver = null;

    public static WebDriver getFireFoxDriver() {

        if (webDriver == null) {

            webDriver = new FirefoxDriver();

        }

        return webDriver;
    }

    public static WebDriver getChromeDriver() {

        if (webDriver == null) {

            webDriver = new ChromeDriver();

        }

        return webDriver;
    }

    public static WebDriver getDriver() {

        return webDriver;
    }

    public static WebDriver getRemoteWebDriver() throws Exception {

        webDriver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        return webDriver;

    }

    public static void tearDown() {
        if (webDriver != null) {
            try {
                webDriver.manage().deleteAllCookies();
            } catch (Exception e) {
                //TODO logging
                System.out.println("Exception: Unable to delete all coookies!");

            }
            try {
                webDriver.close();
                //webDriver.quit();
            } catch (Exception e) {
                //TODO logging
                System.out.println("Exception: Unable execute driver.quit");
            }
        }
    }


}
