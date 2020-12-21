package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q_Submit_Ticket extends SI_Test_Base {

    @Test
    @Description("Scenario ID = [SI-3]")
    public void SubmitTicket() {
        Landing_Page landing_Page_Obj = new Landing_Page(driver);
        landing_Page_Obj.Z2D_Click_Submit_Ticket();
        landing_Page_Obj.Z2D_Ticket_Subject("subject");
        landing_Page_Obj.Z2D_Ticket_Description("automation");
        landing_Page_Obj.Z2D_Send_Ticket();
        Assert.assertTrue(driver.findElement(landing_Page_Obj.Verify_MSG).isDisplayed());
    }
}
