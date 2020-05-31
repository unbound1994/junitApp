import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MainPageTest extends BaseUITest {

    /**/
    @Test
    public void goToSignIn(){
        mainpage.homePage();    /*Переход на домашнюю страницу с помощью объекта класса MainPage*/
        mainpage.btnSighIn();

    }
}
