package Test;

import BasesClass.TestInit;
import Page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VansOrderSelectionTest extends TestInit {
    @Test
   public void orderSelectionTest() {
        VansBasePage vansBasePage = new VansBasePage(driver);
        KidsShoesPage kidsShoesPage = new KidsShoesPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        SelectDeliveryPage selectDeliveryPage = new SelectDeliveryPage(driver);
        DeliveryDetailsData deliveryDetailsData = new DeliveryDetailsData();
        PaymentOrderSummeryPage paymentOrderSummeryPage = new PaymentOrderSummeryPage(driver);

        openUrl();
        vansBasePage.btnAllowAllSecondOpen().click();
        vansBasePage.moveCursorOnCategoryBtn(HeadersCategory.KIDS.getName()).btnClassicsInKidsBox().click();
        String NameBrand = kidsShoesPage.getNameClassics().getText();
        String PriceThirdShoes = kidsShoesPage.getPriceThirdShoes().getText().substring(1,6);
        String BrandThirdShoes = kidsShoesPage.getBrandThirdShoes().getText().toLowerCase();
        kidsShoesPage.moveThirdProductClassics().btnQuickShopThirdProduct().click();
        kidsShoesPage.fieldSelectSize().click();
        kidsShoesPage.fieldSizeTen().click();
        kidsShoesPage.btnAddToCart().click();
        vansBasePage.btnBasketOnHeader().click();

        String SizeShouse = kidsShoesPage.getSizeShoesSelect().getText();
        shoppingCartPage.btnCheckoutSecurely().click();
        selectDeliveryPage.fieldFirstName().sendKeys(deliveryDetailsData.getFirstName());
        selectDeliveryPage.fieldLastName().sendKeys(deliveryDetailsData.getLastName());
        selectDeliveryPage.fieldhouseAdress().sendKeys(deliveryDetailsData.getHouseNumber());
        selectDeliveryPage.fieldCity().sendKeys(deliveryDetailsData.getCity());
        selectDeliveryPage.fieldPostCode().sendKeys(deliveryDetailsData.getPostCode());
        selectDeliveryPage.fieldPhoneNumber().sendKeys(deliveryDetailsData.getNumberPhone());
        selectDeliveryPage.fieldEmail().sendKeys(deliveryDetailsData.getEmail());
        selectDeliveryPage.checkBoxAcceptVans().click();
        selectDeliveryPage.checkBoxKeepMe().click();
        selectDeliveryPage.btnProccedToPayment().click();
        selectDeliveryPage.fieldInfoOrder().click();

         Assert.assertTrue(paymentOrderSummeryPage.getNameOrderedProduct().getText().toLowerCase().contains(BrandThirdShoes));
         Assert.assertEquals(paymentOrderSummeryPage.getSizeShoes().getText(),SizeShouse);
         Assert.assertEquals(paymentOrderSummeryPage.getPriceShoes().getText().substring(2,7),PriceThirdShoes);
    }

    /* {"France","Favoris"},
     {"Italy","Preferiti"},
     {"Germany","Favoriten"}*/

}
