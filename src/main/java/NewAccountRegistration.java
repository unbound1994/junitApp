import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAccountRegistration extends BaseActions {

    private static final By CREATE_ACCOUNT_PAGE_HEADING = By.cssSelector(".navigation_page");
    private static final By EMAIL_REGISTRATION = By.cssSelector("#email_create");
    private static final By GO_TO_REGISTRATION_BTN = By.cssSelector("#SubmitCreate");

    public NewAccountRegistration(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean newAccountPageHeaderPresent(){
        return IsElementPresent(CREATE_ACCOUNT_PAGE_HEADING);
    }

    public String getNewAccountPageHeaderText(){
        return driver.findElement(CREATE_ACCOUNT_PAGE_HEADING).getText();
    }

    public void generateNewRandomEmailAccountAndGoToRegistration(int NameLength){
        StringBuilder emailBuilder = new StringBuilder();
        for (int i = 0; i < NameLength ; i++) {
            emailBuilder.append((char)(97 + (int)(Math.random()*26)));
        }
        emailBuilder.append("@gmail.com");
        type(emailBuilder.toString(), EMAIL_REGISTRATION);
        click(GO_TO_REGISTRATION_BTN);
    }
}
