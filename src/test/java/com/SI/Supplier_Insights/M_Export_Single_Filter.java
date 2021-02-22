package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class M_Export_Single_Filter {
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
    @Test
    @Description("Scenario ID = [SI-18]")
    public void Export_Single_Filter() throws InterruptedException {
        My_Supplier_Page My_Supplier_Page_Obj = new My_Supplier_Page(driver);
        Supplier_Page supplier_Page_Obj = new Supplier_Page(driver);
        Advanced_Search_Page advanced_Search_Obj = new Advanced_Search_Page(driver);
        My_Supplier_Page_Obj.Z2D_Open_Supplier_List(driver);
        My_Supplier_Page_Obj.Z2D_OpenSupplierTap();
        supplier_Page_Obj.Z2D_Select_Filter();
        ElementActions.waitForElementToBePresent(driver,supplier_Page_Obj.Supp1,30,true);
        supplier_Page_Obj.Z2D_Select_Supp1();
        supplier_Page_Obj.Z2D_Select_Supp2();
        supplier_Page_Obj.Export_File();
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
