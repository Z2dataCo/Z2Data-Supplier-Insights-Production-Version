package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C_Check_Alert_with_Single_Filter {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
    }
    @Test
    @Description ("TS001 || Login to Z2Data Supplier Insights")
    public void Login() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Z2D_SignIn();
    }
    @Test(priority = 1)
    @Description("Scenario ID = [SI-4]")
    public void Z2D_Single_Filter() throws InterruptedException {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);

        My_Supplier_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        My_Supplier_Obj.Z2D_Select_Filter();
        My_Supplier_Obj.Z2D_Data_Assertion();
        Assert.assertTrue(driver.getPageSource().contains("Litigation"));
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}

