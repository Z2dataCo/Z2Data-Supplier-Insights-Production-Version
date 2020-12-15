package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S_SearchForSupplier extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-13]")
    public void SupplierSearch() {
        Landing_Page landingPage = new Landing_Page(driver);
        AdvancedSearch advancedSearch = new AdvancedSearch(driver);
        SupplierPage supplierPage = new SupplierPage(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        advancedSearch.Z2D_SelectStrongFilter();
        advancedSearch.Z2D_SelectSupp1();
        advancedSearch.Z2D_SelectSupp2();
        advancedSearch.Z2DCompare_AdavncedSearch();
        Switch();
        advancedSearch.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearch.Z2D_ClearCheckBox();

    }

}
