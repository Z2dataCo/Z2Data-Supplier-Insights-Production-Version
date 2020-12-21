package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_Supplier_Search_Multi_Filter extends SI_Test_Base {

    @Test
    @Description("Scenario ID = [SI-14]")
    public void SupplierSearchMultiFilter() {
        Landing_Page landingPage = new Landing_Page(driver);
        Advanced_Search_Page advanced_Search_Page_Obj = new Advanced_Search_Page(driver);
        Supplier_Page supplierPage = new Supplier_Page(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        advanced_Search_Page_Obj.Z2D_Select_Strong_Filter();
        advanced_Search_Page_Obj.Z2D_Select_Public_Filter();
        advanced_Search_Page_Obj.Z2D_Select_Supp1();
        advanced_Search_Page_Obj.Z2D_Select_Supp2();
        advanced_Search_Page_Obj.Z2D_Compare_Advanced_Search();
        Switch();
        advanced_Search_Page_Obj.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.Verify_Msg).isDisplayed());
        advanced_Search_Page_Obj.Z2D_Clear_Check_Box();

    }
}