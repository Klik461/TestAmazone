package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KidsShoesPage extends BasePage {
    public KidsShoesPage(WebDriver driver) {
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

    private static final String GET_SIZE_SELECT_SHOES = "//dl[@class='item-detail-attr-list']//dd[@class='item-detail-attr'][1]";
    private static final String FOUR_PRODUCT_IN_MINI_ME_KIDS = "//div[@data-part-number='VN0A7Q5DBMB']";
    private static final String GET_NAME_BRAND_IN_MINI_ME_KIDS = "//div[@data-part-number='VN0A7Q5DBMB']//span[@class='product-block-name-wrapper']";
    private static final String BTN_QUICK_SHOP_ON_FOUR_PRODUCT = "//div[@data-part-number='VN0A7Q5DBMB']//button[@aria-label='Quick Shop']";
    private static final String FIELD_SIZE_HALF_TEN = "//div[contains(@data-attribute,'')]//span[contains(text(),'10.5')]";
    private static final String GET_PRICE_KIDS_BRAND = "//div[@class='price-container price-container-js']//span[contains(@class,'product-content-info-offer-price')]";

    public WebElement getNameClassics() {
        return waitUntilVisibilityElementLocated(GET_NAME_CLASSICS);
    }
    public WebElement thirdProductClassics() {
        return waitUntilElementToBeClickable(THIRD_PRODUCT_CLASSICS);
    }
    public KidsShoesPage moveThirdProductClassics() {
        moveCursor(thirdProductClassics());
        return this;
    }
    public WebElement btnQuickShopThirdProduct() {
        return waitUntilElementToBeClickable(BTN_QUICK_SHOP_THIRD_PRODUCT);
    }
    public WebElement getPriceThirdShoes() {
        return waitUntilVisibilityElementLocated(GET_PRICE_THIRD_SHOES);
    }
    public WebElement getBrandThirdShoes() {
        return waitUntilVisibilityElementLocated(GET_BRAND_THIRD_SHOES);
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
    public WebElement getSizeShoesSelect() {
        return waitUntilVisibilityElementLocated(GET_SIZE_SELECT_SHOES);
    }
    public WebElement fourProductInMiniMeKids() {
        return waitUntilElementToBeClickable(FOUR_PRODUCT_IN_MINI_ME_KIDS);
    }
    public KidsShoesPage moveCursorOnFourProductInMiniMe() {
        moveCursor(fourProductInMiniMeKids());
        return this;
    }
    public WebElement getNameBrandInMiniMeKids() {
        return waitUntilVisibilityElementLocated(GET_NAME_BRAND_IN_MINI_ME_KIDS);
    }
    public WebElement btnQuickShopOnFourProduct() {
        return waitUntilElementToBeClickable(BTN_QUICK_SHOP_ON_FOUR_PRODUCT);
    }
    public WebElement fieldSizeHalfTen() {
        return waitUntilElementToBeClickable(FIELD_SIZE_HALF_TEN);
    }
    public WebElement getPriceKids() {
        return waitUntilVisibilityElementLocated(GET_PRICE_KIDS_BRAND);
    }
    public void checkAddToCartInvisibility() {
        waitUntilInvisibilityElementLocated(GET_PRICE_KIDS_BRAND);
    }





}
