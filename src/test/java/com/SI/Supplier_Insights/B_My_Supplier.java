package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class B_My_Supplier  {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
        Login_Obj.Z2D_SignIn();
    }

    @Test(priority = 2)
    @Description  ("TS002 || Check Supplier List")
    public void Z2D_Supplier_List() throws InterruptedException {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        DataManagement_Pages dataManagement_Obj = new DataManagement_Pages(driver);

        My_Supplier_Obj.Z2D_Open_Supplier_List();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.High_Risk).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Low_Risk).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Medium_Risk).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Countries).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Public_Companies).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Private_Companies).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Subsidiary_Companies).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Alerts).isDisplayed());
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.DashBoard_Tab).getText(), "Dashboard");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Scrub_Tab).getText(), "Scrub");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Suppliers_Tab).getText(), "Suppliers");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Alert_Tab).getText(), "Alerts");
        Assert.assertEquals(driver.findElement(My_Supplier_Obj.Reports_Tab).getText(), "Reports");
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Total_Supplier_Graph).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Supplier_Status_Graph).isDisplayed());

        //Validate Data From Supplier List
        dataManagement_Obj.Z2D_Open_High_Risk();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Table_Count).getText().contains(driver.findElement(dataManagement_Obj.High_Risk).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Japan"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        dataManagement_Obj.Z2D_Open_Medium_Risk();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Table_Count).getText().contains(driver.findElement(dataManagement_Obj.Medium_Risk).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Belgium"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        dataManagement_Obj.Z2D_Open_Low_Risk();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Table_Count).getText().contains(driver.findElement(dataManagement_Obj.Low_Risk).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Germany"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        dataManagement_Obj.Z2D_Open_Public_Companies();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Table_Count).getText().contains(driver.findElement(dataManagement_Obj.Public_Companies).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Germany"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        dataManagement_Obj.Z2D_Open_Private_Companies();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Table_Count).getText().contains(driver.findElement(dataManagement_Obj.Private_Companies).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Netherlands"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        dataManagement_Obj.Z2D_Subsidiary_Companies();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Subsidiary_Companies).getText().contains(driver.findElement(dataManagement_Obj.Private_Companies).getText()));
        Assert.assertTrue(driver.getPageSource().contains("United Kingdom"));
        My_Supplier_Obj.Z2D_Open_Dashboard_Tab();
        dataManagement_Obj.Z2D_Open_Alerts();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Alerts).getText().contains(driver.findElement(dataManagement_Obj.Table_Count).getText()));
        Assert.assertTrue(driver.getPageSource().contains("Micron Technology, Inc."));
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        Assert.assertTrue(driver.getPageSource().contains("Strong"));
        Assert.assertTrue(driver.getPageSource().contains("Japan"));
        Assert.assertTrue(driver.getPageSource().contains("Semiconductors"));
        Assert.assertTrue(driver.getPageSource().contains("Antennas"));
        Assert.assertTrue(driver.getPageSource().contains("United States"));
        My_Supplier_Obj.Z2D_Open_Scrub_Tab();
        String total = driver.findElement(dataManagement_Obj.Total_Supplier).getText();
        String ExactMatch = driver.findElement(dataManagement_Obj.Exact_Match).getText();
        String No_match = driver.findElement(dataManagement_Obj.No_Match).getText();
        Assert.assertTrue(driver.getPageSource().contains(total));
        Assert.assertTrue(driver.getPageSource().contains(ExactMatch));
        Assert.assertTrue(driver.getPageSource().contains(No_match));
        My_Supplier_Obj.Z2D_Open_Report_Tab();
        Assert.assertTrue(driver.getPageSource().contains("Basic Info"));
        Assert.assertTrue(driver.getPageSource().contains("Contacts"));
        Assert.assertTrue(driver.getPageSource().contains("Income Statement"));
        Assert.assertTrue(driver.getPageSource().contains("Balance Sheet"));
        Assert.assertTrue(driver.getPageSource().contains("Cash Flows"));
        Assert.assertTrue(driver.getPageSource().contains("Supplemental Income statement"));
        Assert.assertTrue(driver.getPageSource().contains("Supplemental Balance Sheet"));
        Assert.assertTrue(driver.getPageSource().contains("Growth Rates"));
        Assert.assertTrue(driver.getPageSource().contains("Valuations Ratios"));
        Assert.assertTrue(driver.getPageSource().contains("Margins Ratios"));
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
