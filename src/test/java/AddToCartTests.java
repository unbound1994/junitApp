import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddToCartTests extends BaseUITest{

    @Test
    public void AddToCart(){
        mainpage.homePage();
        mainpage.btnSighIn();
        newAccountRegistration.generateNewRandomEmailAccountAndGoToRegistration(10);
        Assertions.assertTrue(newAccountRegistration.newAccountPageHeaderPresent());
        Assertions.assertEquals("authentication", newAccountRegistration.getNewAccountPageHeaderText().toLowerCase());
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
        Assertions.assertTrue(fillingInTheFields.isMyaccountHeaderPresent());
        Assertions.assertEquals("my account", fillingInTheFields.getMyaccountHeaderText().toLowerCase());
        addToCart.clickHomeBtn();
        Assertions.assertTrue(addToCart.CategoriesHeaderPresent());
        Assertions.assertEquals("popular", addToCart.getCategoriesHeaderText().toLowerCase());
        addToCart.clickBestSellersCategories();
        addToCart.selectProduct();
        addToCart.clickToBtn();
        addToCart.continueBtn();
        addToCart.checkOrder();
        Assertions.assertTrue(addToCart.cartHeader());
        Assertions.assertEquals("your shopping cart", addToCart.getCartHeader().toLowerCase());
        addToCart.clickProceedBtn();
        addToCart.address();
        addToCart.checkBox();
        addToCart.shipping();
        addToCart.bankwire();
        addToCart.confirmMyOrder();
        Assertions.assertTrue(addToCart.orderConfirmation());
        Assertions.assertEquals("order confirmation", addToCart.getOrderConfirmation().toLowerCase());
    }
}
