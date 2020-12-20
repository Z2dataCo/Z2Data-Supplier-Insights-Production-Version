package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Report_Page {
    WebDriver driver;

    public Report_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By BasicInfo = By.xpath("//label[@for='chkCat_0']");
    public By SaveReport = By.xpath("//button[@class='z2actionbtnA z2actionbtnleft mr-05'][1]");
    public By ReportInput = By.xpath("//input[@placeholder='Report Name.']");
    public By SubmitReport = By.xpath("/html/body/ngb-modal-window/div/div/div/div/div[2]/button");
    public By EmailReport = By.xpath("//button[@Class='z2actionbtnA z2actionbtnleft mr-05'][2]");
    public By Email_Input = By.xpath("//input[@placeholder='Email..']");
    public By SendEmail = By.xpath("/html/body/ngb-modal-window/div/div/div/div/div[2]/button");
    public By verifyMsg = By.xpath("//div[@class='toast-message ng-star-inserted']");

    public void Z2D_Click_BasicInfo() {
        ElementActions.click(driver, BasicInfo);
    }

    public void Z2D_Save_Report() {
        ElementActions.click(driver, SaveReport);
    }

    public void Z2D_Enter_Report_Name(String Name) {
        ElementActions.type(driver, ReportInput, Name);
    }

    public void Z2D_Submit_Report() {
        ElementActions.click(driver, SubmitReport);
    }

    public void Z2D_Email_Report() {
        ElementActions.click(driver, EmailReport);
    }

    public void Z2D_Enter_Email(String Mail) {
        ElementActions.type(driver, Email_Input, Mail);
    }

    public void Z2D_Submit_Email() {
        ElementActions.click(driver, SendEmail);
    }
}
