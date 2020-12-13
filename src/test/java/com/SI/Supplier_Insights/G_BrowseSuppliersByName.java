package com.SI.Supplier_Insights;

import org.testng.Assert;
import org.testng.annotations.Test;

public class G_BrowseSuppliersByName extends SI_Test_Base {

    String SearchValue = "3M";

    @Test
    public void Search() {
        Landing_Page landing_page = new Landing_Page(driver);
        BrowseByNamePage browseByName = new BrowseByNamePage(driver);
        landing_page.Z2D_Open_Browse_Tab();
        landing_page.Z2D_BrowseByName();
        browseByName.Z2D_SupplierSearch(SearchValue);
        browseByName.Z2D_ClickSearch();
        Assert.assertTrue(driver.findElement(browseByName.SupplierType_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browseByName.TotalRevenue_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browseByName.MarketCap_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browseByName.NetIncome_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browseByName.OfEmployees_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browseByName.SupplierScore_Tbl).isDisplayed());
        browseByName.Z2D_ClickOnLink();
    }
}
