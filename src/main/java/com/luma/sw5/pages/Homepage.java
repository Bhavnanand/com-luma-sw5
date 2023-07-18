package com.luma.sw5.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import utility.Utility;


public class Homepage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Men')]")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Women')]")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement topMenu;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement clickOnJacket;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement bottom;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pant;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Bags']")
    WebElement  bags;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Gear']")
    WebElement GearMenu;
  //  By Womenmenu = By.xpath("//span[contains(text(),'Women')]");
   // By TopMenu = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
   // By clickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    //By menMenu = By.xpath("//span[contains(text(),'Men')]");
    //By bottom = By.xpath("//a[@id='ui-id-18']");
   // By pant = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
   // By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    //By bags = By.xpath("//span[normalize-space()='Bags']");
    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() {
        mouseHoverToElement(bottom);
    }

    public void mouseHoverOnMenMenuBottomMenuAndClickOnPant() {
        mouseHoverActionforThree(menMenu, bottom, pant);
    }

    public void mouseHoverOnGearMenuAndclickOnBags() {
        mouseHoverActionForTwo(gearMenu, bags);
    }

}
