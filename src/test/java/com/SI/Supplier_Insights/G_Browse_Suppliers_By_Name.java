package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class G_Browse_Suppliers_By_Name {
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

    @Test (priority = 1)
    @Description("TS002 || Browse Suppliers By Name Type")
    public void Browse_Suppliers_By_Name (){
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Browse_Page browse_Obj = new Browse_Page(driver);
        landing_page_Obj.Z2D_Open_Browse_Tab();
        landing_page_Obj.Z2D_Browse_By_Name();
        browse_Obj.Z2D_Supplier_Search("3M");
        Assert.assertEquals(browse_Obj.is_Matched(),"3M Company");
        browse_Obj.Z2D_Click_Search_Result_Name_Page();
        ElementActions.waitForElementToBePresent(driver,browse_Obj.Supplier_Type_Tbl,10,true);
        Assert.assertTrue(driver.findElement(browse_Obj.Supplier_Type_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_Obj.Total_Revenue_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_Obj.Market_Cap_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_Obj.Net_Income_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_Obj.Of_Employees_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_Obj.Supplier_Score_Tbl).isDisplayed());
        browse_Obj.Z2D_Click_On_Link();
        browse_Obj.Assert_On_New_Tap();
    }

    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}