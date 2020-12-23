package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
public class M_Export_Single_Filter extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-18]")
    public void Export_Single_Filter() {
        My_Supplier_Page My_Supplier_Page_Obj = new My_Supplier_Page(driver);
        Supplier_Page supplier_Page_Obj = new Supplier_Page(driver);
        Advanced_Search_Page advanced_Search_Obj = new Advanced_Search_Page(driver);
        My_Supplier_Page_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Page_Obj.Z2D_OpenSupplierTap();
        WaitAllElement();
        supplier_Page_Obj.Z2D_Select_Filter();
        ElementActions.waitForElementToBePresent(driver,supplier_Page_Obj.Supp1,30,true);
        supplier_Page_Obj.Z2D_Select_Supp1();
        supplier_Page_Obj.Z2D_Select_Supp2();
        supplier_Page_Obj.Export_File();
    }
}
