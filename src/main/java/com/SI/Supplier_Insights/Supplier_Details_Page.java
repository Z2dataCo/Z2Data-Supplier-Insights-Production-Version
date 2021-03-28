package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Supplier_Details_Page {
    WebDriver driver;

    public Supplier_Details_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By Save = By.xpath("//body/app-root/parentroute-component/supplier-details-component/div[1]/div[1]/button[1]");
    public By Contact_Data = By.xpath("//*[@id=\"CompanyContactData\"]/div/div[1]");
    public By Financial_Matrix = By.xpath("//*[@id=\"CompanyFinancialMetrics\"]/div/div");
    public By Top_Customer = By.xpath("//*[@id=\"CompanyTopCustomers\"]/div[1]/div[1]");
    public By Top_Supplier = By.xpath("//*[@id=\"CompanyTopSuppliers\"]/div[1]/div[1]");
    public By Top_Partner = By.xpath("//*[@id=\"CompanyTopPartners\"]/div[1]/div[1]");
    public By Top_Distributors = By.xpath("//*[@id=\"CompanyTopPartners\"]/div[1]/div[1]");
    public By location = By.xpath("//*[@id=\"CompanyTopLocations\"]/div/div[1]");
    public By Latest_News = By.xpath("//*[@id=\"CompanyLatestNews\"]/div[1]/div[1]");
    public By Supp_Score = By.xpath("//*[@id=\"CompanySupplierScorecard\"]/div[1]");
    public By Red_Flag = By.xpath("//div[@class='z2-boxstyle1-header-left black']");
    public By Supp_Summary = By.xpath("//div[contains(text(),'Supplier Summary')]");
    public By Financial_Data = By.xpath("//div[contains(text(),'Financial Data')]");

    public void Z2D_ClickSave() {
        ElementActions.waitForElementToBePresent(driver,Save,20,true);
        ElementActions.click(driver, Save);
    }
}
