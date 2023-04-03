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

    public WebElement getResaultSearch() {
        return driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
    }


    private static final String GET_RESULT_SEARCH_BTN = "//span[@class='a-color-state a-text-bold']";
    private static final String GET_BTN_SEARCH_ON_HEADER = "//input[@id='nav-search-submit-button']";

    public WebElement getResaultSearchBtn() {
        return waitUntiVisabilityElementLocated(GET_RESULT_SEARCH_BTN);
    }
    public WebElement getBtnSearchOnHeader() {
        return waitUntiVisabilityElementLocated(GET_BTN_SEARCH_ON_HEADER);
    }






}
