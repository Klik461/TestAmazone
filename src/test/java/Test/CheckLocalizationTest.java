package Test;

import BasesClass.TestInit;
import Page.LanguageSelectionPage;
import Page.VansBasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckLocalizationTest extends TestInit{

    @DataProvider(name = "languageCheck")
    public Object [][] languageList() {
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


        vansBasePage.skipAdd();
        vansBasePage.btnLanguageSelector().click();
        languageSelectionPage.clickBtnSelectLocation();
        languageSelectionPage.getSelectCoutryLocation(country).click();
        languageSelectionPage.clickBtnGOonLanguagePage();
        vansBasePage.btnAllowAllSecondOpen().click();
        Assert.assertTrue(vansBasePage.getNameBtnFavorite(nameBtn).getText().contains(nameBtn));



         /*if (vansBasePage.btnAllowAllSecondOpen().isDisplayed()) {
            vansBasePage.btnAllowAllSecondOpen().click();
            vansBasePage.btnLanguageSelector().click();
        }else if(vansBasePage.closePopUpSaleTenProc().isDisplayed()) {
            vansBasePage.closePopUpSaleTenProc().click();
            vansBasePage.btnLanguageSelector().click();
        }else vansBasePage.btnLanguageSelector().click();*/
    }







}
