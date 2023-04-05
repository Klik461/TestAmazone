package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    private static final String BTN_CHECKOUT_SECURELY = "//div[@class='checkout-action small-12 ']";
    public WebElement btnCheckoutSecurely() {
        return waitUntilElementToBeClickable(BTN_CHECKOUT_SECURELY);
    }



}
