package com.SI.Supplier_Insights;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class F_Create_Report extends SI_Test_Base {

    Faker faker = new Faker();
    String Name = faker.name().firstName() + "1";
    String Email = faker.internet().emailAddress();

    @Test
    @Description("Scenario ID = [SI-8]")
    public void Z2D_CreateReport() {
        My_Supplier_Page My_supplier_Obj = new My_Supplier_Page(driver);
        Report_Page reportObj = new Report_Page(driver);
        My_supplier_Obj.Z2D_Open_Supplier_List();
        My_supplier_Obj.Z2D_Open_Report_Tab();
        reportObj.Z2D_Click_BasicInfo();
        reportObj.Z2D_Save_Report();
        reportObj.Z2D_Enter_Report_Name(Name);
        reportObj.Z2D_Submit_Report();
        Assert.assertTrue(driver.findElement(reportObj.verifyMsg).isDisplayed());
        reportObj.Z2D_Email_Report();
        reportObj.Z2D_Enter_Email(Email);
        reportObj.Z2D_Submit_Email();
        Assert.assertTrue(driver.findElement(reportObj.verifyMsg).isDisplayed());

    }
}

