package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;

public class U_SuppliersDetails extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-23]")
    public void Validate_SupplierDetails() {
        Landing_Page landingPage = new Landing_Page(driver);
        AdvancedSearch advancedSearch = new AdvancedSearch(driver);
        SupplierDetails supplierDetails = new SupplierDetails(driver);
        SupplierPage supplierPage = new SupplierPage(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        advancedSearch.Z2D_SupplierProfile();
        Switch_Tabs();
        supplierDetails.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearch.OpenDropDownList();
        advancedSearch.Z2D_SelectAll();
        advancedSearch.Z2D_ClickCompare();
        Switch();
        advancedSearch.Z2D_ClickRemove();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearch.OpenDropDownList();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());

    }

}
