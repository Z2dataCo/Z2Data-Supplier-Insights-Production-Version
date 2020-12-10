package com.SI.Supplier_Insights;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B_My_Supplier extends SI_Test_Base {


    @Test
    public void Z2D_SupplierList() {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        Dashboard_Page Dashboard_Obj = new Dashboard_Page(driver);

        My_Supplier_Obj.Z2D_Open_Supplier_List();
        WaitAllElement();
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.DashBoard_Tab).getText(), "Dashboard");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Scrub_Tab).getText(), "Scrub");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Suppliers_Tab).getText(), "Suppliers");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Alert_Tab).getText(), "Alerts");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Reports_Tab).getText(), "Reports");

        //Validate Data From Supplier List
        Dashboard_Obj.Z2D_Open_High_Risk();
        Assert.assertTrue(driver.getPageSource().contains("Japan"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Medium_Risk();
        Assert.assertTrue(driver.getPageSource().contains("Belgium"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Low_Risk();
        Assert.assertTrue(driver.getPageSource().contains("Germany"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Public_Companies();
        Assert.assertTrue(driver.getPageSource().contains("Germany"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Private_Companies();
        Assert.assertTrue(driver.getPageSource().contains("Netherlands"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Subsidiary_Companies();
        Assert.assertTrue(driver.getPageSource().contains("United Kingdom"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Alerts();
        Assert.assertTrue(driver.getPageSource().contains("Micron Technology, Inc."));
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        Assert.assertTrue(driver.getPageSource().contains("Strong"));
        Assert.assertTrue(driver.getPageSource().contains("Japan"));
        Assert.assertTrue(driver.getPageSource().contains("Semiconductors"));
        Assert.assertTrue(driver.getPageSource().contains("Antennas"));
        Assert.assertTrue(driver.getPageSource().contains("United States"));
        My_Supplier_Obj.Z2D_Open_Scrub_Tab();
        String total = driver.findElement(Dashboard_Obj.Total_Supplier).getText();
        String ExactMatch = driver.findElement(Dashboard_Obj.Exact_Match).getText();
        String Nomatch = driver.findElement(Dashboard_Obj.No_Match).getText();
        Assert.assertTrue(driver.getPageSource().contains(total));
        Assert.assertTrue(driver.getPageSource().contains(ExactMatch));
        Assert.assertTrue(driver.getPageSource().contains(Nomatch));
        My_Supplier_Obj.Z2D_Open_Report_Tab();
        Assert.assertTrue(driver.getPageSource().contains("Basic Info"));
        Assert.assertTrue(driver.getPageSource().contains("Contacts"));
        Assert.assertTrue(driver.getPageSource().contains("Income Statement"));
        Assert.assertTrue(driver.getPageSource().contains("Balance Sheet"));
        Assert.assertTrue(driver.getPageSource().contains("Cash Flows"));
        Assert.assertTrue(driver.getPageSource().contains("Supplemental Income statement"));
        Assert.assertTrue(driver.getPageSource().contains("Supplemental Balance Sheet"));
        Assert.assertTrue(driver.getPageSource().contains("Growth Rates"));
        Assert.assertTrue(driver.getPageSource().contains("Valuations Ratios"));
        Assert.assertTrue(driver.getPageSource().contains("Margins Ratios"));


    }
}
