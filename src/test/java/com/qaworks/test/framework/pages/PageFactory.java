package com.qaworks.test.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class PageFactory {

    private static WebDriver driver = null;

    /**
     *
     */
    public static HomePage getHomePage() throws Exception {
        HomePage homePage = new HomePage(getDriver());

        return homePage;
    }

    /**
     *
     */
    public static ContactPage getContactPage() throws Exception {
        ContactPage contactPage = new ContactPage(getDriver());

        return contactPage;
    }


    public static WebDriver getFireFoxDriver() {
        driver = new FirefoxDriver();

        return driver;
    }

    public static WebDriver getChromeDriver() {

        //System.setProperty("webdriver.chrome.driver", "//Users//matttully//dev//drivers//chromedriver.exe");
        driver = new ChromeDriver();

        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void tearDown() {
        if (driver != null) {
            try {
                driver.manage().deleteAllCookies();
            } catch (Exception e){
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
