package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageSelectionPage extends BasePage {
    public LanguageSelectionPage(WebDriver driver) {
        super(driver);
    }
    private static final String BTN_SELECT_LOCATION = "//select[@id='country']";
    private static final String BTN_GO_IN_LANGUAGE_PAGE = "//button[@id='form-submit-btn']";


    public void clickBtnSelectLocation() {
        waitUntilElementToBeClickable(BTN_SELECT_LOCATION).click();
    }
    public WebElement getSelectCoutryLocation(String country) {
        return waitUntilElementToBeClickable(String.format("//option[contains(text(),'%s')]",country));
    }
    public void clickBtnGOonLanguagePage() {
        waitUntilElementToBeClickable(BTN_GO_IN_LANGUAGE_PAGE).click();
    }




}
