package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S_Search_For_Supplier extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-13]")
    public void SupplierSearch() throws InterruptedException {
        Landing_Page landingPage = new Landing_Page(driver);
        Advanced_Search_Page advancedSearchPage = new Advanced_Search_Page(driver);
        Supplier_Page supplierPage = new Supplier_Page(driver);
        Compare_Page Compare_Obj = new Compare_Page(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        Assert.assertTrue(driver.findElement(advancedSearchPage.Last_Filter).isDisplayed());
        advancedSearchPage.Z2D_Select_Strong_Filter();
        advancedSearchPage.Z2D_Select_Supp1();
        advancedSearchPage.Z2D_Select_Supp2();
        Assert.assertTrue(driver.findElement(advancedSearchPage.Last_Filter).isDisplayed());
        advancedSearchPage.Z2D_Compare_Advanced_Search();
        Compare_Obj.Validate_Compare();
        advancedSearchPage.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
        advancedSearchPage.Z2D_Clear_Check_Box();


    }

}
