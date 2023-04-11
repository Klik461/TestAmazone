package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewArrivalsPage extends BasePage {
    public NewArrivalsPage(WebDriver driver) {
        super(driver);
    }

    private static final String GET_NAME_FIRST_HAT_IN_NEW_ARRIVALS = "(//div[contains(@data-catentry-name-dl,'Hat')])[1]//span[contains(text(),'Hat')]";
    private static final String FIRST_HAT_IN_NEW_ARRIVALS = "(//div[contains(@data-catentry-name-dl,'Hat')])[1]";
    private static final String BTN_QUICK_SHOP_ON_THE_FIRST_HAT = "(//div[contains(@data-catentry-name-dl,'Hat')])[1]//button[@aria-label='Quick Shop']";
    private static final String GET_PRICE_FIRST_HAT = "//div[@class='price-container price-container-js']//span[contains(@class,'product-price-amount-js')]";
    private static final String FIELD_SELECT_SIZE = "//select[@id='attr-size']";
    private static final String SELECT_SIZE_HAT = "//div[@data-attribute-stock='106']//span[@class='primary-label']";
    private static final String BTN_ADD_TO_CART = "//section[@id='ecom-product-actions']//button[@aria-label='add to cart']";


    public WebElement getNameFirstHatInNewArrivals() {
        return waitUntilVisibilityElementLocated(GET_NAME_FIRST_HAT_IN_NEW_ARRIVALS);
    }
    public WebElement firstHatInNewArrivals() {
        return waitUntilElementToBeClickable(FIRST_HAT_IN_NEW_ARRIVALS);
    }
    public NewArrivalsPage moveTheCursorToTheFirstHat() {
        moveCursor(firstHatInNewArrivals());
        return this;
    }
    public WebElement btnQuickShopOnTheFirstHat() {
        return waitUntilElementToBeClickable(BTN_QUICK_SHOP_ON_THE_FIRST_HAT);
    }
    public WebElement getPriceFirstHat() {
        return waitUntilVisibilityElementLocated(GET_PRICE_FIRST_HAT);
    }
    public WebElement fieldSelectSize() {
        return waitUntilElementToBeClickable(FIELD_SELECT_SIZE);
    }
    public WebElement selectSizeHatSM() {
        return waitUntilElementToBeClickable(SELECT_SIZE_HAT);
    }
    public WebElement btnAddToCart() {
        return waitUntilElementToBeClickable(BTN_ADD_TO_CART);
    }
    public void ckechBtnAddToCartInvisibility() {
    waitUntilInvisibilityElementLocated(BTN_ADD_TO_CART);
    }




}
