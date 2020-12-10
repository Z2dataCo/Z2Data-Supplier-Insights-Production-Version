package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing_Page {
    private final WebDriver driver;

    public Landing_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By MySupplier = By.id("aMySuppliers");
    public By Browse = By.xpath("//li[@style='position:relative;']");
    public By BrowserByIndustry = By.xpath("//a[@Class='d-flex align-items-center px-1 py-2 closeChild'][1]");
    public By AdvancedSearch = By.linkText("Advanced Search");
    public By Compare = By.id("comparecur");


    public void Z2D_Open_My_Supplier() {
        ElementActions.click(driver, MySupplier);
    }

    public void Z2D_Open_Browse_Tab() {
        ElementActions.click(driver, Browse);
    }

    public void Z2D_Open_Advanced_Search_Tab() {
        ElementActions.click(driver, AdvancedSearch);
    }

    public void Z2D_Open_Compare_Tab() {
        ElementActions.click(driver, Compare);
    }

    public void Z2D_Open_Browse_By_Industry() {
        ElementActions.click(driver, BrowserByIndustry);
    }


}
