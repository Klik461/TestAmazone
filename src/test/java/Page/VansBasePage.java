package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VansBasePage extends BasePage {

    public VansBasePage(WebDriver driver){
        super (driver);
    }

    private static final String BTN_KIDS_ON_HEADER = "//a[@id='topnav-item-cms--1921171013']";
    private static final String BTN_SHOES_IN_KIDS_BOX = "//a[@id='topnav-item-cms--1529541508']";
    private static final String BTN_ALLOW_ALL_SECOND_OPEN = "//button[@id='onetrust-accept-btn-handler']";
    private static final String THIRD_CLASSES_SHOUE = "(//div[contains(text(),'VANS CLASSIC')])[3]";
    private static final String BTN_QUICK_SHOP_THIRD_ELEMENT = "//div[@data-part-number='VN000W9T6BT']//button[contains(text(),'Quick Shop')]";
    private static final String FIELD_SELECT_A_SIZE = "//select[@id='attr-size']";
    private static final String FIELD_SIZE_TEN = "//div[@value='10']";
    private static final String BTN_ADD_TO_CART = "//section[@id='ecom-product-actions']//button[@data-added-to-cart-text='Added']";
    private static final String BTN_CLOSE_NEWS = "//div[@class='close-wrapper']";
    private static final String BTN_CLOSE_NEWS_TWO = "//div[@class='close-wrapper plp-sticky-family-track']";
    private static final String BASKET_BTN_ON_HEADER = "/html/body/div[1]/div[1]/div[1]/header/div[3]/div/nav/ul/li[12]/a/span[2]";
    private static final String NAME_SHOE = "//h3[@data-catentry-name-dl='Kids Old Skool Shoes (4-8 years)']";
    private static final String SIZE_SHOE = "(//dd[@class='item-detail-attr'])[1]";
    private static final String PRICE_SHOE = "//div[@class='item-detail-total item-detail-total-js small-6 medium-3 large-1 columns ']";

    public WebElement btnKidsOnHeader() {
        return waitUntiVisabilityElementLocated(BTN_KIDS_ON_HEADER);
    }
    public VansBasePage moveOnKidsBtn() {
        moveCursor(btnKidsOnHeader());
        return this;
    }
    public WebElement btnShoesInKidsBox() {
        return waitUntiVisabilityElementLocated(BTN_SHOES_IN_KIDS_BOX);
    }
    public WebElement btnAllowAllSecondOpen() {
        return waitUntilElementToBeClickable(BTN_ALLOW_ALL_SECOND_OPEN);
    }
    public WebElement thirdClassesShoue() {
        return waitUntilElementToBeClickable(THIRD_CLASSES_SHOUE);
    }
    public VansBasePage moveToThirdClassesShoue() {
        moveCursor(thirdClassesShoue());
        return this;
    }
    public WebElement btnQuickShopThirdElement() {
        return waitUntilElementToBeClickable(BTN_QUICK_SHOP_THIRD_ELEMENT);
    }
    public WebElement fieldSelectASize() {
        return waitUntilElementToBeClickable(FIELD_SELECT_A_SIZE);
    }
    public WebElement fieldSizeTen() {
        return waitUntilElementToBeClickable(FIELD_SIZE_TEN);
    }
    public WebElement btnAddToCart() {
        return waitUntilElementToBeClickable(BTN_ADD_TO_CART);
    }
    public WebElement btnCloseNews() {
        return waitUntilElementToBeClickable(BTN_CLOSE_NEWS);
    }
    public WebElement btnCloseNews2() {
        return waitUntilElementToBeClickable(BTN_CLOSE_NEWS_TWO);
    }
    public WebElement basketBtnOnHeader() {
        return waitUntiVisabilityElementLocated(BASKET_BTN_ON_HEADER);
    }
    public WebElement nameShoe() {
        return waitUntiVisabilityElementLocated(NAME_SHOE);
    }
    public WebElement sizeShoe() {
        return waitUntiVisabilityElementLocated(SIZE_SHOE);
    }
    public WebElement priceShoe() {
        return waitUntiVisabilityElementLocated(PRICE_SHOE);
    }








}
