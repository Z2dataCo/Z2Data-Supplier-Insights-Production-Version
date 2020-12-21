package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class K_Compare_Company extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-16]")
    public void CompareBetweenCompanies() {
        Landing_Page landing_page_Obj = new Landing_Page(driver);
        Compare_Page Compare_Page_Obj = new Compare_Page(driver);
        landing_page_Obj.Z2D_Open_Compare_Tab();
        Compare_Page_Obj.Z2D_SetCompanyName1("asd");
        Compare_Page_Obj.Z2D_Set_Value();
        Compare_Page_Obj.Z2D_Set_Company_Name2("mas");
        Compare_Page_Obj.Z2D_Set_Value2();
        Compare_Page_Obj.Z2D_Set_Company_Name3("amd");
        Compare_Page_Obj.Z2D_Set_Value3();
        Compare_Page_Obj.Z2D_Set_Company_Name4("dfg");
        Compare_Page_Obj.Z2D_Set_Value4();
        Assert.assertTrue(driver.getCurrentUrl().contains("1049075,1003261,1000255,3639311"));


    }

}
