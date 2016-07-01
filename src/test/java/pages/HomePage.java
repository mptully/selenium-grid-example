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

    @FindBy(linkText = "Home")
    WebElement homeTab;

    @FindBy(linkText = "Services")
    WebElement servicesTab;

    @FindBy(linkText = "Works")
    WebElement worksTab;

    @FindBy(linkText = "Technology")
    WebElement technologyTab;

    @FindBy(linkText = "Prices")
    WebElement pricesTab;

    @FindBy(linkText = "News")
    WebElement newsTab;

    @FindBy(linkText = "AboutUs")
    WebElement aboutUsTab;

    @FindBy(linkText = "Careers")
    WebElement careersTab;

    @FindBy(linkText = "Contact")
    WebElement contactTab;

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

    public boolean isHomeTabDisplayed() {

        return homeTab.isDisplayed();
    }

    public boolean isServicesTabDisplayed() {

        return servicesTab.isDisplayed();
    }

    public boolean isWorksTabDisplayed() {

        return worksTab.isDisplayed();
    }

    public boolean isTechnologyTabDisplayed() {

        return technologyTab.isDisplayed();
    }

    public boolean isPricesTabDisplayed() {

        return pricesTab.isDisplayed();
    }

    public boolean isNewsTabDisplayed() {

        return newsTab.isDisplayed();
    }

    public boolean isAboutUsTabDisplayed() {

        return aboutUsTab.isDisplayed();
    }

    public boolean isCareersTabDisplayed() {

        return careersTab.isDisplayed();
    }

    public boolean isContactTabDisplayed() {

        return contactTab.isDisplayed();
    }
}
