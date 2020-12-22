package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C_Check_Alert_with_Single_Filter extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-4]")
    public void Z2D_Single_Filter() {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);

        My_Supplier_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        My_Supplier_Obj.Z2D_Select_Filter();
        My_Supplier_Obj.Z2D_Data_Assertion();
        Assert.assertTrue(driver.getPageSource().contains("Litigation"));
    }
}

