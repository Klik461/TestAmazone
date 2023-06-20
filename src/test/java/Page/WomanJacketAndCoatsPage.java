package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomanJacketAndCoatsPage extends BasePage {
    public WomanJacketAndCoatsPage(WebDriver driver) {
        super(driver);
    }

    private static final String SECOND_PRODUCT_IN_WOMAN_JACKET = "//div[@data-part-number='VN0A5JH4BLK']";
    private static final String BTN_QUICK_SHOP_ON_THE_SECOND_PRODUCT = "(//div[contains(@class,'product-block product-block-js')])[2]//button[contains(text(),'Quick Shop')]";
    private static final String FIELD_BRAND_PRODUCT_IN_WOMAN_JACKET = "(//span[@class='product-block-name-wrapper'])[contains(text(),'Kastle Check Me Jacket')]";
    private static final String FIELD_PRICE_WOMAN_JACKER = "//div[@class='price-block']//span[contains(text(),'£ 60.00')]";
    private static final String BTN_CLOSE_POP_UP = "//div[@class='close-wrapper plp-sticky-family-track']";
    private static final String FIELD_SIZE_WOMEN_JACKET = "//select[@id='attr-size']";
    private static final String FIELD_SELECTION_XXS = "//div[@value='XXS']";
    private static final String BTN_ADD_TO_CART = "//section[@id='ecom-product-actions']//button[@data-added-to-cart-text='Added']";
    private static final String GET_SELECTION_SIZE_WOMAN = "//div[@data-attribute-stock='97']//span[@class='primary-label']";


    public WebElement secondProductInWomanJacket() {
        return waitUntilElementToBeClickable(SECOND_PRODUCT_IN_WOMAN_JACKET);
    }
    public WomanJacketAndCoatsPage moveOnTheSecondProductInWomanJacket() {
        moveCursor(secondProductInWomanJacket());
        return this;
    }
    public WebElement btnQuickShopOnTheSecondProduct() {
        return waitUntilElementToBeClickable(BTN_QUICK_SHOP_ON_THE_SECOND_PRODUCT);
    }
    public WebElement fieldBrandProductInWomanJacket() {
        return waitUntilVisibilityElementLocated(FIELD_BRAND_PRODUCT_IN_WOMAN_JACKET);
    }
    public WebElement fieldPriceWomanJacket() {
        return waitUntilVisibilityElementLocated(FIELD_PRICE_WOMAN_JACKER);
    }
    public WebElement btnClosePopUp() {
        return waitUntilVisibilityElementLocated(BTN_CLOSE_POP_UP);
    }
    public WebElement fieldSizeInWomenJacket() {
        return waitUntilElementToBeClickable(FIELD_SIZE_WOMEN_JACKET);
    }
    public WebElement fieldSelectionXXS() {
        return waitUntilElementToBeClickable(FIELD_SELECTION_XXS);
    }
    public WebElement btnAddToCart() {
        return waitUntilElementToBeClickable(BTN_ADD_TO_CART);
    }
    public void checkAddToCartBtnInvisible() {
        waitUntilInvisibilityElementLocated(BTN_ADD_TO_CART);
    }
    public WebElement getSelectionSizeWomen() {
        return waitUntilElementToBeClickable(GET_SELECTION_SIZE_WOMAN);
    }





}
