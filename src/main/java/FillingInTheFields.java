import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillingInTheFields extends BaseActions {
    private static final By FIELD_FIRSTNAME = By.cssSelector("#customer_firstname");
    private static final By FIELD_LASTNAME = By.cssSelector("#customer_lastname");
    private static final By FIELD_PASSWORD = By.cssSelector("#passwd");
    private static final By ADDRESSS_INPUT = By.cssSelector("#address1");
    private static final By CITY = By.cssSelector("#city");
    private static final By STATES_FEILD = By.cssSelector("#uniform-id_state");
    private static final By STATE_SELECT = By.cssSelector("#id_state");
    private static final By ZIPPOST_CODE = By.cssSelector("#postcode");
    private static final By COUNTRY_FIELD = By.cssSelector("#uniform-id_country");
    private static final By COUNTRY = By.cssSelector("#id_country");
    private static final By MOBILE_PHONE = By.cssSelector("#phone_mobile");
    private static final By MY_ADDRESS_INPUT = By.cssSelector("#alias");
    private static final By SUBMIT_REGISTRATION = By.cssSelector("#submitAccount");
    private static final By SUBMIT_REGISTRATION_HEADER = By.cssSelector(".navigation_page");

    public void generateNewName(){
        String[] names = {"Julia", "Robert", "Cassandra", "Tom", "Olivia"};
        String name = names[(int)(Math.random()*names.length)];
        type(name, FIELD_FIRSTNAME);
    }


    public void generateNewLastname(){
        String[] lastnames = {"Stoun", "White", "Jenkins", "Garrison", "Vest"};
        String lastname = lastnames[(int)(Math.random()*lastnames.length)];
        type(lastname, FIELD_LASTNAME);
    }

    public void generateNewRandomPassword(int passwdLength){
        StringBuilder passwdBuilder = new StringBuilder();
        for (int i = 0; i < passwdLength ; i++) {
            passwdBuilder.append((char)(97 + (int)(Math.random()*26)));
        }
        type(passwdBuilder.toString(), FIELD_PASSWORD);
    }

    public void generateNewRandomAddress(){
        String[] street = {"Madison Ave", "Park Ave", "Main Str", "Imperial Highway", "Lennox Boulevard",};
        String streets = street[(int)(Math.random()*street.length)];

        String[] nameOfState = {"CA", "NJ", "GA", "CO", "ID"};
        String states = nameOfState[(int)(Math.random()*nameOfState.length)];

        String[] nameOfCompany = {"United Overseas Bank", "Xilinx", "Medallia", "Akami", "Broadcom"};
        String company = nameOfCompany[(int)(Math.random()*nameOfCompany.length)];

        StringBuilder poBoxIndex = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            poBoxIndex.append((int)(Math.random()*9));
        }
        type(streets + ", " + states + "-" + poBoxIndex + ", " + company, ADDRESSS_INPUT);
    }

    public void generateCityNames(){
        String[] city = {"Ann Arbor", "Nashville", "Overland Park", "Boston", "Phoenix", "Cleveland", "Salt Lake City", "Toledo", "Fort Worth", "Oklahoma City", "Yonkers"};
        String names = city[(int)(Math.random()*city.length)];
        type(names, CITY);
    }

    public void chooseCountry(){
        click(COUNTRY_FIELD);
        click(COUNTRY);
        WebElement SelectState = driver.findElement(COUNTRY);
        Select select = new Select(SelectState);
        select.selectByVisibleText("United States");
    }

    public void zipRandomGenerate (int zipNums){
        StringBuilder zipBuilder = new StringBuilder();
        for (int i = 0; i < zipNums; i++) {
            zipBuilder.append((int)(Math.random() * 9));
        }
        type(zipBuilder.toString(), ZIPPOST_CODE);
    }

    public void selectState(){
        click(STATES_FEILD);
        click(STATE_SELECT);
        WebElement SelectState = driver.findElement(STATE_SELECT);
        Select select = new Select(SelectState);
        int index = ((int)(Math.random()*50));
        select.selectByIndex(index);
    }

    public void phoneNumberRandomGeneration(int phoneLength){
        StringBuilder phoneBuilder = new StringBuilder();
        for (int i = 0; i < phoneLength; i++) {
            phoneBuilder.append((int)(Math.random()*9));
        }
        type("+" + phoneBuilder, MOBILE_PHONE);
    }

    public void setMyAddressInput(){
        String[] street = {"Madison Ave", "Park Ave", "Main Str", "Imperial Highway", "Lennox Boulevard",};
        String streets = street[(int)(Math.random()*street.length)];

        String[] nameOfState = {"CA", "NJ", "GA", "CO", "ID"};
        String states = nameOfState[(int)(Math.random()*nameOfState.length)];

        type(streets + ", " + states, MY_ADDRESS_INPUT);
    }

    public void submitRegistration(){
        click(SUBMIT_REGISTRATION);
    }

    public boolean isMyaccountHeaderPresent(){
        return IsElementPresent(SUBMIT_REGISTRATION_HEADER);
    }

    public String getMyaccountHeaderText(){
        return driver.findElement(SUBMIT_REGISTRATION_HEADER).getText();
    }

    public FillingInTheFields(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
