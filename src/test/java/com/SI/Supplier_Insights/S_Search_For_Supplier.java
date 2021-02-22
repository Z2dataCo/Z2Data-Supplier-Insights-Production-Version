package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class S_Search_For_Supplier {
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
    @Description("Scenario ID = [SI-13]")
    public void SupplierSearch() {
        Landing_Page landingPage = new Landing_Page(driver);
        Advanced_Search_Page advancedSearchPage = new Advanced_Search_Page(driver);
        Supplier_Page supplierPage = new Supplier_Page(driver);
        Compare_Page Compare_Obj = new Compare_Page(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        Assert.assertTrue(driver.findElement(advancedSearchPage.Last_Filter).isDisplayed());
        advancedSearchPage.Z2D_Select_Strong_Filter();
        advancedSearchPage.Z2D_Select_Supp1();
        advancedSearchPage.Z2D_Select_Supp2();
        String First_Supplier_Name = driver.findElement(advancedSearchPage.Supp1_Name).getText();
        String Second_Supplier_Name = driver.findElement(advancedSearchPage.Supp2_Name).getText();
        Assert.assertTrue(driver.findElement(advancedSearchPage.Last_Filter).isDisplayed());
        advancedSearchPage.Z2D_Compare_Advanced_Search();
        //Compare_Obj.Switch_Tabs();
        ElementActions.waitForElementToBePresent(driver,Compare_Obj.Table_Header,10,true);
        Assert.assertTrue(driver.getPageSource().contains(First_Supplier_Name));
        Assert.assertTrue(driver.getPageSource().contains(Second_Supplier_Name));
        advancedSearchPage.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.Verify_Msg).isDisplayed());
        advancedSearchPage.Z2D_Clear_Check_Box();
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
