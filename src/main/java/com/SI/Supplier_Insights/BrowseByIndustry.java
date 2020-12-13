package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowseByIndustry {
    WebDriver driver;

    public BrowseByIndustry(WebDriver driver) {
        this.driver = driver;
    }

    public By Searchinput = By.xpath("//input[@placeholder='Search within Industries']");
    public By ProductName = By.xpath("//a[@ng-reflect-router-link='/Company/1291160']");
    public By IndustrY = By.partialLinkText("3D Printing & Additi");
    public By CheckBox_Supplier = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Save_Btn = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[2]/div[1]/div[1]/a[3]");

    public void Z2D_ClickOnIndusrty() {
        ElementActions.click(driver, IndustrY);
    }

    public void Z2D_SelectSupplier() {
        ElementActions.click(driver, CheckBox_Supplier);

    }

    public void Z2D_SaveInfo() {
        ElementActions.click(driver, Save_Btn);
    }


}
