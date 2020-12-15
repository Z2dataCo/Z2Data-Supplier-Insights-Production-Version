package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupplierDetails {
    WebDriver driver;

    public SupplierDetails(WebDriver driver) {
        this.driver = driver;
    }

    public By Save = By.xpath("//body/app-root/parentroute-component/supplier-details-component/div[1]/div[1]/button[1]");

    public void Z2D_ClickSave() {
        ElementActions.click(driver, Save);
    }
}
