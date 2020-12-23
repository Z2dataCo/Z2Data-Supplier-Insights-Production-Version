package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class J_Compare_Advanced_Search_Page extends SI_Test_Base {

    @Test
    @Description("Scenario ID = [SI-15]")
    public void Z2D_Compare() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Advanced_Search_Page advanced_Search_Obj = new Advanced_Search_Page(driver);
        landing_page_Obj.Z2D_Open_Advanced_Search_Tab();
        advanced_Search_Obj.Z2D_Select_Supp1();
        advanced_Search_Obj.Z2D_Select_Supp2();
        advanced_Search_Obj.Z2D_Select_Supp3();
        advanced_Search_Obj.Z2D_Select_Supp4();
        Assert.assertTrue(driver.findElement(advanced_Search_Obj.Selected_Box).isSelected());
        advanced_Search_Obj.Z2D_Compare_Advanced_Search();
        Switch_Tabs();
        Assert.assertTrue(driver.getCurrentUrl().contains("Compare?CompanyIds"));

    }


}
