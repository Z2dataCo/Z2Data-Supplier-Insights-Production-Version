package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare_Page {
    WebDriver driver;

    public Compare_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By Compare_Input1 = By.cssSelector("#company_autocom_0");
    public By Compare_Input2 = By.cssSelector("#company_autocom_1");
    public By Compare_Input3 = By.cssSelector("#company_autocom_2");
    public By Compare_Input4 = By.cssSelector("#company_autocom_3");
    public By Search_Value1 = By.xpath("//thead/tr[1]/th[2]/div[1]/app-company-autocomplete[1]/div[1]/div[1]/ul[1]/li[1]");
    public By Search_Value2 = By.xpath("//thead/tr[1]/th[3]/div[1]/app-company-autocomplete[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    public By Search_Value3 = By.xpath("//thead/tr[1]/th[4]/div[1]/app-company-autocomplete[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    public By Search_Value4 = By.xpath("//thead/tr[1]/th[5]/div[1]/app-company-autocomplete[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");

    public void Z2D_SetCompanyName1(String Name) {
        ElementActions.type(driver, Compare_Input1, Name);
    }

    public void Z2D_Set_Value() {
        ElementActions.click(driver, Search_Value1);
    }

    public void Z2D_Set_Value2() {
        ElementActions.click(driver, Search_Value2);
    }

    public void Z2D_Set_Company_Name2(String name) {
        ElementActions.type(driver, Compare_Input2, name);
    }

    public void Z2D_Set_Company_Name3(String name) {
        ElementActions.type(driver, Compare_Input3, name);
    }

    public void Z2D_Set_Company_Name4(String name) {
        ElementActions.type(driver, Compare_Input4, name);
    }

    public void Z2D_Set_Value3() { ElementActions.click(driver, Search_Value3); }

    public void Z2D_Set_Value4() { ElementActions.click(driver, Search_Value4); }

}
