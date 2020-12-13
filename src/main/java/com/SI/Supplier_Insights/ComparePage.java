package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparePage {
    WebDriver driver;

    public ComparePage(WebDriver driver) {
        this.driver = driver;
    }

    public By Compare_Input1 = By.cssSelector("#company_autocom_0");
    public By CompareInput2 = By.cssSelector("#company_autocom_1");
    public By CompareInput3 = By.cssSelector("#company_autocom_2");
    public By CompareInput4 = By.cssSelector("#company_autocom_3");
    public By SearchValue1 = By.xpath("//thead/tr[1]/th[2]/div[1]/app-company-autocomplete[1]/div[1]/div[1]/ul[1]/li[1]");
    public By SearchValue2 = By.xpath("//thead/tr[1]/th[3]/div[1]/app-company-autocomplete[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    public By SearchValue3 = By.xpath("//thead/tr[1]/th[4]/div[1]/app-company-autocomplete[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    public By SearchValue4 = By.xpath("//thead/tr[1]/th[5]/div[1]/app-company-autocomplete[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");

    public void Z2D_SetCompanyName1(String Name) {
        ElementActions.type(driver, Compare_Input1, Name);
    }

    public void Z2D_SetValue() {
        ElementActions.click(driver, SearchValue1);
    }

    public void Z2D_SetValue2() {
        ElementActions.click(driver, SearchValue2);
    }


    public void Z2D_SetCompanyName2(String name) {
        ElementActions.type(driver, CompareInput2, name);
    }

    public void Z2D_SetCompanyName3(String name) {
        ElementActions.type(driver, CompareInput3, name);
    }

    public void Z2D_SetCompanyName4(String name) {
        ElementActions.type(driver, CompareInput4, name);
    }

    public void Z2D_SetValue3() {
        ElementActions.click(driver, SearchValue3);
    }

    public void Z2D_SetValue4() {
        ElementActions.click(driver, SearchValue4);
    }

}
