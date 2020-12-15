package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class I_BrowseByIndustry extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-12]")
    public void BrowseByIndustry() {
        Landing_Page landing_page = new Landing_Page(driver);
        BrowseByIndustry byIndustry = new BrowseByIndustry(driver);
        BrowseByProduct byProduct = new BrowseByProduct(driver);
        landing_page.Z2D_Open_Browse_Tab();
        landing_page.Z2D_Open_Browse_By_Industry();
        byIndustry.Z2D_ClickOnIndusrty();
        byIndustry.Z2D_SelectSupplier();
        byIndustry.Z2D_SaveInfo();
        Assert.assertTrue(driver.findElement(byProduct.VerifyMsg).isDisplayed());
    }

}
