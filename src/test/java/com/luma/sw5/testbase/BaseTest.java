package com.luma.sw5.testbase;

import com.luma.sw5.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.Utility;

/**
 * Created by Jay Vaghani
 */
public class BaseTest extends Utility {

    private PropertyReader PropertyReader;
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
