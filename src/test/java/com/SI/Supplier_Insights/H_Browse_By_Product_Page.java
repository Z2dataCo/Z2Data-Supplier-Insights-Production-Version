package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class H_Browse_By_Product_Page extends SI_Test_Base {

    @Test
    @Description("Scenario ID = [SI-11]")
    public void Search_By_Product() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Browse_By_Product_Page Browse_by_Product_Obj = new Browse_By_Product_Page(driver);
        landing_page_Obj.Z2D_Open_Browse_Tab();
        landing_page_Obj.Z2D_BrowseByProduct();
        Browse_by_Product_Obj.Z2D_Enter_Product_Name("chemical");
        Browse_by_Product_Obj.Click_On_Arrow();
        Browse_by_Product_Obj.Select_Product();
        Browse_by_Product_Obj.Select_Supplier();
        Browse_by_Product_Obj.Save_Information();
        Assert.assertTrue(driver.findElement(Browse_by_Product_Obj.VerifyMsg).isDisplayed());
    }


}
