package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.WebDriverProvider;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class HomePage extends BasePage {

    private WebDriver webDriver;

    @FindBy(linkText = "Contact")
    WebElement contactLink;

    public HomePage(WebDriverProvider webDriver) throws Exception {

        this.webDriver = webDriver.getWebDriver();
        PageFactory.initElements(this.webDriver, this);
    }

    public void getHomePage() {

        this.webDriver.get("http://www.qaworks.com/");
    }

    public void clickContactLink() {

        contactLink.click();
    }
}
