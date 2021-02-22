package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class R_Save_Supplier_AdvSearch {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
        Login_Obj.Z2D_SignIn();
    }

    @Test(priority = 1)
    @Description("Scenario ID = [SI-22]")
    public void SaveProfile_AdvancedSearch() {
        Landing_Page landingPage = new Landing_Page(driver);
        Advanced_Search_Page advancedSearchPage = new Advanced_Search_Page(driver);
        Supplier_Page supplierPage = new Supplier_Page(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        advancedSearchPage.Z2D_Select_Supp1();
        advancedSearchPage.Z2D_Select_Supp2();
        advancedSearchPage.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.Verify_Msg).isDisplayed());
        advancedSearchPage.Open_Drop_Down_List();
        advancedSearchPage.Z2D_Select_All();
        advancedSearchPage.Z2D_Click_Remove();
        Assert.assertTrue(driver.findElement(supplierPage.Verify_Msg).isDisplayed());
        advancedSearchPage.Open_Drop_Down_List();
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
