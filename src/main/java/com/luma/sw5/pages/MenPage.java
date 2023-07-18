package com.luma.sw5.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utility.Utility;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement bottom;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pant;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Men')]")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Cronus Yoga Pant']")
    WebElement CronusYogaPant;
    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'32')]")
    WebElement size32;
    @CacheLookup
    @FindBy(xpath ="//div[@class='swatch-option color'")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCart;
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement shoppingCart ;

    //By menMenu = By.xpath("//span[contains(text(),'Men')]");
   // By bottom = By.xpath("//a[@id='ui-id-18']");
    //By pant = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    //By CronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
   // By size32 = By.xpath("(//dd[contains(text(),'32')]");
    //By colourBlack = By.xpath("//div[@class='swatch-option color'])[1]");
    //By addToCart = By.xpath("//span[contains(text(),'Add to Cart')])[1]");
    //By actualmessage = By.xpath("//div[@class='message-success success message']");
    //By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    public void mouseHoverOnMenMenuBottomMenuAndClickOnPant() {
        mouseHoverToElement(menMenu);
        mouseHoverToElement(bottom);
        mouseHoverToElementAndClick(pant);

        ;
    }

    public void mouseHoverOnCronusYogaPantAndClickon32() {
     mouseHoverToElement(CronusYogaPant);
     mouseHoverToElementAndClick(size32);

    }

    public void mouseHoverOnCronusYogaPantClickOnBlackColour() {
        mouseHoverToElement(CronusYogaPant);
        mouseHoverToElementAndClick(colourBlack);
    }

    public void mouseHoverOnCPantAndClickAddToCart() {
        mouseHoverToElement(CronusYogaPant);
        mouseHoverToElementAndClick(addToCart);
    }

    public void VerifyTheTextMessage() {
        Assert.assertEquals("You added Cronus Yoga Pant to your shopping cart.", "Both MESSAGES ARE EQUAL");
    }

    public void verifyShoppingcartText() {
        String actual = getTextFromElement(shoppingCart);
        Assert.assertEquals(actual, "shopping cart.", "Both text are not equal");
    }
}
