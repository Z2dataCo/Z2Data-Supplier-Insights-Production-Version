package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupplierDetails {
    WebDriver driver;

    public SupplierDetails(WebDriver driver) {
        this.driver = driver;
    }

    public By Save = By.xpath("//body/app-root/parentroute-component/supplier-details-component/div[1]/div[1]/button[1]");
    public By ContactData = By.xpath("//*[@id=\"CompanyContactData\"]/div/div[1]");
    public By FinancialMatrex = By.xpath("//*[@id=\"CompanyFinancialMetrics\"]/div/div");
    public By TopCustomer = By.xpath("//*[@id=\"CompanyTopCustomers\"]/div[1]/div[1]");
    public By TopSupplier = By.xpath("//*[@id=\"CompanyTopSuppliers\"]/div[1]/div[1]");
    public By TopPartner = By.xpath("//*[@id=\"CompanyTopPartners\"]/div[1]/div[1]");
    public By TopDistributors = By.xpath("//*[@id=\"CompanyTopPartners\"]/div[1]/div[1]");
    public By location = By.xpath("//*[@id=\"CompanyTopLocations\"]/div/div[1]");
    public By LatestNews = By.xpath("//*[@id=\"CompanyLatestNews\"]/div[1]/div[1]");
    public By SuppScore = By.xpath("//*[@id=\"CompanySupplierScorecard\"]/div[1]");
    public By RedFlag = By.xpath("//*[@id=\"z2-2cols-sub-2cols-left\"]/app-company-latest-red-flags/div/div[1]/div[1]");
    public By SuppSummary = By.xpath("//*[@id=\"CompanySupplierScorecard\"]/div[1]/div");
    public By FinancialData = By.xpath("//*[@id=\"CompanyFinancialData\"]/div[1]/div[1]");

    public void Z2D_ClickSave() {
        ElementActions.click(driver, Save);
    }
}
