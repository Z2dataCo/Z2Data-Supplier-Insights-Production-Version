package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class R_Save_Supplier_AdvSearch extends SI_Test_Base {
    @Test

    @Description("Scenario ID = [SI-22]")
    public void SaveProfile_AdvancedSearch() {
        Landing_Page landingPage = new Landing_Page(driver);
        Advanced_Search_Page advancedSearchPage = new Advanced_Search_Page(driver);
        Supplier_Page supplierPage = new Supplier_Page(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        advancedSearchPage.Z2D_Select_Supp1();
        advancedSearchPage.Z2D_Select_Supp2();
        advancedSearchPage.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearchPage.Open_Drop_Down_List();
        advancedSearchPage.Z2D_Select_All();
        advancedSearchPage.Z2D_Click_Remove();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearchPage.Open_Drop_Down_List();


    }
}
