package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvancedSearch {
    WebDriver driver;

    public AdvancedSearch(WebDriver driver) {
        this.driver = driver;
    }


    public By Supp1 = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Supp2 = By.xpath("//tbody/tr[2]/td[1]/input[1]");
    public By Supp3 = By.xpath("//tbody/tr[3]/td[1]/input[1]");
    public By Supp4 = By.xpath("//tbody/tr[4]/td[1]/input[1]");
    public By Compare_btn = By.xpath("//a[@class='btn btn-outline-z2 float-left mr-03'][2]");
    public By Save_Btn = By.xpath("//i[@Class='la la-save']");
    public By ddl_Saved = By.xpath("//a[@data-z2dropdownsmenus='saved-menu']");
    public By cmpnyname = By.xpath("//thead/tr[1]/td[1]");
    public By Remove = By.xpath("//i[@Class='fas fa-times mr-03']");
    public By StrongFilter = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[1]/table/tbody/tr/td[1]/div/div[1]/label/span");

    public By Clear = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[2]/div[1]/div[1]/a[1]");


    public void Z2D_SelectSupp1() {
        ElementActions.click(driver, Supp1);
    }

    public void Z2D_SelectSupp2() {
        ElementActions.click(driver, Supp2);
    }

    public void Z2D_SelectSupp3() {
        ElementActions.click(driver, Supp3);
    }

    public void Z2D_SelectSupp4() {
        ElementActions.click(driver, Supp4);
    }

    public void Z2DCompare_AdavncedSearch() {
        ElementActions.click(driver, Compare_btn);
    }

    public void Z2D_ClickSave() {
        ElementActions.click(driver, Save_Btn);
    }

    public void OpenDropDownList() {
        ElementActions.click(driver, ddl_Saved);
    }

    public void Z2D_SelectAll() {
        ElementActions.click(driver, cmpnyname);
    }

    public void Z2D_ClickRemove() {
        ElementActions.click(driver, Remove);
    }

    public void Z2D_SelectStrongFilter() {
        ElementActions.click(driver, StrongFilter);
    }

    public void Z2D_ClearCheckBox() {
        ElementActions.click(driver,Clear);
    }
}
