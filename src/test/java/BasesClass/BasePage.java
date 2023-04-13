package BasesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.fail;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement findElement(String locator) {
        return driver.findElement(By.xpath(locator));
    }

    protected WebElement waitUntilVisibilityElementLocated(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    protected void waitUntilInvisibilityElementLocated(String locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }
    protected WebElement waitUntilElementToBeClickable(String locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
    protected List<WebElement> waitUntilElementsToBoLocated(String locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }
    protected List<WebElement> waitUntilElementsToBeClickable(String locator) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    protected void moveCursor(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }



}






