
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FieldsTest extends BaseUITest {

    @Test
    public void EntryFields(){
        mainpage.homePage();
        mainpage.btnSighIn();
        signInPage.generateNewRandomEmailAccountAndGoToRegistration(10);
        Assertions.assertTrue(fillingInTheFields.isAccPageHeaderPresent());
        Assertions.assertEquals("authentication", fillingInTheFields.getAccPageHeaderText().toLowerCase());
        fillingInTheFields.generateNewName();
        fillingInTheFields.generateNewLastname();
        fillingInTheFields.generateNewRandomPassword(6);
        fillingInTheFields.generateNewRandomAddress();
        fillingInTheFields.generateCityNames();
        fillingInTheFields.selectState();
        fillingInTheFields.zipRandomGenerate(5);
        fillingInTheFields.chooseCountry();
        fillingInTheFields.phoneNumberRandomGeneration(11);
        fillingInTheFields.setMyAddressInput();
        fillingInTheFields.submitRegistration();
        System.out.println(2);
        Assertions.assertTrue(fillingInTheFields.isMyaccountHeaderPresent());
        Assertions.assertEquals("my account", fillingInTheFields.getMyaccountHeaderText().toLowerCase());
    }




}
