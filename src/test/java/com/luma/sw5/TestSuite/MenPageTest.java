package com.luma.sw5.TestSuite;

import com.luma.sw5.pages.Homepage;
import com.luma.sw5.pages.MenPage;
import com.luma.sw5.pages.ShoppingCartPage;
import com.luma.sw5.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenPageTest extends BaseTest {
    Homepage homepage;
    ShoppingCartPage shoppingCartPage;
    MenPage menPage;

    @BeforeMethod
    public void inIt() throws InterruptedException {
        homepage = new Homepage();
        menPage = new MenPage();
        shoppingCartPage = new ShoppingCartPage();
    }

    @Test(groups = {"smoke","regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //* Mouse Hover on Men Menu

        //* Mouse Hover on Bottoms

        //* Click on Pants
        homepage.mouseHoverOnMenMenuBottomMenuAndClickOnPant();
        Thread.sleep(1000);

        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on size32.
        menPage.mouseHoverOnCronusYogaPantAndClickon32();
        Thread.sleep(1000);
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack.
        menPage.mouseHoverOnCronusYogaPantClickOnBlackColour();
        Thread.sleep(1000);
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        menPage.mouseHoverOnCPantAndClickAddToCart();
        Thread.sleep(1000
        );
        //* Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        menPage.VerifyTheTextMessage();


        //* Click on ‘shopping cart’ Link into message Verify the text ‘Shopping Cart.’
        shoppingCartPage.verifyShoppingcartText();
        //* Verify the product name ‘Cronus Yoga Pant’
        shoppingCartPage.verifyTheProductName();
        //* Verify the product size ‘32’
        shoppingCartPage.VerifyTheSize();
        //* Verify the product colour ‘Black’
        shoppingCartPage.veifyColour();
        //
    }
}
