package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P_Save_Supplier_Profile {

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
    @Description("Scenario ID = [SI-21]")
    public void SaveProfile() throws InterruptedException {
        My_Supplier_Page mySupplierPage = new My_Supplier_Page(driver);
        Supplier_Page Supplier_Page_Obj = new Supplier_Page(driver);
        mySupplierPage.Z2D_Open_Supplier_List();
        mySupplierPage.Z2D_OpenSupplierTap();
        Supplier_Page_Obj.Z2D_Select_Supp1();
        Supplier_Page_Obj.Z2D_Select_Supp2();
        Supplier_Page_Obj.Z2D_Click_Save();
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.Verify_Msg).isDisplayed());
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
