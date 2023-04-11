package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PaymentOrderSummeryPage extends BasePage {
    public PaymentOrderSummeryPage(WebDriver driver) {
        super(driver);
    }
    private static final String GET_NAME_ORDERED_PRODUCT = "//div[@class='item-name']";
    private static final String GET_SIZE_SHOES = "//span[@class='item-detail-attr-value'][1]";
    private static final String GET_PRICE_SHOES = "//div[@class='item-detail-total item-detail-total-js']";
    private static final String GET_LIST_NAME_ORDERS = "//div[@class='item-name']";
    private static final String GET_SIZE_PRODUCTS = "//div[contains(@data-part-number,'VN0')]//span[contains(.,'Size')]/parent::div/span[2]";
    private static final String GET_PRICES_PRODUCTS = "//div[@class='item-detail-total item-detail-total-js']";

    public WebElement getNameOrderedProduct() {
        return waitUntilVisibilityElementLocated(GET_NAME_ORDERED_PRODUCT);
    }
    public WebElement getSizeShoes() {
        return waitUntilVisibilityElementLocated(GET_SIZE_SHOES);
    }
    public WebElement getPriceShoes() {
        return waitUntilVisibilityElementLocated(GET_PRICE_SHOES);
    }
    public List<String> getNameProducts () {
        List<String> names = new ArrayList<>();
        for (WebElement element: waitUntilElementsToBoLocated(GET_LIST_NAME_ORDERS)) {
          names.add(element.getText().replace("1 x ", ""));
        }
        return names;
    }

    public List<String> getSizeProducts() {
        List<String> sizes = new ArrayList<>();
        for (WebElement element : waitUntilElementsToBoLocated(GET_SIZE_PRODUCTS)) {
            sizes.add(element.getText());
        }
        return sizes;
    }
    public List<String> getPricesProducts() {
        List<String> prices = new ArrayList<>();
        for (WebElement element : waitUntilElementsToBoLocated(GET_PRICES_PRODUCTS)) {
            prices.add(element.getText());
        }
        return prices;
    }



}
