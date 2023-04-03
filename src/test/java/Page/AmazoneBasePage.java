package Page;

import BasesClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazoneBasePage extends BasePage {

    public  AmazoneBasePage(WebDriver driver){
        super (driver);
    }

    public WebElement btnCategoryOnHeader() {
        return driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']"));
    }

    public WebElement getFieldSearch() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    private static final String GET_RESAULT_SEARCH = "//span[@class='a-color-state a-text-bold']";
    private static final String GET_RESULT_SEARCH_2 = "//span[@class='a-color-state a-text-bold']";
    private static final String GET_BTN_SEARCH_ON_HEADER = "//input[@id='nav-search-submit-button']";

    public WebElement getResaultSearch2() {
        return waitUntiVisabilityElementLocated(GET_RESULT_SEARCH_2);
    }
    public WebElement getBtnSearchOnHeader() {
        return waitUntiVisabilityElementLocated(GET_BTN_SEARCH_ON_HEADER);
    }
    public WebElement getResaultSearch() {
        return waitUntiVisabilityElementLocated(GET_RESAULT_SEARCH);
    }






}
