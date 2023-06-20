package Test;

import BasesClass.TestInit;
import Page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class CheckTheOrderInformationForFiveProducts extends TestInit {

    @Test
    public void checkTheOrderInformationForFiveProducts()  {
        VansBasePage vansBasePage = new VansBasePage(driver);
        WomanJacketAndCoatsPage womanJacketAndCoatsPage = new WomanJacketAndCoatsPage(driver);
        MansHoodiesAndSweatshirtsPage mansHoodiesAndSweatshirtsPage = new MansHoodiesAndSweatshirtsPage(driver);
        KidsShoesPage kidsShoesPage = new KidsShoesPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        DeliveryDetailsData deliveryDetailsData = new DeliveryDetailsData();
        SelectDeliveryPage selectDeliveryPage = new SelectDeliveryPage(driver);
        PaymentOrderSummeryPage paymentOrderSummeryPage = new PaymentOrderSummeryPage(driver);

        openUrl();
        vansBasePage.btnAllowAllSecondOpen().click();
        vansBasePage.moveCursorOnCategoryBtn(HeadersCategory.WOMEN.getName()).btnJacketInWomanMenu().click();
        String getNameWomanBrand = womanJacketAndCoatsPage.fieldBrandProductInWomanJacket().getText().toLowerCase();
        womanJacketAndCoatsPage.btnClosePopUp().click();
        womanJacketAndCoatsPage.moveOnTheSecondProductInWomanJacket().btnQuickShopOnTheSecondProduct().click();
        String getPriceWomanJacket = womanJacketAndCoatsPage.fieldPriceWomanJacket().getText();
        womanJacketAndCoatsPage.fieldSizeInWomenJacket().click();
        String getSizeSelectionWomen = womanJacketAndCoatsPage.getSelectionSizeWomen().getText();
        womanJacketAndCoatsPage.fieldSelectionXXS().click();
        womanJacketAndCoatsPage.btnAddToCart().click();
        shoppingCartPage.btnCloseBasketPopUp().click();
        womanJacketAndCoatsPage.checkAddToCartBtnInvisible();

        vansBasePage.moveCursorOnCategoryBtn(HeadersCategory.MEN.getName()).fieldHoodiesAndSweatshirtsInMen().click();
        String getNameMenBrand = mansHoodiesAndSweatshirtsPage.getNameFiveProduct().getText().toLowerCase();
        mansHoodiesAndSweatshirtsPage.moveCursorOnTheFiveProduct().quickShopOnFiveProduct().click();
        mansHoodiesAndSweatshirtsPage.fieldSelectSizeHoodies().click();
        String getSizeMenHoodies = mansHoodiesAndSweatshirtsPage.selectSizeLAboutHoodies().getText();
        mansHoodiesAndSweatshirtsPage.selectSizeLAboutHoodies().click();
        String getPriceMenHoodies = mansHoodiesAndSweatshirtsPage.getPriceMenHoodies().getText();
        mansHoodiesAndSweatshirtsPage.btnAddToCartMenHoodies().click();
        shoppingCartPage.btnCloseBasketPopUp().click();
        mansHoodiesAndSweatshirtsPage.checkAddToCartBtnInvasible();

        vansBasePage.moveCursorOnCategoryBtn(HeadersCategory.KIDS.getName()).fieldMiniMeInKids().click();
        String getNameKidsBrand = kidsShoesPage.getNameBrandInMiniMeKids().getText().toLowerCase();
        kidsShoesPage.moveCursorOnFourProductInMiniMe().btnQuickShopOnFourProduct().click();
        kidsShoesPage.fieldSelectSize().click();
        String getSizeKidsProduct = kidsShoesPage.fieldSizeHalfTen().getText();
        kidsShoesPage.fieldSizeHalfTen().click();
        String getPriceKidsProduct = kidsShoesPage.getPriceKids().getText();
        kidsShoesPage.btnAddToCart().click();
        shoppingCartPage.btnCloseBasketPopUp().click();
        kidsShoesPage.checkAddToCartInvisibility();

        List<String> listNameProducts = new ArrayList<>();
        listNameProducts.add(getNameWomanBrand);
        listNameProducts.add(getNameMenBrand);
        listNameProducts.add(getNameKidsBrand);

        List<String> listSizeProducts = new ArrayList<>();
        listSizeProducts.add(getSizeSelectionWomen);
        listSizeProducts.add(getSizeMenHoodies);
        listSizeProducts.add(getSizeKidsProduct);

        List<String> listPriceProducts = new ArrayList<>();
        listPriceProducts.add(getPriceWomanJacket);
        listPriceProducts.add(getPriceMenHoodies);
        listPriceProducts.add(getPriceKidsProduct);

        vansBasePage.btnBasketOnHeader().click();
        shoppingCartPage.btnCheckoutSecurely().click();
        selectDeliveryPage.fieldFirstName().sendKeys(deliveryDetailsData.getFirstName());
        selectDeliveryPage.fieldLastName().sendKeys(deliveryDetailsData.getLastName());
        selectDeliveryPage.fieldhouseAdress().sendKeys(deliveryDetailsData.getHouseNumber());
        selectDeliveryPage.fieldCity().sendKeys(deliveryDetailsData.getCity());
        selectDeliveryPage.fieldPostCode().sendKeys(deliveryDetailsData.getPostCode());
        selectDeliveryPage.fieldPhoneNumber().sendKeys(deliveryDetailsData.getNumberPhone());
        selectDeliveryPage.fieldEmail().sendKeys(deliveryDetailsData.getEmail());
        selectDeliveryPage.checkBoxKeepMe().click();
        selectDeliveryPage.checkBoxAcceptVans().click();
        selectDeliveryPage.btnProccedToPayment().click();
        selectDeliveryPage.chechBtnProccedToPaymant();
        selectDeliveryPage.fieldInfoOrder().click();

        List<String> actualResultName = new ArrayList<>();
        for (int n = 0; n < listNameProducts.size(); n++) {
            actualResultName.add(paymentOrderSummeryPage.getNameProducts().get(n).toLowerCase());
        }

        Assert.assertEquals(listNameProducts, actualResultName);
        Assert.assertEquals(listPriceProducts,paymentOrderSummeryPage.getPricesProducts());
    }
}
