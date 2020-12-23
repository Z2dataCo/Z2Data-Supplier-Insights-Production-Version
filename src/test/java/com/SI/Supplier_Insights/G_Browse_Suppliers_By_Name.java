package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class G_Browse_Suppliers_By_Name extends SI_Test_Base {


    @Test
    @Description("Scenario ID = [SI-10]")
    public void Search() throws InterruptedException {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Browse_By_Name_Page browse_ByName_Obj = new Browse_By_Name_Page(driver);
        landing_page_Obj.Z2D_Open_Browse_Tab();
        landing_page_Obj.Z2D_Browse_By_Name();
        browse_ByName_Obj.Z2D_Supplier_Search("3M");
        browse_ByName_Obj.Z2D_Click_Search();
        ElementActions.waitForElementToBePresent(driver,browse_ByName_Obj.Supplier_Type_Tbl,10,true);
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.Supplier_Type_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.Total_Revenue_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.Market_Cap_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.Net_Income_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.Of_Employees_Tbl).isDisplayed());
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.Supplier_Score_Tbl).isDisplayed());
        WaitAllElement();
        browse_ByName_Obj.Z2D_Click_On_Link();
        browse_ByName_Obj.Assert_On_New_Tap();

    }
}