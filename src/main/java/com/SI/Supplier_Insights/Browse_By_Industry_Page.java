package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Browse_By_Industry_Page {
    WebDriver driver;

    public Browse_By_Industry_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By Search_input = By.xpath("//input[@placeholder='Search within Industries']");
    public By Product_Name = By.xpath("//a[@ng-reflect-router-link='/Company/1291160']");
    public By Industry = By.partialLinkText("3D Printing & Additi");
    public By CheckBox_Supplier = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Save_Btn = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[2]/div[1]/div[1]/a[3]");

    public void Z2D_Click_On_Industry() {
        ElementActions.click(driver, Industry);
    }

    public void Z2D_Select_Supplier() {
        ElementActions.click(driver, CheckBox_Supplier);
    }

    public void Z2D_Save_Info() {
        ElementActions.click(driver, Save_Btn);
    }

}
