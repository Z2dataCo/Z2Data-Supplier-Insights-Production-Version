package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class L_Export_Supplier_List extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-17]")
    public void Export_List() {
        My_Supplier_Page My_Supplier_Page_Obj = new My_Supplier_Page(driver);
        Supplier_Page Supplier_Page_Obj = new Supplier_Page(driver);
        My_Supplier_Page_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Page_Obj.Z2D_OpenSupplierTap();
        Supplier_Page_Obj.Z2D_Select_Supp1();
        Supplier_Page_Obj.Z2D_Select_Supp2();
        Supplier_Page_Obj.Export_File();

    }
}
