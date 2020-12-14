package com.SI.Supplier_Insights;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T_SupplierSearchMultiFilter extends SI_Test_Base {

    @Test
    public void SupplierSearchMultiFilter() {
        Landing_Page landingPage = new Landing_Page(driver);
        AdvancedSearch advancedSearch = new AdvancedSearch(driver);
        SupplierPage supplierPage = new SupplierPage(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        advancedSearch.Z2D_SelectStrongFilter();
        advancedSearch.Z2Data_SelecetPublicFilter();
        advancedSearch.Z2D_SelectSupp1();
        advancedSearch.Z2D_SelectSupp2();
        advancedSearch.Z2DCompare_AdavncedSearch();
        Switch();
        advancedSearch.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearch.Z2D_ClearCheckBox();

    }
}