import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    WebDriver driver;

    @BeforeEach
    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openPage(){
        driver.get("http://automationpractice.com/");
        WebElement btnSignIn = driver.findElement(By.cssSelector(".login"));
        btnSignIn.click();
    }

    /**/
    @AfterEach
    public void shutdown() {
        driver.quit();
    }
}
