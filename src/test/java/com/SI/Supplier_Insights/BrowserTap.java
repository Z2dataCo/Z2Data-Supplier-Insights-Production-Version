package com.SI.Supplier_Insights;

import org.testng.annotations.Test;

public class BrowserTap extends SI_Test_Base {

    CommonPage commonPage;

    @Test
    public void BrowserByIndustry() {
        commonPage = new CommonPage(driver);
        commonPage.OpenBrowserTap();
        commonPage.OpenBrowserTap();
        commonPage.OpenBrowserByindustry();
    }
}
