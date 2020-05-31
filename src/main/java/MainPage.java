import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {

    /*адрес домашней страницы и селлектор для кнопки SighIn*/
    private static final String HOMEPAGE_URL = "http://automationpractice.com/";
    private static final By BUTTON_SIGHIN = By.cssSelector(".login");

    /*конструктор класса MainPage дающий доступ к driver и wait, как наследник этого класса*/
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /*переход на указанный адрес в HOMEPAGE_URL*/
    public void homePage(){
        driver.get(HOMEPAGE_URL);
    }

    /*кник по кнопке*/
    public void btnSighIn(){
        click(BUTTON_SIGHIN);
    }

}
