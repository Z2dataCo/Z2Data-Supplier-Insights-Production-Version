package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class G_Browse_Suppliers_By_Name extends SI_Test_Base {


    @Test
    @Description("Scenario ID = [SI-10]")
    public void Search() throws InterruptedException {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Browse_By_Name_Page browse_ByName_Obj = new Browse_By_Name_Page(driver);
        landing_page_Obj.Z2D_Open_Browse_Tab();
        landing_page_Obj.Z2D_BrowseByName();
        browse_ByName_Obj.Z2D_SupplierSearch("3M");
        browse_ByName_Obj.Z2D_ClickSearch();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.SupplierType_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.TotalRevenue_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.MarketCap_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.NetIncome_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.OfEmployees_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.SupplierScore_Tbl).isDisplayed());
        WaitAllElement();
        browse_ByName_Obj.Z2D_ClickOnLink();
        browse_ByName_Obj.Assert_On_New_Tap();


    }
}