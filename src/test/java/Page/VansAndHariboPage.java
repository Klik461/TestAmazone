package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VansAndHariboPage extends BasePage {
    public VansAndHariboPage(WebDriver driver) {
        super(driver);
    }

    private static final String FIRST_PRODUCT_T_SHIRT = "//div[contains(@data-catentry-name-dl,' T-Shirt')][1]";
    private static final String BTN_QUICK_SHOP_ON_FIRST_T_SHIRT = "//div[contains(@data-catentry-name-dl,' T-Shirt')][1]//button[@aria-label='Quick Shop']";
    private static final String GET_BRAND_FIRST_T_SHIRT = "//div[contains(@data-catentry-name-dl,' T-Shirt')][1]//span[@class='product-block-name-wrapper']";
    private static final String GET_PRICE_T_SHIRT = "//div[@class='price-container price-container-js']//span[contains(@class,'product-content-info-offer-price')]";
    private static final String FIELD_SELECT_SIZE = "//select[@id='attr-size']";
    private static final String FIELD_SIZE_SIX_SEVEN_Y = "//div[contains(@data-attribute-stock,'')]//div[@value='M']";
    private static final String BTN_ADD_TO_CART = "//section[@id='ecom-product-actions']//button[@aria-label='add to cart']";


    public WebElement firstProductTShirt() {
        return waitUntilElementToBeClickable(FIRST_PRODUCT_T_SHIRT);
    }
    public VansAndHariboPage moveCursorOnFirstTShirt() {
        moveCursor(firstProductTShirt());
        return this;
    }
    public WebElement btnQuickShopOnFirstTShirt() {
        return waitUntilElementToBeClickable(BTN_QUICK_SHOP_ON_FIRST_T_SHIRT);
    }
    public WebElement getBrandFirstTShirt() {
        return waitUntilElementToBeClickable(GET_BRAND_FIRST_T_SHIRT);
    }
    public WebElement getPriceTShirt() {
        return waitUntilVisibilityElementLocated(GET_PRICE_T_SHIRT);
    }
    public WebElement fieldSelectSize() {
        return waitUntilElementToBeClickable(FIELD_SELECT_SIZE);
    }
    public WebElement fieldSizeSixSevenY() {
        return waitUntilElementToBeClickable(FIELD_SIZE_SIX_SEVEN_Y);
    }
    public WebElement btnAddToCart() {
        return waitUntilElementToBeClickable(BTN_ADD_TO_CART);
    }
    public void checkAddToCartInvisibility() {
        waitUntilInvisibilityElementLocated(BTN_ADD_TO_CART);
    }

}
