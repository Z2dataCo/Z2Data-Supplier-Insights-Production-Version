package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SI_TestBase {
    WebDriver driver;

    @BeforeSuite
    public void StartDriver() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        BrowserActions.navigateToURL(driver, "https://suppliers.z2data.com/","https://suppliers.z2data.com/");
    }

}
