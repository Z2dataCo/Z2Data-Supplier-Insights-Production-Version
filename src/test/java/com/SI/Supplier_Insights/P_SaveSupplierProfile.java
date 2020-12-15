package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P_SaveSupplierProfile extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-21]")
    public void SaveProfile() {
        My_Supplier_Page mySupplierPage = new My_Supplier_Page(driver);
        SupplierPage supplierPage = new SupplierPage(driver);
        mySupplierPage.Z2D_Open_Supplier_List();
        mySupplierPage.Z2D_OpenSupplierTap();
        supplierPage.Z2D_SelectSupp1();
        supplierPage.Z2D_SelectSupp2();
        supplierPage.Z2D_ClickSave();
        Assert.assertTrue(driver.findElement(supplierPage.VerifyMsg).isDisplayed());
    }

}
