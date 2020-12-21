package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;

public class U_Suppliers_Details extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-23]")
    public void Validate_SupplierDetails() {
        Landing_Page landing_Page_Obj = new Landing_Page(driver);
        Advanced_Search_Page advanced_Search_Page_Obj = new Advanced_Search_Page(driver);
        Supplier_Details_Page Supplier_Details_Page_Obj = new Supplier_Details_Page(driver);
        Supplier_Page Supplier_Page_Obj = new Supplier_Page(driver);
        landing_Page_Obj.Z2D_Open_Advanced_Search_Tab();
        advanced_Search_Page_Obj.Z2D_Supplier_Profile();
        Switch_Tabs();
        Supplier_Details_Page_Obj.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.VerifyMsg).isDisplayed());
        advanced_Search_Page_Obj.Open_Drop_Down_List();
        advanced_Search_Page_Obj.Z2D_Select_All();
        advanced_Search_Page_Obj.Z2D_Click_Compare();
        Switch();
        advanced_Search_Page_Obj.Z2D_Click_Remove();
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.VerifyMsg).isDisplayed());
        advanced_Search_Page_Obj.Open_Drop_Down_List();
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.VerifyMsg).isDisplayed());

    }

}
