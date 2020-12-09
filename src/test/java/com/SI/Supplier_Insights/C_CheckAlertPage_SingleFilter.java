package com.SI.Supplier_Insights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C_CheckAlertPage_SingleFilter extends SI_Test_Base {

    MySupplierPage mySupplierPage;

    @Test
    public void Z2D_SingleFilter() {
        mySupplierPage = new MySupplierPage(driver);
        mySupplierPage.Z2D_OpenSupplierList();
        mySupplierPage.Z2D_OpenAlertTap();
        mySupplierPage.Z2D_SelectFilter();
        Assert.assertTrue(driver.getPageSource().contains("Litigation"));
    }
}

