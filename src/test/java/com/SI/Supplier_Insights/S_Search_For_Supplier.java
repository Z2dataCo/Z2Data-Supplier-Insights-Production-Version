package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S_Search_For_Supplier extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-13]")
    public void SupplierSearch() throws InterruptedException {
        Landing_Page landingPage = new Landing_Page(driver);
        Advanced_Search_Page advancedSearchPage = new Advanced_Search_Page(driver);
        Supplier_Page supplierPage = new Supplier_Page(driver);
        Compare_Page Compare_Obj = new Compare_Page(driver);
        landingPage.Z2D_Open_Advanced_Search_Tab();
        Assert.assertTrue(driver.findElement(advancedSearchPage.Last_Filter).isDisplayed());
        advancedSearchPage.Z2D_Select_Strong_Filter();
        advancedSearchPage.Z2D_Select_Supp1();
        advancedSearchPage.Z2D_Select_Supp2();
        String First_Supplier_Name = driver.findElement(advancedSearchPage.Supp1_Name).getText();
        String Second_Supplier_Name = driver.findElement(advancedSearchPage.Supp2_Name).getText();
        Assert.assertTrue(driver.findElement(advancedSearchPage.Last_Filter).isDisplayed());
        advancedSearchPage.Z2D_Compare_Advanced_Search();
        //Compare_Obj.Switch_Tabs();
        ElementActions.waitForElementToBePresent(driver,Compare_Obj.Table_Header,10,true);
        Assert.assertTrue(driver.getPageSource().contains(First_Supplier_Name));
        Assert.assertTrue(driver.getPageSource().contains(Second_Supplier_Name));
        advancedSearchPage.Z2D_ClickSave();
        ElementActions.waitForElementToBePresent(driver,supplierPage.Verify_Msg,5,true);
        Assert.assertTrue(driver.findElement(supplierPage.Verify_Msg).isDisplayed());
        advancedSearchPage.Z2D_Clear_Check_Box();
    }
}
