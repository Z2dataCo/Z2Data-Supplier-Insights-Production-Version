package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D_Check_Alert_with_single_filter_intel extends SI_Test_Base {
    @Test
    @Description("Scenario ID = [SI-5]")
    public void Z2D_Single_Filter() {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);
        ElementActions.waitForElementToBePresent(driver, My_Supplier_Obj.Supplier_List, 10, true);
        My_Supplier_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        My_Supplier_Obj.ClickOnFilter();
        My_Supplier_Obj.Z2D_Data_Assertion();
        ElementActions.waitForElementToBePresent(driver, My_Supplier_Obj.logo, 10, true);
        My_Supplier_Obj.Assert_On_Logo();
    }
}
