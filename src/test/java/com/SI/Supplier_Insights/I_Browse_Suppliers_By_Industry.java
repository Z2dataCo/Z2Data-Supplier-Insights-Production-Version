package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class I_Browse_Suppliers_By_Industry {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
    }
    @Test
    @Description("TS001 || Login to Z2Data Supplier Insights")
    public void Login() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Z2D_SignIn();
    }

    @Test(priority = 1)
    @Description("TS002 || Browse Suppliers By Industry Type")
    public void Browse_Suppliers_By_Industry() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Browse_Page browse_Obj = new Browse_Page(driver);
        landing_page_Obj.Z2D_Open_Browse_Tab();
        landing_page_Obj.Z2D_Open_Browse_By_Industry();
        browse_Obj.Z2D_Click_On_Industry();
        browse_Obj.Z2D_Select_Supplier();
        browse_Obj.Z2D_SaveInfo();
        Assert.assertTrue(driver.findElement(browse_Obj.Verify_Msg).isDisplayed());
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
