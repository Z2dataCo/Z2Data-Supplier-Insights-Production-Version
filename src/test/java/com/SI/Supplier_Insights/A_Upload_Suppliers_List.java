package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import java.awt.*;

public class A_Upload_Suppliers_List extends SI_Test_Base {

    @Test
    @Description("Scenario ID = [SI-1]")
    public void Upload_Suppliers_List() throws AWTException {
        Upload_Supplier_List_Module Upload_Supplier_List_Obj = new Upload_Supplier_List_Module(driver);

        Upload_Supplier_List_Obj.Z2D_Click_on_Upload_File();
        Upload_Supplier_List_Obj.Z2D_Upload_BOM_File();
        Upload_Supplier_List_Obj.Z2D_Click_Next_for_Upload();
        Upload_Supplier_List_Obj.Z2D_BOM_Mapping();
        Upload_Supplier_List_Obj.Z2D_Click_Next_for_Mapping();
        Upload_Supplier_List_Obj.Z2D_ClickFinish();
    }
}
