package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage {
    private WebDriver driver;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    public By MySupplier = By.id("aMySuppliers");
    public By Browser = By.xpath("//li[@style='position:relative;']");
    public By BrowserByIndustry= By.xpath("//a[@Class='d-flex align-items-center px-1 py-2 closeChild'][1]");
    public By AdvancedSearch = By.linkText("Advanced Search");
    public By Compare = By.id("comparecur");


    public void OpenMySupplier() {
        ElementActions.click(driver, MySupplier);
    }
    public void OpenBrowserTap() {
        ElementActions.click(driver, Browser);
    }

    public void OpenAdvancedSearchTap(){
        ElementActions.click(driver,AdvancedSearch);
    }

    public void OpenCompareTap(){
        ElementActions.click(driver,Compare);
    }

    public void OpenBrowserByindustry(){
        ElementActions.click(driver,BrowserByIndustry);
    }
}
