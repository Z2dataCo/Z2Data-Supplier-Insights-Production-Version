package com.SI.Supplier_Insights;

import org.testng.Assert;
import org.testng.annotations.Test;

public class J_Compare_AdvancedSearch extends SI_Test_Base {

    @Test
    public void Z2D_Compare() {
        Landing_Page landing_page = new Landing_Page(driver);
        AdvancedSearch advancedSearch = new AdvancedSearch(driver);
        landing_page.Z2D_Open_Advanced_Search_Tab();
        advancedSearch.Z2D_SelectSupp1();
        advancedSearch.Z2D_SelectSupp2();
        advancedSearch.Z2D_SelectSupp3();
        advancedSearch.Z2D_SelectSupp4();
        advancedSearch.Z2DCompare_AdavncedSearch();
        Switch_Tabs();
        Assert.assertTrue(driver.getCurrentUrl().contains("1002120,1005481,1000376,1003387"));

    }


}
