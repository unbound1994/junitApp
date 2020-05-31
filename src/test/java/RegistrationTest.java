import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest extends BaseUITest {
    /**/
    @Test
    public void createNewAccountTest(){
        mainpage.homePage();
        mainpage.btnSighIn();
        signInPage.generateNewRandomEmailAccountAndGoToRegistration(10);
        Assertions.assertTrue(newAccountRegistration.newAccountPageHeaderPresent()); /*Проверка наличия header'a*/
        Assertions.assertEquals("authentication", newAccountRegistration.getNewAccountPageHeaderText().toLowerCase()); /*Проверка наличия
        необходимой надписи на странице с использованием метода их класса наслденика и перевод полученного header'a в нижний регистр для сравнения*/
        System.out.println(1);
    }
}
