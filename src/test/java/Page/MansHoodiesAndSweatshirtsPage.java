package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MansHoodiesAndSweatshirtsPage extends BasePage {
    public MansHoodiesAndSweatshirtsPage(WebDriver driver) {
        super(driver);
    }

    private static final String FIVE_PRODUCT_IN_MEN_HOODIES = "//div[@data-part-number='VN0A456AY28']";
    private static final String QUICK_SHOP_ON_FIVE_PRODUTC = "//div[@data-part-number='VN0A456AY28']//button[@data-vfdp='quickView']";
    private static final String GET_NAME_FIVE_PRODUCT = "//div[@data-part-number='VN0A456AY28']//span[@class='product-block-name-wrapper']";
    private static final String FIELD_SELECT_SIZE_HOODIES = "//select[@id='attr-size']";
    private static final String SELECT_SIZE_L_ABOUT_HOODIES = "//div[@class='dropdown-item '][@value='L']";
    private static final String BTN_ADD_TO_CART_MEN_HOODIES = "//div[contains(@class,'add-to-wishlist-enabled bl_VAN-187-1')]//button[@aria-label='add to cart']";
    private static final String GET_PRICE_MEN_HOODIES = "//div[@class='price-container price-container-js']//span[contains(@class,'product-content-info-offer-price')]";

    public WebElement fiveProductInMenHoodies() {
        return waitUntilElementToBeClickable(FIVE_PRODUCT_IN_MEN_HOODIES);
    }
    public MansHoodiesAndSweatshirtsPage moveCursorOnTheFiveProduct() {
        moveCursor(fiveProductInMenHoodies());
        return this;
    }
    public WebElement quickShopOnFiveProduct() {
        return waitUntilElementToBeClickable(QUICK_SHOP_ON_FIVE_PRODUTC);
    }
    public WebElement getNameFiveProduct() {
        return waitUntilElementToBeClickable(GET_NAME_FIVE_PRODUCT);
    }
    public WebElement fieldSelectSizeHoodies() {
        return waitUntilElementToBeClickable(FIELD_SELECT_SIZE_HOODIES);
    }
    public WebElement selectSizeLAboutHoodies() {
        return waitUntilElementToBeClickable(SELECT_SIZE_L_ABOUT_HOODIES);
    }
    public WebElement btnAddToCartMenHoodies() {
        return waitUntilElementToBeClickable(BTN_ADD_TO_CART_MEN_HOODIES);
    }
    public void checkAddToCartBtnInvasible() {
        waitUntilInvisibilityElementLocated(BTN_ADD_TO_CART_MEN_HOODIES);
    }
    public WebElement getPriceMenHoodies() {
        return waitUntilVisibilityElementLocated(GET_PRICE_MEN_HOODIES);
    }



}
