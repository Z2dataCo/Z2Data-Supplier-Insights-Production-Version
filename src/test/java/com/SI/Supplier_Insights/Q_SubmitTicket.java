package com.SI.Supplier_Insights;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Q_SubmitTicket extends SI_Test_Base {

    String Test = "subject";
    String issue = "automation";

    @Test
    @Description("Scenario ID = [SI-3]")
    public void SubmitTicket() {
        Landing_Page landingPage = new Landing_Page(driver);
        landingPage.Z2D_ClickSubmitTicket();
        landingPage.Z2D_TicketSubject(Test);
        landingPage.Z2D_TicketDescription(issue);
        landingPage.Z2D_SendTicket();

    }
}
