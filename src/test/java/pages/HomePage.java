package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) throws Exception {
        super(driver, "HomePage");

    }

    public void navigate() {
        this.driver.get("http://staging.qaworks.com:1403/");
    }
}
