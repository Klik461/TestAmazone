package Test;

import BasesClass.TestInit;
import Page.LanguageSelectionPage;
import Page.VansBasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static java.lang.Thread.sleep;

public class CheckLocalizationTest extends TestInit{

    @DataProvider(name = "languageCheck")
    public static Object [][] languageList() {
        return new Object[][]{
                {"France","Favoris"},
                {"Italy","Preferiti"},
                {"Germany","Favoriten"}
        };
    }

    @Test(dataProvider = "languageCheck")
    public void checkLocalizationTest(String country,String nameBtn) {
        VansBasePage vansBasePage = new VansBasePage(driver);
        LanguageSelectionPage languageSelectionPage = new LanguageSelectionPage(driver);

        openUrl();
//        if (vansBasePage.btnAllowAllSecondOpenExist()) {
//            vansBasePage.btnAllowAllSecondOpen().click();
//        }
//        if (vansBasePage.btnClosePopUpSaleTenProcExist()) {
//            vansBasePage.closePopUpSaleTenProc().click();
//        }

        try {
            vansBasePage.btnAllowAllSecondOpen().click();
        }catch(Exception e) {
            System.out.println("EX_1");
        }
        try {
            vansBasePage.closePopUpSaleTenProc().click();
        }catch (Exception e) {
            System.out.println("EX_2");
        }
        vansBasePage.btnLanguageSelector().click();
        languageSelectionPage.clickBtnSelectLocation();
        languageSelectionPage.getSelectCoutryLocation(country).click();
        languageSelectionPage.clickBtnGOonLanguagePage();
        vansBasePage.btnAllowAllSecondOpen().click();
        Assert.assertTrue(vansBasePage.getNameBtnFavorite(nameBtn).getText().contains(nameBtn));
    }

    private boolean isButtonExist() {
        return driver.findElements(By.xpath("...")).size() > 0;
    }
}
