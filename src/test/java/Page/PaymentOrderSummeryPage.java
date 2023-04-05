package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentOrderSummeryPage extends BasePage {
    public PaymentOrderSummeryPage(WebDriver driver) {
        super(driver);
    }
    private static final String GET_NAME_ORDERED_PRODUCT = "//div[@class='item-name']";
    private static final String GET_SIZE_SHOES = "//span[@class='item-detail-attr-value'][1]";
    private static final String GET_PRICE_SHOES = "//div[@class='item-detail-total item-detail-total-js']";
    public WebElement getNameOrderedProduct() {
        return waitUntiVisabilityElementLocated(GET_NAME_ORDERED_PRODUCT);
    }
    public WebElement getSizeShoes() {
        return waitUntiVisabilityElementLocated(GET_SIZE_SHOES);
    }
    public WebElement getPriceShoes() {
        return waitUntiVisabilityElementLocated(GET_PRICE_SHOES);
    }



}
