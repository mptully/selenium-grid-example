package pages;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.WebDriverProvider;
import support.WaitHelper;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by matthewtully on 09/11/2015.
 */
public class ContactPage {

    @Inject
    private WebDriver webDriver;

    @FindBy(id = "ctl00_MainContent_NameBox")
    WebElement nameField;

    @FindBy(id = "ctl00_MainContent_EmailBox")
    WebElement emailField;

    @FindBy(id = "ctl00_MainContent_MessageBox")
    WebElement messageField;

    @FindBy(id = "ContactSend")
    WebElement sendButton;

    @FindBy(id = "ContactInfoBlock1")
    WebElement addressDetails;

    //@FindBy(tagName = "h3")
    //WebElement addressDetails;

    public static Map<String, String> addressDetailsContainer;// = new Map<String, String>();

//    @Inject
//    public ContactPage(WebDriverProvider webDriver) throws Exception {
//
//        this.webDriver = webDriver;
//        PageFactory.initElements(webDriver, this);
//
//
//    }

    public Map<String, String> getAddressDetails() throws Exception {

        String[] addressDetailsArray = addressDetails.getText().split("\\n");

        addressDetailsContainer = new HashMap<String, String>();
        addressDetailsContainer.put("AddrLine1", addressDetailsArray[1]);
        addressDetailsContainer.put("AddrLine2", addressDetailsArray[2]);
        addressDetailsContainer.put("Town", addressDetailsArray[3]);
        addressDetailsContainer.put("PostCode", addressDetailsArray[4]);
        addressDetailsContainer.put("TelNumber", addressDetailsArray[6]);

        return addressDetailsContainer;

    }

    public void clickSendButton() throws Exception {

        sendButton.click();

    }


    /**
     *
     */
    public void setNameField(String value) throws Exception {

        nameField.sendKeys(value);

    }

    /**
     *
     */
    public void setEmailFieldField(String value) throws Exception {

        emailField.sendKeys(value);

    }

    /**
     *
     */
    public void setMessageField(String value) throws Exception {

        messageField.sendKeys(value);

    }

    public String getTelephoneNumber() throws Exception {

        if (getAddressDetails() != null) {
            return addressDetailsContainer.get("TelNumber");
        } else {
            getAddressDetails();
        }
        return addressDetailsContainer.get("TelNumber");

    }

}
