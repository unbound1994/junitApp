import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {

    private static final String HOMEPAGE_URL = "http://automationpractice.com/";
    private static final By BUTTON_SIGHIN = By.cssSelector(".login");

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void homePage(){
        driver.get(HOMEPAGE_URL);
    }

    public void btnSighIn(){
        click(BUTTON_SIGHIN);
    }
}
