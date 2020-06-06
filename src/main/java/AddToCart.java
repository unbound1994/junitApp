import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart extends BaseActions {
    private static final By HOME_BTTN = By.cssSelector(".home");
    private static final By CATEGORIES_HEADER = By.cssSelector(".homefeatured");
    private static final By BEST_SELLERS_BTN = By.cssSelector(".blockbestsellers");
    private static final By PRODUCT_SELECT = By.cssSelector(".product_list.grid.row.blockbestsellers.tab-pane.active > li");
    private static final String BTN_URL ="http://automationpractice.com/index.php?id_product=1&controller=product";
    private static final By CLICK_BTN_ADD_TO_CART = By.cssSelector("#add_to_cart");
    private static final By BTN_CONTINUE_SHOPPING = By.cssSelector(".continue.btn.btn-default.button.exclusive-medium");
    private static final String CHECK_ORDER = "http://automationpractice.com/index.php?controller=order";
    private static final By CART_HEADER = By.cssSelector(".navigation_page");
    private static final By PROCEED_TO_CHECKOUT = By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium");
    private static final By PROCEED_TO_CHECKOUT_ADDRESS = By.cssSelector(".cart_navigation.clearfix > button");
    private static final By PROCEED_TO_CHECKOUT_SHIPPING = By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium");
    private static final By CGV = By.cssSelector("#cgv");
    private static final By BANKWIRE = By.cssSelector(".col-xs-12.col-md-6 > p > a");
    private static final By CONFIRM_MY_ORDER = By.cssSelector(".cart_navigation.clearfix > button");
    private static final By ORDER_HEADER = By.cssSelector(".navigation_page");

    public boolean CategoriesHeaderPresent(){
        return IsElementPresent(CATEGORIES_HEADER);
    }

    public String getCategoriesHeaderText(){
        return driver.findElement(CATEGORIES_HEADER).getText();
    }

    public void clickHomeBtn(){
        click(HOME_BTTN);
    }

    public void clickBestSellersCategories(){
        click(BEST_SELLERS_BTN);
    }

    public void selectProduct(){
        Actions action = new Actions(driver);
        WebElement productBlock = driver.findElement(PRODUCT_SELECT);
        action.moveToElement(productBlock).perform();
        driver.get(BTN_URL);
    }

    public void clickToBtn(){
        click(CLICK_BTN_ADD_TO_CART);
    }

    public void continueBtn(){
        clickToBeClickable(BTN_CONTINUE_SHOPPING);
    }

    public void checkOrder(){
        driver.get(CHECK_ORDER);
    }

    public boolean cartHeader(){
        return IsElementPresent(CART_HEADER);
    }

    public String getCartHeader(){
        return driver.findElement(CART_HEADER).getText();
    }

    public void clickProceedBtn(){
        Actions action = new Actions(driver);
        WebElement productBlock = driver.findElement(PROCEED_TO_CHECKOUT);
        action.moveToElement(productBlock).perform();
        click(PROCEED_TO_CHECKOUT);
    }

    public void address(){
        click(PROCEED_TO_CHECKOUT_ADDRESS);
    }

    public void shipping(){
        click(PROCEED_TO_CHECKOUT_SHIPPING);
    }

    public void checkBox(){
        click(CGV);
    }

    public void bankwire(){
        click(BANKWIRE);
    }

    public void confirmMyOrder(){
        click(CONFIRM_MY_ORDER);
    }

    public boolean orderConfirmation(){
        return IsElementPresent(ORDER_HEADER);
    }

    public String getOrderConfirmation(){
        return driver.findElement(ORDER_HEADER).getText();
    }

    public AddToCart(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
