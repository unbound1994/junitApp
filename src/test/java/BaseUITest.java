import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUITest {
    WebDriver driver;
    WebDriverWait wait;

    protected MainPage mainpage;
    protected NewAccountRegistration newAccountRegistration;
    protected FillingInTheFields fillingInTheFields;
    protected AddToCart addToCart;

    @BeforeEach
    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 3);
        mainpage = new MainPage(driver, wait);
        newAccountRegistration = new NewAccountRegistration(driver, wait);
        fillingInTheFields = new FillingInTheFields(driver, wait);
        addToCart = new AddToCart(driver, wait);
    }

    @AfterEach
    public void shutdown(){
        driver.quit();
    }
}
