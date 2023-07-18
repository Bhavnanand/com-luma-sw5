package com.luma.sw5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utility.Utility;

public class GearPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Overnight Duffle')]")
    WebElement oNDuffle;
    @CacheLookup
    @FindBy(xpath ="//input[@id='qty']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath ="//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath ="//span[@class='cart-price']//span)[2]")
    WebElement productPrice;

  //  By oNDuffle= By.xpath("//a[contains(text(),'Overnight Duffle')]");
 //   By quqntity= By.xpath("//input[@id='qty']");
   // By addToCart=By.xpath("//button[@id='product-addtocart-button']");
    //By shoppingCartLink =By.xpath("//a[normalize-space()='shopping cart']");

   // By updateShoppingCart=By.xpath("//span[normalize-space()='Update Shopping Cart']");
  //  By productPrice =By.xpath("//span[@class='cart-price']//span)[2]");
public void clickonDuffle(){
    clickOnElement(oNDuffle);
}
public void VerifyDuffle(){
    String actual =getTextFromElement(oNDuffle);
    Assert.assertEquals(actual,"Overnight Duffle","Both text are not equal");
}
public void changeQuantity3(String Nos){
    sendTextToElement(quantity,Nos);
}
public void addToCart(){
    clickOnElement(addToCart);
}
public void VerifiMessageYouAddedDuffleToCart(){
    String actual=getTextFromElement(By.id("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    Assert.assertEquals(actual, "You added Overnight Duffle to your ","Both message are not equal");
}
public void verifyShopingcartLink(){
    String actual =getTextFromElement(shoppingCartLink);
    Assert.assertEquals(actual,"shopping cart.","Both message are not equal" );
}
//public void verifyQuantity3(){

 //    getNumberFromElement;
 //   Assert.assertEquals(getNumberFromElement);

public void changeQuantity(String nos)
    {
        sendTextToElement(quantity,nos);
    }
    public void clickOnUpdateShoppingCart(){
    clickOnElement(updateShoppingCart);
    }
    public void productpriceverify(){
    float pprice=getNumberFromElement((By) productPrice);
        Assert.assertEquals(pprice,"225.00");
    }
}
