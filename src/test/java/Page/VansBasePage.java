package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VansBasePage extends BasePage {

    public VansBasePage(WebDriver driver){
        super (driver);
    }

    private static final String BTN_KIDS_ON_HEADER = "//a[@id='topnav-item-cms--1921171013']";
    private static final String BTN_CLASSICS_IN_KIDS_BOX = "//ul[@id='topnav-dropdown-cms--1529541508']//a[contains(text(),'Classics')]";
    private static final String BTN_ALLOW_ALL_SECOND_OPEN = "//button[@id='onetrust-accept-btn-handler']";


    public WebElement btnKidsOnHeader() {
        return waitUntiVisabilityElementLocated(BTN_KIDS_ON_HEADER);
    }
    public VansBasePage moveOnKidsBtn() {
        moveCursor(btnKidsOnHeader());
        return this;
    }
    public WebElement btnClassicsInKidsBox() {
        return waitUntiVisabilityElementLocated(BTN_CLASSICS_IN_KIDS_BOX);
    }
    public WebElement btnAllowAllSecondOpen() {
        return waitUntilElementToBeClickable(BTN_ALLOW_ALL_SECOND_OPEN);
    }

}
