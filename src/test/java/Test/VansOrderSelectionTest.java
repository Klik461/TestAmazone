package Test;

import BasesClass.TestInit;
import Page.VansBasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VansOrderSelectionTest extends TestInit {

    String nameShouse = "KIDS OLD SKOOL SHOES (4-8 YEARS)";
    String Size = "10";
    String Prise = "£ 40.00";


    @Test
   public void orderSelectionTest() {
        VansBasePage vansBasePage = new VansBasePage(driver);

        openUrl();
        vansBasePage.btnAllowAllSecondOpen().click();
        vansBasePage.moveOnKidsBtn().btnShoesInKidsBox().click();
        vansBasePage.btnCloseNews().click();
        vansBasePage.btnCloseNews2().click();
        vansBasePage.moveToThirdClassesShoue().btnQuickShopThirdElement().click();
        vansBasePage.fieldSelectASize().click();
        vansBasePage.fieldSizeTen().click();
        vansBasePage.btnAddToCart().click();
        vansBasePage.basketBtnOnHeader().click();

        Assert.assertEquals(vansBasePage.nameShoe().getText(),nameShouse);
        Assert.assertEquals(vansBasePage.sizeShoe().getText().toString(),Size);
        Assert.assertEquals(vansBasePage.priceShoe().getText().toString(),Prise);
    }

}
