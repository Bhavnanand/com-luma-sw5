package com.luma.sw5.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utility.Utility;


public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement shoppingCart ;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Cronus Yoga Pant']")
    WebElement CronusYogaPant;
    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'32')]")
    WebElement size32;
    @CacheLookup
    @FindBy(xpath ="//div[@class='swatch-option color'")
    WebElement Black;


   // By ShoppingCart = By.xpath("//span[@class='base']");
   // By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    //By size32 = By.xpath("//dd[contains(text(),'32')]");
    //By colour = By.xpath("//dd[contains(text(),'Black')]");


    public void verifyShoppingcartText() {
        String actual = getTextFromElement(ShoppingCart);
        Assert.assertSame(actual, "Shopping Cart", "Both text are not equal.");

    }

    public void verifyTheProductName() {
        String actual1 = getTextFromElement(productName);
        Assert.assertEquals(actual1, "Cronus Yoga Pant", "Both Text are not equal");
    }

    public void VerifyTheSize() {
        String actual = getTextFromElement(size32);
        Assert.assertEquals(actual, "32", "Both  value are equal.");
    }

    public void veifyColour() {
        String actual = getTextFromElement(colour);
        Assert.assertEquals(actual, "Black", "Both text are not equal");
    }

}
