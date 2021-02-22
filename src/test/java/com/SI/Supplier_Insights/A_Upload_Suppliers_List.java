package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class A_Upload_Suppliers_List  {
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
    @Test(description = "TS002 || Upload Suppliers List", enabled = false)
    public void Upload_Suppliers_List() throws AWTException {
        Landing_Page landing_page_Obj = new Landing_Page(driver);

        landing_page_Obj.Z2D_Click_on_Upload_File();
        landing_page_Obj.Z2D_Upload_BOM_File();
        landing_page_Obj.Z2D_Click_Next_for_Upload();
        landing_page_Obj.Z2D_BOM_Mapping();
        landing_page_Obj.Z2D_Click_Next_for_Mapping();
        landing_page_Obj.Z2D_ClickFinish();
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
