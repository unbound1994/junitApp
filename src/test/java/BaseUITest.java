import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUITest {
    /*Создание driver'a и wait'a*/
    WebDriver driver;
    WebDriverWait wait;

    /*Необходимые объекты классов гаследников от BaseActions*/
    protected MainPage mainpage;
    protected SignInPage signInPage;
    protected NewAccountRegistration newAccountRegistration;
    protected FillingInTheFields fillingInTheFields;

    /*Инициализация*/
    @BeforeEach
    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 3);
        mainpage = new MainPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
        newAccountRegistration = new NewAccountRegistration(driver, wait);
        fillingInTheFields = new FillingInTheFields(driver, wait);
    }

    /*Завершение работы driver'а*/
    @AfterEach
    public void shutdown(){
        driver.quit();
    }
}
