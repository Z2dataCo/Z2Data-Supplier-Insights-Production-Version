package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D_Check_Alert_with_single_filter_intel extends SI_Test_Base {


    @Test
    @Description("Scenario ID = [SI-5]")
    public void Z2D_SingleFilter() {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        My_Supplier_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        My_Supplier_Obj.ClickOnFilter();
        Assert.assertTrue(driver.findElement(My_Supplier_Obj.logo).isDisplayed());
    }
}