package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E_Check_Customer_able_Add_Edit extends SI_Test_Base {

    @Test
    @Description("Scenario ID = [SI-7]")
    public void Z2D_Customer_authorization() {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        Scrub_Page scrub_Page_obj = new Scrub_Page(driver);
        My_Supplier_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Obj.Z2D_Open_Scrub_Tab();
        WaitAllElement();
        int Actual_result = Integer.parseInt(driver.findElement(scrub_Page_obj.Count_Supplier_Table).getText());
        int ExpectedResult = 2660;
        Assert.assertEquals(Actual_result, ExpectedResult);
        Assert.assertTrue(driver.findElement(scrub_Page_obj.Total_Supplier).isDisplayed());
        Assert.assertTrue(driver.findElement(scrub_Page_obj.Exact_Match).isDisplayed());
        Assert.assertTrue(driver.findElement(scrub_Page_obj.No_Match).isDisplayed());
        Assert.assertTrue(driver.findElement(scrub_Page_obj.Corrected).isDisplayed());
        Assert.assertTrue(driver.findElement(scrub_Page_obj.ignored).isDisplayed());
        scrub_Page_obj.Z2D_Click_Add_Supplier();
        scrub_Page_obj.Z2D_Add_Supplier_Name("Z");
        scrub_Page_obj.Z2D_Select_Supplier();
        scrub_Page_obj.Z2D_Click_Save();
        WaitAllElement();
        int expected = ExpectedResult + 1;
        Assert.assertEquals(Actual_result + 1, expected);
        scrub_Page_obj.Z2D_Get_Last_Page();
        WaitAllElement();
        scrub_Page_obj.Z2D_Add_Note();
        scrub_Page_obj.Z2D_Enter_Text("test");
        scrub_Page_obj.Z2D_Save_Note();
        scrub_Page_obj.Z2D_Get_Last_Page();
        scrub_Page_obj.Z2D_Click_To_Remove_Supplier();
        WaitAllElement();
        int NewExpected = Actual_result - 1;
        Assert.assertEquals(Actual_result - 1, NewExpected);
        scrub_Page_obj.Z2D_Get_Last_Page();
        Assert.assertNotEquals(driver.getPageSource(), driver.findElements(scrub_Page_obj.SuggestionSupplier));

    }

}