package com.SI.Supplier_Insights;

import org.testng.Assert;
import org.testng.annotations.Test;

public class K_Compare_Company extends SI_Test_Base {
    String Company1 = "asd";
    String Company2 = "mas";
    String Company3 = "amd";
    String Company4 = "dfg";


    @Test
    public void CompareBetweenCompanies() {
        Landing_Page landing_page = new Landing_Page(driver);
        ComparePage comparePage = new ComparePage(driver);
        landing_page.Z2D_Open_Compare_Tab();
        comparePage.Z2D_SetCompanyName1(Company1);
        comparePage.Z2D_SetValue();
        comparePage.Z2D_SetCompanyName2(Company2);
        comparePage.Z2D_SetValue2();
        comparePage.Z2D_SetCompanyName3(Company3);
        comparePage.Z2D_SetValue3();
        comparePage.Z2D_SetCompanyName4(Company4);
        comparePage.Z2D_SetValue4();
        Assert.assertTrue(driver.getCurrentUrl().contains("1049075,1003261,1000255,3639311"));


    }

}
