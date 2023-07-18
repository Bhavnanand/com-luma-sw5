package com.luma.sw5.TestSuite;

import com.luma.sw5.pages.GearPage;
import com.luma.sw5.pages.Homepage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GearPageTest {
    Homepage homepage;
    GearPage gearPage;

    @BeforeMethod
    public void inIt() {
        homepage = new Homepage();
        gearPage = new GearPage();
    }
        @Test(groups = {"smoke","regression"})
        public void userShouldAddProductSuccessFullyToShoppinCart() {
            //* Mouse Hover on Gear Menu
            //* Click on Bags
            homepage.mouseHoverOnGearMenuAndclickOnBags();

            //* Click on Product Name ‘Overnight Duffle’
            gearPage.clickonDuffle();

            //* Verify the text ‘Overnight Duffle’
            gearPage.VerifyDuffle();
            //* Change Qty 3
            gearPage.changeQuantity("3");

            //* Click on ‘Add to Cart’ Button.
            gearPage.addToCart();
            //* Verify the text‘You added Overnight Duffle to your shopping cart.’
            gearPage.VerifiMessageYouAddedDuffleToCart();
            //* Click on ‘shopping cart’ Link into message
            gearPage.addToCart();
            //* Verify the product name ‘Cronus Yoga Pant’
            //
            //* Verify the Qty is ‘3’
          //  gearPage.verifyQuantity3();

            //* Verify the product price ‘$135.00’

            //* Change Qty to ‘5’
            gearPage.changeQuantity("5");
            //* Click on ‘Update Shopping Cart’ button
            gearPage.clickOnUpdateShoppingCart();
            //* Verify the product price ‘$225.00’
            gearPage.productpriceverify();
        }
    }
