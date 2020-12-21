package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class G_Browse_Suppliers_By_Name extends SI_Test_Base {



    @Test
    @Description("Scenario ID = [SI-10]")
    public void Search() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Browse_By_Name_Page browse_ByName_Obj = new Browse_By_Name_Page(driver);
        landing_page_Obj.Z2D_Open_Browse_Tab();
        landing_page_Obj.Z2D_Browse_By_Name();
        browse_ByName_Obj.Z2D_Supplier_Search("3M");
        browse_ByName_Obj.Z2D_Click_Search();
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.SupplierType_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.TotalRevenue_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.MarketCap_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.NetIncome_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.OfEmployees_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.SupplierScore_Tbl).isDisplayed());
        browse_ByName_Obj.Z2D_Click_On_Link();
    }
}