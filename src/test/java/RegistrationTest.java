import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest extends BaseUITest {

    @Test
    public void createNewAccountTest(){
        mainpage.homePage();
        mainpage.btnSighIn();
        newAccountRegistration.generateNewRandomEmailAccountAndGoToRegistration(10);
        Assertions.assertTrue(newAccountRegistration.newAccountPageHeaderPresent());
        Assertions.assertEquals("authentication", newAccountRegistration.getNewAccountPageHeaderText().toLowerCase());
        System.out.println(1);
    }
}
