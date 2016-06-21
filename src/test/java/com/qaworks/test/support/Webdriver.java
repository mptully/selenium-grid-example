package com.qaworks.test.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by matttully on 09/06/2016.
 */
public class Webdriver {

    public Webdriver() {
        super(new FirefoxDriver());
    }

//    @Inject
    private static WebDriver driver = null;

    public static WebDriver getFireFoxDriver() {
        driver = new FirefoxDriver();

        return driver;
    }

//    @Inject
    public static WebDriver getChromeDriver() {

        //System.setProperty("webdriver.chrome.driver", "/Users/matttully/dev/drivers/chromedriver.exe");
        System.out.println("System.getProperties() = " + System.getProperties());

        driver = new ChromeDriver();

        return driver;
    }
//    @Inject
    public static WebDriver getDriver() {

        return driver;
    }
//    @Inject
    public static WebDriver getRemoteWebDriver() throws Exception {

        driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.firefox());

        return driver;

    }
//    @Inject
    public static void tearDown() {
        if (driver != null) {
            try {
                driver.manage().deleteAllCookies();
            } catch (Exception e) {
                //TODO logging
                System.out.println("Exception: Unable to delete all coookies!");

            }
            try {
                driver.quit();
            } catch (Exception e) {
                //TODO logging
                System.out.println("Exception: Unable execute driver.quit");
            }
        }
    }
}