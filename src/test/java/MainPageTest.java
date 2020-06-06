import org.junit.jupiter.api.Test;

public class MainPageTest extends BaseUITest {

    @Test
    public void goToSignIn(){
        mainpage.homePage();
        mainpage.btnSighIn();
    }
}
