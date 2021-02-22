package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.naming.ldap.PagedResultsControl;

public class H_Browse_Suppliers_By_Product {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
        Login_Obj.Z2D_SignIn();
    }

    @Test(priority = 1)
    @Description ("TS002 || Browse Suppliers By Product Type")
    public void Browse_Suppliers_By_Product() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Browse_Page browse_Obj = new Browse_Page(driver);
        landing_page_Obj.Z2D_Open_Browse_Tab();
        landing_page_Obj.Z2D_Browse_By_Product();
        browse_Obj.Z2D_Enter_Product_Name("chemical");
        browse_Obj.Click_On_Arrow();
        browse_Obj.Select_Product();
        browse_Obj.Select_Supplier();
        browse_Obj.Save_Information();
        Assert.assertTrue(driver.findElement(browse_Obj.Verify_Msg).isDisplayed());
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
