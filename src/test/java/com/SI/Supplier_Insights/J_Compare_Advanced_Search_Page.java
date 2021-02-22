package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class J_Compare_Advanced_Search_Page {
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
    @Description("Scenario ID = [SI-15]")
    public void Z2D_Compare() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Advanced_Search_Page advanced_Search_Obj = new Advanced_Search_Page(driver);
        landing_page_Obj.Z2D_Open_Advanced_Search_Tab();
        advanced_Search_Obj.Z2D_Select_Supp1();
        advanced_Search_Obj.Z2D_Select_Supp2();
        advanced_Search_Obj.Z2D_Select_Supp3();
        advanced_Search_Obj.Z2D_Select_Supp4();
        Assert.assertTrue(driver.findElement(advanced_Search_Obj.Selected_Box).isSelected());
        advanced_Search_Obj.Z2D_Compare_Advanced_Search();
        advanced_Search_Obj.Switch_Tabs();
        Assert.assertTrue(driver.getCurrentUrl().contains("Compare?CompanyIds"));

    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }

}
