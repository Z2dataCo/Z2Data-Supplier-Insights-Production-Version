package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T_Supplier_Search_Multi_Filter {
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
    @Description("Scenario ID = [SI-14]")
    public void SupplierSearchMultiFilter() throws InterruptedException {
        Landing_Page landingPage = new Landing_Page(driver);
        Advanced_Search_Page advanced_Search_Page_Obj = new Advanced_Search_Page(driver);
        Supplier_Page supplierPage = new Supplier_Page(driver);
        Compare_Page Compare_Obj = new Compare_Page(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        advanced_Search_Page_Obj.Z2D_Select_Strong_Filter();
        advanced_Search_Page_Obj.Z2D_Select_Public_Filter();
        advanced_Search_Page_Obj.Z2D_Select_Supp1();
        advanced_Search_Page_Obj.Z2D_Select_Supp2();
        String First_Supplier_Name = driver.findElement(advanced_Search_Page_Obj.Supp1_Name).getText();
        String Second_Supplier_Name = driver.findElement(advanced_Search_Page_Obj.Supp2_Name).getText();
        advanced_Search_Page_Obj.Z2D_Compare_Advanced_Search();
        ElementActions.waitForElementToBePresent(driver,Compare_Obj.Table_Header,10,true);
        Assert.assertTrue(driver.getPageSource().contains(First_Supplier_Name));
        Assert.assertTrue(driver.getPageSource().contains(Second_Supplier_Name));
        //Compare_Obj.Switch_Tabs();
        advanced_Search_Page_Obj.Z2D_ClickSave();
        ElementActions.waitForElementToBePresent(driver,supplierPage.Verify_Msg,5,true);
        Assert.assertTrue(driver.findElement(supplierPage.Verify_Msg).isDisplayed());
        advanced_Search_Page_Obj.Z2D_Clear_Check_Box();
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}