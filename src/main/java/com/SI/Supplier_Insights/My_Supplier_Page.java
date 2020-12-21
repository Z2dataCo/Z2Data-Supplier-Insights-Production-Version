package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class My_Supplier_Page {
    private final WebDriver driver;

    public My_Supplier_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By Supplier_List = By.partialLinkText("Hadeer_ Supplier Li");
    public By DashBoard_Tab = By.xpath("//*[@id=\"z2tableA-contain\"]/div[1]/ul/li[1]/a");
    public By Suppliers_Tab = By.linkText("Suppliers");
    public By Alert_Tab = By.linkText("Alerts");
    public By Scrub_Tab = By.linkText("Scrub");
    public By Reports_Tab = By.linkText("Reports");
    public By SingleFilter = By.xpath("//label[@for='chk_Types_0']");
    public By intelFilter = By.xpath("//label[@for='chk_Supplier_1']");
    public By logo = By.xpath("//*[@id=\"z2tableA-contain\"]/div[3]/table/tbody/tr[1]/td[1]/section/a/img");


    public void Z2D_Data_Assertion() {
        for (int i = 1; i >= 25; i++) {
            Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"z2tableA-contain\"]/div[3]/table/tbody/tr[" + i + "]/td[2]//a")).getText(), "Intel Corpration");
        }
    }

    public void Z2D_Open_Supplier_List() {
        ElementActions.click(driver, Supplier_List);
    }

    public void Z2D_Open_Dashboard_Tab() {
        ElementActions.click(driver, DashBoard_Tab);
    }

    public void Z2D_Open_Alert_Tab() {
        ElementActions.click(driver, Alert_Tab);
    }

    public void Z2D_Open_Scrub_Tab() {
        ElementActions.click(driver, Scrub_Tab);
    }

    public void Z2D_Open_Report_Tab() {
        ElementActions.click(driver, Reports_Tab);
    }

    public void Z2D_Select_Filter() {
        ElementActions.click(driver, SingleFilter);
    }

    public void ClickOnFilter() {
        ElementActions.click(driver, intelFilter);
    }

    public void Z2D_OpenSupplierTap() {
        ElementActions.click(driver, Suppliers_Tab);
    }
}
