package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class D_Check_Alert_with_single_filter_intel  {
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
    @Description("Scenario ID = [SI-5]")
    public void Z2D_Single_Filter() throws InterruptedException {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        ElementActions.waitForElementToBePresent(driver, My_Supplier_Obj.Supplier_List, 10, true);
        My_Supplier_Obj.Z2D_Open_Supplier_List(driver);
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        My_Supplier_Obj.ClickOnFilter();
        My_Supplier_Obj.Z2D_Data_Assertion();
        ElementActions.waitForElementToBePresent(driver, My_Supplier_Obj.logo, 10, true);
        My_Supplier_Obj.Assert_On_Logo();
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
