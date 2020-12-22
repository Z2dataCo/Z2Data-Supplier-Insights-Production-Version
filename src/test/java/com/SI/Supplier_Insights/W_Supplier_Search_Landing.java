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
        Assert.assertTrue(driver.findElement(landing_Page_Obj.Create_Alert).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Supp_Score).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Contact_Data).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Top_Customer).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Top_Supplier).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Top_Distributors).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Financial_Matrix).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Top_Partner).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.location).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Latest_News).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Red_Flag).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Supp_Summary).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Financial_Data).isDisplayed());


    }
}
