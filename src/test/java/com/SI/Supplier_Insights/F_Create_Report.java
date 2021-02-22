package com.SI.Supplier_Insights;

import com.github.javafaker.Faker;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class F_Create_Report {
    private WebDriver driver;
    Faker faker = new Faker();
    String Name = faker.name().firstName() + "1";
    String Email = faker.internet().emailAddress();

    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
        Login_Obj.Z2D_SignIn();
    }

    @Test(priority = 1)
    @Description("Scenario ID = [SI-8]")
    public void Z2D_CreateReport() throws InterruptedException {
        My_Supplier_Page My_supplier_Obj = new My_Supplier_Page(driver);
        DataManagement_Pages dataManagement_Obj = new DataManagement_Pages(driver);
        My_supplier_Obj.Z2D_Open_Supplier_List();
        My_supplier_Obj.Z2D_Open_Report_Tab();
        dataManagement_Obj.Z2D_Click_BasicInfo();
        dataManagement_Obj.Z2D_Save_Report();
        dataManagement_Obj.Z2D_Enter_Report_Name(Name);
        dataManagement_Obj.Z2D_Submit_Report();
        Assert.assertTrue(driver.findElement(dataManagement_Obj.verify_Msg).isDisplayed());
        dataManagement_Obj.Z2D_Email_Report();
        dataManagement_Obj.Z2D_Enter_Email(Email);
        dataManagement_Obj.Z2D_Submit_Email();
        ElementActions.waitForElementToBePresent(driver, dataManagement_Obj.verify_Msg, 10, true);
        Assert.assertTrue(driver.findElement(dataManagement_Obj.verify_Msg).isDisplayed());
    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }
}

