package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

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
    public By Table_Header = By.xpath("//a[normalize-space()='Main Data']");

    public void Z2D_SetCompanyName1(String Name) {
        ElementActions.type(driver, Compare_Input1, Name);
    }

    public void Z2D_SetValue() {
        ElementActions.click(driver, Search_Value1);
    }

    public void Z2D_SetValue2() {
        ElementActions.click(driver, Search_Value2);
    }

    public void Z2D_SetCompanyName2(String name) {
        ElementActions.type(driver, Compare_Input2, name);
    }

    public void Z2D_SetCompanyName3(String name) {
        ElementActions.type(driver, Compare_Input3, name);
    }

    public void Z2D_SetCompanyName4(String name) {
        ElementActions.type(driver, Compare_Input4, name);
    }

    public void Z2D_SetValue3() {
        ElementActions.click(driver, Search_Value3);
    }

    public void Z2D_SetValue4() {
        ElementActions.click(driver, Search_Value4);
    }

    public void Validate_Compare(){

        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
      //  driver.switchTo().window(tab2.get(0));
        driver.switchTo().window(tab2.get(1));
        ElementActions.waitForElementToBePresent(driver,Table_Header,10,true);
       // Thread.sleep(10000);
        Assert.assertTrue(driver.getPageSource().contains("Microsoft Corporation"));
        Assert.assertTrue(driver.getPageSource().contains("Amazon.com, Inc."));
        driver.switchTo().window(tab2.get(0));
    }
}
