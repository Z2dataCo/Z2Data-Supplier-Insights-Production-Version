package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class H_BrowseByProduct extends SI_Test_Base {
    String Proname = "chemical";

    @Test
    @Description("Scenario ID = [SI-11]")
    public void SearchByProduct() {
        Landing_Page landing_page = new Landing_Page(driver);
        BrowseByProduct byProduct = new BrowseByProduct(driver);
        landing_page.Z2D_Open_Browse_Tab();
        landing_page.Z2D_BrowseByProduct();
        byProduct.Z2D_EnterProductName(Proname);
        byProduct.ClickOnArrow();
        byProduct.SelectProduct();
        byProduct.SelectSupplier();
        byProduct.SaveInforamtion();
        Assert.assertTrue(driver.findElement(byProduct.VerifyMsg).isDisplayed());
    }


}
