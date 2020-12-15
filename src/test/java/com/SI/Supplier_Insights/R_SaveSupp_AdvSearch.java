package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class R_SaveSupp_AdvSearch extends SI_Test_Base {
    @Test

    @Description("Scenario ID = [SI-22]")
    public void SaveProfile_AdvancedSearch() {
        Landing_Page landingPage = new Landing_Page(driver);
        AdvancedSearch advancedSearch = new AdvancedSearch(driver);
        SupplierPage supplierPage = new SupplierPage(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        advancedSearch.Z2D_SelectSupp1();
        advancedSearch.Z2D_SelectSupp2();
        advancedSearch.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearch.OpenDropDownList();
        advancedSearch.Z2D_SelectAll();
        advancedSearch.Z2D_ClickRemove();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearch.OpenDropDownList();


    }
}
