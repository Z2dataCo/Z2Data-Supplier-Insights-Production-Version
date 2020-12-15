package com.SI.Supplier_Insights;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class F_CreateReport extends SI_Test_Base {

    Faker faker = new Faker();
    String Name = faker.name().firstName() + "1";
    String Email = faker.internet().emailAddress();

    @Test
    @Description("Scenario ID = [SI-8]")
    public void Z2D_CreateReport() {
        My_Supplier_Page My_supplier_Page = new My_Supplier_Page(driver);
        ReportPage reportPage = new ReportPage(driver);
        My_supplier_Page.Z2D_Open_Supplier_List();
        My_supplier_Page.Z2D_Open_Report_Tab();
        reportPage.Z2D_Click_BasicInfo();
        reportPage.Z2D_SaveReport();
        reportPage.Z2D_EnterReportName(Name);
        reportPage.Z2D_SubmitReport();
        Assert.assertTrue(driver.findElement(reportPage.verifyMsg).isDisplayed());
        reportPage.Z2D_Email_Report();
        reportPage.Z2D_EnterEmail(Email);
        reportPage.Z2D_SubmitEmail();
        Assert.assertTrue(driver.findElement(reportPage.verifyMsg).isDisplayed());

    }
}

