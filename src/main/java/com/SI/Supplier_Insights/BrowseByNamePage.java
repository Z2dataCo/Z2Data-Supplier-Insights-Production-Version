package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowseByNamePage {
    WebDriver driver;

    public BrowseByNamePage(WebDriver driver) {
        this.driver = driver;
    }

    public By SearchInput = By.xpath("//input[@placeholder='Search For Supplier']");
    public By Search_Btn = By.xpath("//a[@Class='input-group-text btn btn-info white']");
    public By LinkForSupplier = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/tbody/tr[1]/td[2]/a");
    public By SupplierType_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[3]");
    public By TotalRevenue_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[4]");
    public By MarketCap_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[5]");
    public By NetIncome_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[6]");
    public By OfEmployees_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[7]");
    public By SupplierScore_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[8]");


    public void Z2D_SupplierSearch(String value) {
        ElementActions.type(driver, SearchInput, value);
    }

    public void Z2D_ClickSearch() {
        ElementActions.click(driver, Search_Btn);
    }

    public void Z2D_ClickOnLink() {
        ElementActions.click(driver, LinkForSupplier);
    }


}
