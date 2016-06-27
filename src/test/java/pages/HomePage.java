package pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.MyWebDriver;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class HomePage {

    WebDriver webDriver;



    @FindBy(linkText="Contact")
    WebElement contactLink;

    @Inject
    public HomePage(MyWebDriver webDriver) throws Exception {

        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);

    }

    public void getHomePage() {

        this.webDriver.get("http://www.qaworks.com/");
    }

    public void clickContactLink() {

        contactLink.click();
    }
}
