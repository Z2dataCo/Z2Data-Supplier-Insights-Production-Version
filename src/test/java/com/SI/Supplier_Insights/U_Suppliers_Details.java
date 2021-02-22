package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import com.sun.jna.platform.win32.OaIdl;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class U_Suppliers_Details {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
    }
    @Test(description = "TS001 || Login to Z2Data Supplier Insights", priority = 1)
    public void Login() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Z2D_SignIn();
    }
    //Bugy : items is not added in Saved List
    @Test(enabled = false)
    @Description("Scenario ID = [SI-23]")
    public void Validate_SupplierDetails() {
        Landing_Page landing_Page_Obj = new Landing_Page(driver);
        Advanced_Search_Page advanced_Search_Page_Obj = new Advanced_Search_Page(driver);
        Supplier_Details_Page Supplier_Details_Page_Obj = new Supplier_Details_Page(driver);
        Supplier_Page Supplier_Page_Obj = new Supplier_Page(driver);
        landing_Page_Obj.Z2D_Open_Advanced_Search_Tab();
        advanced_Search_Page_Obj.Z2D_Supplier_Profile();
        advanced_Search_Page_Obj.Switch_Tabs();
        Supplier_Details_Page_Obj.Z2D_ClickSave();
        ElementActions.waitForElementToBePresent(driver,Supplier_Page_Obj.Verify_Msg,10,true);
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.Verify_Msg).isDisplayed());
        advanced_Search_Page_Obj.Open_Drop_Down_List();
        advanced_Search_Page_Obj.Z2D_Select_All();
        advanced_Search_Page_Obj.Z2D_Click_Compare();
        advanced_Search_Page_Obj.Switch_Back();
        advanced_Search_Page_Obj.Z2D_Click_Remove();
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.Verify_Msg).isDisplayed());
        advanced_Search_Page_Obj.Open_Drop_Down_List();
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.Verify_Msg).isDisplayed());

    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
