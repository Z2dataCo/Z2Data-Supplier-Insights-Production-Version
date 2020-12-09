package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B_MySupplier_Test extends SI_Test_Base {
    MySupplierPage mySupplierPage;
    Z2D_DashBoardPage dashBoard;


    @Test
    public void Z2D_SupplierList() {
        mySupplierPage = new MySupplierPage(driver);
        dashBoard = new Z2D_DashBoardPage(driver);

        mySupplierPage.Z2D_OpenSupplierList();
        WaitAllElement();
        Assert.assertEquals(driver.findElement(mySupplierPage.DashBoard_Tab).getText(), "Dashboard");
        Assert.assertEquals(driver.findElement(mySupplierPage.Scrub_Tab).getText(), "Scrub");
        Assert.assertEquals(driver.findElement(mySupplierPage.Suppliers_Tab).getText(), "Suppliers");
        Assert.assertEquals(driver.findElement(mySupplierPage.Alert_Tab).getText(), "Alerts");
        Assert.assertEquals(driver.findElement(mySupplierPage.Reports_Tab).getText(), "Reports");

        //Validate Data From Supplier List
        dashBoard.Z2D_OpenHighRisk();
        Assert.assertTrue(driver.getPageSource().contains("Japan"));
        mySupplierPage.Z2D_OpenDashBoardTab();
        dashBoard.Z2D_OpenMediumRisk();
        Assert.assertTrue(driver.getPageSource().contains("Belgium"));
        mySupplierPage.Z2D_OpenDashBoardTab();
        dashBoard.Z2D_OpenLowRisk();
        Assert.assertTrue(driver.getPageSource().contains("Germany"));
        mySupplierPage.Z2D_OpenDashBoardTab();
        dashBoard.Z2D_OpenPublicCompanies();
        Assert.assertTrue(driver.getPageSource().contains("Germany"));
        mySupplierPage.Z2D_OpenDashBoardTab();
        dashBoard.Z2D_OpenPrivateCompanies();
        Assert.assertTrue(driver.getPageSource().contains("Netherlands"));
        mySupplierPage.Z2D_OpenDashBoardTab();
        dashBoard.Z2D_Subsidary_Companies();
        Assert.assertTrue(driver.getPageSource().contains("United Kingdom"));
        mySupplierPage.Z2D_OpenDashBoardTab();
        dashBoard.Z2D_OpenAlerts();
        Assert.assertTrue(driver.getPageSource().contains("Micron Technology, Inc."));
        mySupplierPage.Z2D_OpenAlertTap();
        Assert.assertTrue(driver.getPageSource().contains("Strong"));
        Assert.assertTrue(driver.getPageSource().contains("Japan"));
        Assert.assertTrue(driver.getPageSource().contains("Semiconductors"));
        Assert.assertTrue(driver.getPageSource().contains("Antennas"));
        Assert.assertTrue(driver.getPageSource().contains("United States"));
        mySupplierPage.Z2D_OpenScrub();
        String total = driver.findElement(dashBoard.TotalSupplier).getText();
        String ExactMatch = driver.findElement(dashBoard.ExactMatch).getText();
        String Nomatch = driver.findElement(dashBoard.NoMatch).getText();
        Assert.assertTrue(driver.getPageSource().contains(total));
        Assert.assertTrue(driver.getPageSource().contains(ExactMatch));
        Assert.assertTrue(driver.getPageSource().contains(Nomatch));
        mySupplierPage.Z2D_OpenReportTab();
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
