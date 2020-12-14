package com.SI.Supplier_Insights;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class M_Export_SingleFilter extends SI_Test_Base {
    @Test
    public void ExportSingleFilter() {
        My_Supplier_Page mySupplierPage = new My_Supplier_Page(driver);
        SupplierPage supplierPage = new SupplierPage(driver);
        mySupplierPage.Z2D_Open_Supplier_List();
        mySupplierPage.Z2D_OpenSupplierTap();
        supplierPage.Z2D_SelectFilter();
        supplierPage.Z2D_SelectSupp1();
        supplierPage.Z2D_SelectSupp2();
        supplierPage.ExportFile();

    }

}
