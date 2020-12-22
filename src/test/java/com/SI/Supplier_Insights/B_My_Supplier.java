package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_My_Supplier extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-2]")
    public void Z2D_SupplierList() {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        Dashboard_Page Dashboard_Obj = new Dashboard_Page(driver);
        Scrub_Page scrubPage = new Scrub_Page(driver);

        My_Supplier_Obj.Z2D_Open_Supplier_List();
        WaitAllElement();
        Assert.assertTrue(driver.findElement(Dashboard_Obj.High_Risk).isDisplayed());
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Low_Risk).isDisplayed());
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Medium_Risk).isDisplayed());
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Countries).isDisplayed());
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Public_Companies).isDisplayed());
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Private_Companies).isDisplayed());
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Subsidiary_Companies).isDisplayed());
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Alerts).isDisplayed());
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.DashBoard_Tab).getText(), "Dashboard");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Scrub_Tab).getText(), "Scrub");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Suppliers_Tab).getText(), "Suppliers");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Alert_Tab).getText(), "Alerts");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Reports_Tab).getText(), "Reports");
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Total_Supplier_Graph).isDisplayed());
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Supplier_Status_Graph).isDisplayed());

        //Validate Data From Supplier List
        Dashboard_Obj.Z2D_Open_High_Risk();
        WaitAllElement();
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Table_Count).getText().contains(driver.findElement(Dashboard_Obj.High_Risk).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Japan"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Medium_Risk();
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Table_Count).getText().contains(driver.findElement(Dashboard_Obj.Medium_Risk).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Belgium"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Low_Risk();
        WaitAllElement();
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Table_Count).getText().contains(driver.findElement(Dashboard_Obj.Low_Risk).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Germany"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Public_Companies();
        WaitAllElement();
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Table_Count).getText().contains(driver.findElement(Dashboard_Obj.Public_Companies).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Germany"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Private_Companies();
        WaitAllElement();
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Table_Count).getText().contains(driver.findElement(Dashboard_Obj.Private_Companies).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Netherlands"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Subsidiary_Companies();
        WaitAllElement();
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Subsidiary_Companies).getText().contains(driver.findElement(Dashboard_Obj.Private_Companies).getText()));
        Assert.assertTrue(driver.getPageSource().contains("United Kingdom"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        Dashboard_Obj.Z2D_Open_Alerts();
        Assert.assertTrue(driver.findElement(Dashboard_Obj.Alerts).getText().contains(driver.findElement(Dashboard_Obj.Table_Count).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Micron Technology, Inc."));
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        Assert.assertTrue(driver.getPageSource().contains("Strong"));
        Assert.assertTrue(driver.getPageSource().contains("Japan"));
        Assert.assertTrue(driver.getPageSource().contains("Semiconductors"));
        Assert.assertTrue(driver.getPageSource().contains("Antennas"));
        Assert.assertTrue(driver.getPageSource().contains("United States"));
        My_Supplier_Obj.Z2D_Open_Scrub_Tab();
        String total = driver.findElement(scrubPage.Total_Supplier).getText();
        String ExactMatch = driver.findElement(scrubPage.Exact_Match).getText();
        String No_match = driver.findElement(scrubPage.No_Match).getText();
        Assert.assertTrue(driver.getPageSource().contains(total));
        Assert.assertTrue(driver.getPageSource().contains(ExactMatch));
        Assert.assertTrue(driver.getPageSource().contains(No_match));
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
