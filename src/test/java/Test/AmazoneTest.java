package Test;

import BasesClass.TestInit;
import Page.AmazoneBasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazoneTest extends TestInit {

    @Test
    public void btnGategorySearchField() {

        AmazoneBasePage amazoneBasePage = new AmazoneBasePage(driver);

        openUrl();
        amazoneBasePage.btnCategoryOnHeader().click();

        Assert.assertTrue(amazoneBasePage.btnCategoryOnHeader().isDisplayed());
    }

    @Test
    public void getFieldSearchOnHeader() {
        AmazoneBasePage amazoneBasePage = new AmazoneBasePage(driver);

        openUrl();
        amazoneBasePage.getFieldSearch().click();
        amazoneBasePage.getFieldSearch().sendKeys("Iphone13\n");

        Assert.assertEquals(amazoneBasePage.getResaultSearch().getText(),"\"Iphone13\"");
    }

    @Test
    public void getSearchBtnOnHeader() {
        AmazoneBasePage amazoneBasePage = new AmazoneBasePage(driver);
        openUrl();
        amazoneBasePage.getFieldSearch().sendKeys("MacBook");
        amazoneBasePage.getBtnSearchOnHeader().click();

        Assert.assertEquals(amazoneBasePage.getResaultSearch2().getText(),"\"MacBook\"");
    }

}
