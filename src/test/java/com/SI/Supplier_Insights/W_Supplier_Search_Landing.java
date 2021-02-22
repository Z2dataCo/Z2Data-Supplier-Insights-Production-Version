package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class W_Supplier_Search_Landing {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
    }
    @Test (priority = 1)
    @Description ("TS001 || Login to Z2Data Supplier Insights")
    public void Login() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Z2D_SignIn();
    }
    @Test (priority = 2)
    @Description ("TS001 || Supplier Search from Landing Page")
    public void Supplier_Search() {
        Landing_Page landing_Page_Obj = new Landing_Page(driver);
        Supplier_Details_Page supplier_Details_Page_Obj = new Supplier_Details_Page(driver);
        landing_Page_Obj.Z2D_Enter_Supplier_Name("Microsoft");
       // landing_Page_Obj.Z2D_Select_Search_Value();
       // Switch_Tabs();
        ElementActions.waitForElementToBePresent(driver,landing_Page_Obj.Overall_Score,5,true);
        System.out.println("OverallScore" + driver.findElement(landing_Page_Obj.Overall_Score).getText());
        Assert.assertTrue(driver.findElement(landing_Page_Obj.Save_Btn).isDisplayed());
        Assert.assertTrue(driver.findElement(landing_Page_Obj.Create_Alert).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Supp_Score).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Contact_Data).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Top_Customer).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Top_Supplier).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Top_Distributors).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Financial_Matrix).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Top_Partner).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.location).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Latest_News).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Red_Flag).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Supp_Summary).isDisplayed());
        Assert.assertTrue(driver.findElement(supplier_Details_Page_Obj.Financial_Data).isDisplayed());
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}
