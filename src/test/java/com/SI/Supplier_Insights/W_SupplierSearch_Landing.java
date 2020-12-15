package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class W_SupplierSearch_Landing extends SI_Test_Base {

    String Supp = "Microsoft";

    @Test
    @Description("Scenario ID = [SI-9]")
    public void SupplierSearch() {
        Landing_Page landingPage = new Landing_Page(driver);
        SupplierDetails supplierDetails = new SupplierDetails(driver);
        landingPage.Z2D_EnterSuppName(Supp);
        landingPage.Z2D_SelectSearchValue();
        WaitAllElement();
        Assert.assertTrue(driver.findElement(landingPage.Save_Btn).isDisplayed());
        Assert.assertTrue(driver.findElement(landingPage.CreateAlert).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.SuppScore).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.ContactData).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.TopCustomer).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.TopSupplier).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.TopDistributors).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.FinancialMatrex).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.TopPartner).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.location).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.LatestNews).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.RedFlag).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.SuppSummary).isDisplayed());
        Assert.assertTrue(driver.findElement(supplierDetails.FinancialData).isDisplayed());


    }
}
