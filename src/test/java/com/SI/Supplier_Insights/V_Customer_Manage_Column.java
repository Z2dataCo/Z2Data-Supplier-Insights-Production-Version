package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class V_Customer_Manage_Column extends SI_Test_Base {

    @Test
    @Description("Scenario ID = [SI-6]")
    public void ManageColumn() {
        My_Supplier_Page My_Supplier_Page_Obj = new My_Supplier_Page(driver);
        Supplier_Page Supplier_Page_Obj = new Supplier_Page(driver);
        My_Supplier_Page_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Page_Obj.Z2D_OpenSupplierTap();
        Supplier_Page_Obj.Z2D_Click_Manage_Column();
        Supplier_Page_Obj.Z2D_Click_HideAll();
        Supplier_Page_Obj.Z2D_Save_Setting();
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.VerifyMsg).isDisplayed());
    }
}
