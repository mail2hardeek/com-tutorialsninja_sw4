package com.tutorialsninja.sw4.testbase;

import com.tutorialsninja.sw4.propertyreader.PropertyReader;
import com.tutorialsninja.sw4.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setup(){

        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){

    }
}
