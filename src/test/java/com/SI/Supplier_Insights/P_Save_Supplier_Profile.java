package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P_Save_Supplier_Profile extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-21]")
    public void SaveProfile() {
        My_Supplier_Page mySupplierPage = new My_Supplier_Page(driver);
        Supplier_Page Supplier_Page_Obj = new Supplier_Page(driver);
        mySupplierPage.Z2D_Open_Supplier_List();
        mySupplierPage.Z2D_Open_Supplier_Tap();
        Supplier_Page_Obj.Z2D_Select_Supp1();
        Supplier_Page_Obj.Z2D_Select_Supp2();
        Supplier_Page_Obj.Z2D_Click_Save();
        Assert.assertTrue(driver.findElement(Supplier_Page_Obj.Verify_Msg).isDisplayed());
    }

}
