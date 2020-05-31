import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage extends BaseActions {

    /*Поиск элементов по необходимым селлекторам и создание переменных для дальнейшего использования*/
    private final By SIGN_IN_PAGE_HEADER = By.cssSelector(".page_heading");
    private final By EMAIL_REGISTRATION = By.cssSelector("#email_create");
    private final By GO_TO_REGISTRATION_BTN = By.cssSelector("#SubmitCreate");


    /*Конструктор*/
    public SignInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /*Проверка наличия элемента на страние с использованием селлектора*/
    public boolean isSignInPageHeaderPresent(){
        return IsElementPresent(SIGN_IN_PAGE_HEADER);
    }

    /**/
    public String getSighInPageHeaderText(){
        return driver.findElement(SIGN_IN_PAGE_HEADER).getText();
    }

    /*Метод, генерирующий случайные символы*/
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
