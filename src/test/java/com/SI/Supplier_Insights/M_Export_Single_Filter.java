package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class M_Export_Single_Filter extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-18]")
    public void Export_Single_Filter() {
        My_Supplier_Page My_Supplier_Page_Obj = new My_Supplier_Page(driver);
        Supplier_Page supplier_Page_Obj = new Supplier_Page(driver);
        My_Supplier_Page_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Page_Obj.Z2D_Open_Supplier_Tap();
        supplier_Page_Obj.Z2D_Select_Filter();
        supplier_Page_Obj.Z2D_Select_Supp1();
        supplier_Page_Obj.Z2D_Select_Supp2();
        supplier_Page_Obj.Export_File();

    }

}
