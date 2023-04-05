package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDeliveryPage extends BasePage {
    public SelectDeliveryPage(WebDriver driver) {
        super(driver);
    }

    private static final String FIELD_FIRST_NAME = "//input[@id='first-name']";
    private static final String FIELD_LAST_NAME = "//input[@id='last-name']";
    private static final String FIELD_HOUSE_ADRESS = "//input[@id='address-1']";
    private static final String FIELD_CITY = "//input[@id='city-name']";
    private static final String FIELD_POST_CODE = "//input[@id='zipcode']";
    private static final String FIELD_NUMBER_PHONE = "//input[@id='phone-1']";
    private static final String FIELD_EMAIL = "//input[@id='email-1']";
    private static final String CHECK_BOX_ACCEPT_VANS = "//input[@id='wp-CheckboxConfirmTermsAndConditions']";
    private static final String CHECK_BOX_KEEP_ME = "//input[@class='occasional-promotion-option-checkbox']";
    private static final String BTN_PROCEED_TO_PAYMENT = "//a[@title='Proceed to Payment']";
    private static final String FIELD_INFO_ORDER = "//div[@id='checkout-summary-num-items']";

    public WebElement fieldFirstName() {
        return waitUntilElementToBeClickable(FIELD_FIRST_NAME);
    }
    public WebElement fieldLastName() {
        return waitUntilElementToBeClickable(FIELD_LAST_NAME);
    }
    public WebElement fieldhouseAdress() {
        return waitUntilElementToBeClickable(FIELD_HOUSE_ADRESS);
    }
    public WebElement fieldCity() {
        return waitUntilElementToBeClickable(FIELD_CITY);
    }
    public WebElement fieldPostCode() {
        return waitUntilElementToBeClickable(FIELD_POST_CODE);
    }
    public WebElement fieldPhoneNumber() {
        return waitUntilElementToBeClickable(FIELD_NUMBER_PHONE);
    }
    public WebElement fieldEmail() {
        return waitUntilElementToBeClickable(FIELD_EMAIL);
    }
    public WebElement checkBoxAcceptVans() {
        return  waitUntilElementToBeClickable(CHECK_BOX_ACCEPT_VANS);
    }
    public WebElement checkBoxKeepMe() {
        return waitUntilElementToBeClickable(CHECK_BOX_KEEP_ME);
    }
    public WebElement btnProccedToPayment() {
        return waitUntilElementToBeClickable(BTN_PROCEED_TO_PAYMENT);
    }
    public WebElement fieldInfoOrder() {
        return waitUntilElementToBeClickable(FIELD_INFO_ORDER);
    }




}
