package pages;

import com.google.inject.Inject;
import com.google.inject.Injector;
import org.openqa.selenium.WebDriver;

/**
 * Created by matttully on 29/06/2016.
 */
public class BasePage {

    @Inject
    private Injector injector;

    @Inject
    private WebDriver driver;

}
