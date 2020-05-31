import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAccountRegistration extends BaseActions {

    private static final By CREATE_ACCOUNT_PAGE_HEADING = By.cssSelector(".navigation_page");

    /**/
    public NewAccountRegistration(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean newAccountPageHeaderPresent(){
        return IsElementPresent(CREATE_ACCOUNT_PAGE_HEADING);
    }

    /**/
    public String getNewAccountPageHeaderText(){
        return driver.findElement(CREATE_ACCOUNT_PAGE_HEADING).getText();
    }

}
