package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserFactory;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class E_Check_Customer_able_Add_Edit {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
        Login_Obj.Z2D_SignIn();
    }

    @Test(priority = 1)
    @Description("Scenario ID = [SI-7]")
    public void Z2D_Customer_authorization() throws InterruptedException {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        DataManagement_Pages dataManagement_Obj = new DataManagement_Pages(driver);
        My_Supplier_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Obj.Z2D_Open_Scrub_Tab();
        int Actual_result = Integer.parseInt(driver.findElement(dataManagement_Obj.Count_Supplier_Table).getText());
        int ExpectedResult = Actual_result;
        Assert.assertEquals(Actual_result, ExpectedResult);
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Total_Supplier).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Exact_Match).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.No_Match).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.Corrected).isDisplayed());
        Assert.assertTrue(driver.findElement(dataManagement_Obj.ignored).isDisplayed());
        dataManagement_Obj.Z2D_Click_Add_Supplier();
        dataManagement_Obj.Z2D_Add_Supplier_Name("Z");
        dataManagement_Obj.Z2D_Select_Supplier();
        dataManagement_Obj.Z2D_Click_Save();
        int expected = ExpectedResult + 1;
        Assert.assertEquals(Actual_result + 1, expected);
        dataManagement_Obj.Z2D_Get_Last_Page();
        dataManagement_Obj.Z2D_Add_Note();
        dataManagement_Obj.Z2D_Enter_Text("test");
        dataManagement_Obj.Z2D_Save_Note();
        dataManagement_Obj.Z2D_Get_Last_Page();
        dataManagement_Obj.Z2D_Click_To_Remove_Supplier();
        int NewExpected = Actual_result - 1;
        Assert.assertEquals(Actual_result - 1, NewExpected);
        dataManagement_Obj.Z2D_Get_Last_Page();
        Assert.assertNotEquals(driver.getPageSource(), driver.findElements(dataManagement_Obj.Suggestion_Supplier));

    }
    @AfterClass(alwaysRun = true)
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }

}