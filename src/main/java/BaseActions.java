import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseActions {     /*абстрактный класс с базовыми действиями для всех остальных классов*/

    /*ссылки на драйвер и waiter*/
    protected WebDriver driver;
    protected WebDriverWait wait;

    /*Конструктор*/
    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    /*заполнение текстового поля*/
    public void type (String text, By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by)); /*Все клики будут ожидать waiter по необходимому заданному времени*/
        WebElement element = driver.findElement(by);
        element.clear(); /*очистка текстового поля*/
        element.sendKeys(text); /*отправка текста в текстовое поле*/
    }

    /*клик по какому-то элементу с ожиданием заданным waiter'у*/
    public void click (By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).click();
    }


    /*waiter*/
    public void waitAbit(int sec){
        try {
            Thread.sleep(sec); /*задача времени ожидания*/
        } catch (InterruptedException e) { /*перехват исключения*/
            e.printStackTrace();
        }
    }

    /*Метод проверки наличия элемента на странице*/
    public boolean IsElementPresent(By by){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            driver.findElement(by);
            return true;
        }catch (NoSuchElementException e) {
            return false;
        }
    }

}
