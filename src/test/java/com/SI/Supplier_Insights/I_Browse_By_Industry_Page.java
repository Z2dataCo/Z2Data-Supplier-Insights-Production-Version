package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Browse_By_Industry_Page extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-12]")
    public void Browse_By_Industry() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Browse_By_Industry_Page Browse_by_Industry_Obj = new Browse_By_Industry_Page(driver);
        Browse_By_Product_Page Browse_By_Product_Obj = new Browse_By_Product_Page(driver);
        landing_page_Obj.Z2D_Open_Browse_Tab();
        landing_page_Obj.Z2D_Open_Browse_By_Industry();
        Browse_by_Industry_Obj.Z2D_Click_On_Industry();
        Browse_by_Industry_Obj.Z2D_Select_Supplier();
        Browse_by_Industry_Obj.Z2D_Save_Info();
        Assert.assertTrue(driver.findElement(Browse_By_Product_Obj.Verify_Msg).isDisplayed());
    }

}
