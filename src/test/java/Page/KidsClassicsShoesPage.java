package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KidsClassicsShoesPage extends BasePage {
    public KidsClassicsShoesPage(WebDriver driver) {
        super(driver);
    }
    private static final String GET_NAME_CLASSICS = "//div[@class='category-title-and-description']";
    private static final String THIRD_PRODUCT_CLASSICS = "(//div[contains(@class,'product-block product-block-js')])[3]";
    private static final String BTN_QUICK_SHOP_THIRD_PRODUCT = "(//div[contains(@class,'product-block product-block-js')])[3]//button[contains(text(),'Quick Shop')]";
    private static final String GET_PRICE_THIRD_SHOES = "//div[@data-part-number='VN000D5F6BT']//span[contains(@class,'product-price-amount-js')]";
    private static final String GET_BRAND_THIRD_SHOES = "//div[@data-part-number='VN000D5F6BT']//span[contains(@class,'product-block-name-wrapper')]";
    private static final String FIELD_SELECT_SIZE = "//select[@id='attr-size']";
    private static final String FIELD_SIZE_TEN = "//div[@class='dropdown-item '][@value='10']";
    private static final String BTN_ADD_TO_CART = "//div[contains(@class,'add-to-wishlist-enabled bl_VAN-187-1')]//button[@aria-label='add to cart']";
    private static final String BTN_BASKET_ON_HEADER = "//a[@aria-describedby='topnav-shopcart-link-instructions']";
    private static final String GET_SIZE_SELECT_SHOES = "//dl[@class='item-detail-attr-list']//dd[@class='item-detail-attr'][1]";

    public WebElement getNameClassics() {
        return waitUntiVisabilityElementLocated(GET_NAME_CLASSICS);
    }
    public WebElement thirdProductClassics() {
        return waitUntilElementToBeClickable(THIRD_PRODUCT_CLASSICS);
    }
    public KidsClassicsShoesPage moveThirdProductClassics() {
        moveCursor(thirdProductClassics());
        return this;
    }
    public WebElement btnQuickShopThirdProduct() {
        return waitUntilElementToBeClickable(BTN_QUICK_SHOP_THIRD_PRODUCT);
    }
    public WebElement getPriceThirdShoes() {
        return waitUntiVisabilityElementLocated(GET_PRICE_THIRD_SHOES);
    }
    public WebElement getBrandThirdShoes() {
        return waitUntiVisabilityElementLocated(GET_BRAND_THIRD_SHOES);
    }
    public WebElement fieldSelectSize() {
        return waitUntilElementToBeClickable(FIELD_SELECT_SIZE);
    }
    public WebElement fieldSizeTen() {
        return waitUntilElementToBeClickable(FIELD_SIZE_TEN);
    }
    public WebElement btnAddToCart() {
        return waitUntilElementToBeClickable(BTN_ADD_TO_CART);
    }
    public WebElement btnBasketOnHeader() {
        return waitUntilElementToBeClickable(BTN_BASKET_ON_HEADER);
    }
    public WebElement getSizeShoesSelect() {
        return waitUntiVisabilityElementLocated(GET_SIZE_SELECT_SHOES);
    }





}
