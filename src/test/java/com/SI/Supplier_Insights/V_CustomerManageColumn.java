package com.SI.Supplier_Insights;

import com.shaft.validation.Assertions;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class V_CustomerManageColumn extends SI_Test_Base {

    @Test
    @Description("Scenario ID = [SI-6]")
    public void ManageColumn() {
        My_Supplier_Page mySupplierPage = new My_Supplier_Page(driver);
        SupplierPage supplierPage = new SupplierPage(driver);
        mySupplierPage.Z2D_Open_Supplier_List();
        mySupplierPage.Z2D_OpenSupplierTap();
        supplierPage.Z2D_Click_ManageColumn();
        supplierPage.Z2D_ClickHideAll();
        supplierPage.Z2D_SaveSetting();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
    }
}
