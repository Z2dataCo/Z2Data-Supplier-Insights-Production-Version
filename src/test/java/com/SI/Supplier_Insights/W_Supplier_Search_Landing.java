package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class W_Supplier_Search_Landing extends SI_Test_Base {



    @Test
    @Description("Scenario ID = [SI-9]")
    public void SupplierSearch() {
        Landing_Page landing_Page_Obj = new Landing_Page(driver);
        Supplier_Details_Page supplier_Details_Page_Obj = new Supplier_Details_Page(driver);
        landing_Page_Obj.Z2D_Enter_Supplier_Name("Microsoft");
        landing_Page_Obj.Z2D_Select_Search_Value();
        WaitAllElement();
        Assert.assertTrue(driver.findElement(landing_Page_Obj.Save_Btn).isDisplayed());
        Assert.assertTrue(driver.findElement(landing_Page_Obj.CreateAlert).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.SuppScore).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.ContactData).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.TopCustomer).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.TopSupplier).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.TopDistributors).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.FinancialMatrex).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.TopPartner).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.location).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.LatestNews).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.RedFlag).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.SuppSummary).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.FinancialData).isDisplayed());


    }
}
