package com.SI.Supplier_Insights;

import org.testng.annotations.Test;

public class N_Export_MultiFilter extends SI_Test_Base {

    @Test
    public void ExportMultiFilter() {
        My_Supplier_Page mySupplierPage = new My_Supplier_Page(driver);
        SupplierPage supplierPage = new SupplierPage(driver);
        mySupplierPage.Z2D_Open_Supplier_List();
        mySupplierPage.Z2D_OpenSupplierTap();
        supplierPage.Z2D_SelectFilter();
        supplierPage.Z2D_SuppScore();
        supplierPage.Z2D_SelectSupp1();
        supplierPage.Z2D_SelectSupp2();
        supplierPage.ExportFile();
    }
}
