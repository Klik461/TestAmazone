package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewArrivalsPage extends BasePage {
    public NewArrivalsPage(WebDriver driver) {
        super(driver);
    }

    private static final String GET_NAME_FIRST_BACKPACK_IN_NEW_ARRIVALS = "(//div[contains(@data-catentry-name-dl,'Backpack')])[1]//span[contains(text(),'Backpack')]";
    private static final String FIRST_BACKPACK_IN_NEW_ARRIVALS = "(//div[contains(@data-catentry-name-dl,'Backpack')])[1]";
    private static final String BTN_QUICK_SHOP_ON_THE_FIRST_BACKPACK = "(//div[contains(@data-catentry-name-dl,'Backpack')])[1]//button[@aria-label='Quick Shop']";
    private static final String GET_PRICE_FIRST_HAT = "//div[@class='price-container price-container-js']//span[contains(@class,'product-price-amount-js')]";
    private static final String FIELD_SELECT_SIZE = "//select[@id='attr-size']";
    private static final String SELECT_SIZE_SECOND_BACKPACK = "//div[@value='OS']";
    private static final String BTN_ADD_TO_CART = "//section[@id='ecom-product-actions']//button[@aria-label='add to cart']";


    public WebElement getNameFirstBackpackInNewArrivals() {
        return waitUntilVisibilityElementLocated(GET_NAME_FIRST_BACKPACK_IN_NEW_ARRIVALS);
    }
    public WebElement firstBackpackInNewArrivals() {
        return waitUntilElementToBeClickable(FIRST_BACKPACK_IN_NEW_ARRIVALS);
    }
    public NewArrivalsPage moveTheCursorToTheFirstBackpack() {
        moveCursor(firstBackpackInNewArrivals());
        return this;
    }
    public WebElement btnQuickShopOnTheFirstBackpack() {
        return waitUntilElementToBeClickable(BTN_QUICK_SHOP_ON_THE_FIRST_BACKPACK);
    }
    public WebElement getPriceFirstHat() {
        return waitUntilVisibilityElementLocated(GET_PRICE_FIRST_HAT);
    }
    public WebElement fieldSelectSize() {
        return waitUntilElementToBeClickable(FIELD_SELECT_SIZE);
    }
    public WebElement selectSecondSizeBackpack() {
        return waitUntilElementToBeClickable(SELECT_SIZE_SECOND_BACKPACK);
    }
    public WebElement btnAddToCart() {
        return waitUntilElementToBeClickable(BTN_ADD_TO_CART);
    }
    public void ckechBtnAddToCartInvisibility() {
    waitUntilInvisibilityElementLocated(BTN_ADD_TO_CART);
    }




}
