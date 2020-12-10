package com.SI.Supplier_Insights;

import com.shaft.validation.Assertions;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E_Check_Customer_able_Add_Edit extends SI_Test_Base {

    @Test
    public void Z2D_Customer_authorization() {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        ScrubPage scrubPage = new ScrubPage(driver);
        My_Supplier_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Obj.Z2D_Open_Scrub_Tab();
        Assert.assertTrue(driver.findElement(scrubPage.Total_Supplier).isDisplayed());
        Assert.assertTrue(driver.findElement(scrubPage.Exact_Match).isDisplayed());
        Assert.assertTrue(driver.findElement(scrubPage.No_Match).isDisplayed());
        Assert.assertTrue(driver.findElement(scrubPage.Corrected).isDisplayed());
        Assert.assertTrue(driver.findElement(scrubPage.ignored).isDisplayed());
        scrubPage.Z2D_ClickAddSupplier();
        scrubPage.Z2D_AddSupplierName("Z");
        scrubPage.Z2D_SelectSupplier();
        scrubPage.Z2D_ClickSave();
        scrubPage.Z2D_GetLastPage();
        scrubPage.Z2D_AddNote();
        scrubPage.Z2D_EnterText("test");
        scrubPage.Z2D_SaveNote();
        scrubPage.Z2D_GetLastPage();
        scrubPage.Z2D_ClickToRemoveSupplier();
        scrubPage.Z2D_GetLastPage();
        Assert.assertNotEquals(driver.getPageSource(),driver.findElements(scrubPage.SuggestionSupplier));

    }

}