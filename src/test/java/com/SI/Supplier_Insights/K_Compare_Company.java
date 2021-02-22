package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class K_Compare_Company {
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
    @Description("Scenario ID = [SI-16]")
    public void CompareBetweenCompanies() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Compare_Page Compare_Page_Obj = new Compare_Page(driver);
        landing_page_Obj.Z2D_Open_Compare_Tab();
        Compare_Page_Obj.Z2D_SetCompanyName1("asd");
        Compare_Page_Obj.Z2D_SetValue();
        Compare_Page_Obj.Z2D_SetCompanyName2("mas");
        Compare_Page_Obj.Z2D_SetValue2();
        Compare_Page_Obj.Z2D_SetCompanyName3("amd");
        Compare_Page_Obj.Z2D_SetValue3();
        Compare_Page_Obj.Z2D_SetCompanyName4("dfg");
        Compare_Page_Obj.Z2D_SetValue4();
        Assert.assertTrue(driver.getCurrentUrl().contains("1049075,1003261,1000255,3639311"));
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
