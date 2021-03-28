package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Report_Page {
    WebDriver driver;

    public Report_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By Basic_Info = By.xpath("//label[@for='chkCat_0']");
    public By Save_Report = By.xpath("//div[@id='report_list']//button[normalize-space()='Save Report']");
    public By Report_Input = By.xpath("//input[@placeholder='Report Name.']");
    public By Submit_Report = By.xpath("/html/body/ngb-modal-window/div/div/div/div/div[2]/button");
    public By Email_Report = By.xpath("//div[@id='report_list']//button[normalize-space()='Email Report']");
    public By Email_Input = By.xpath("//input[@placeholder='Email..']");
    public By Send_Email = By.xpath("//button[normalize-space()='Send Eamil']");
    public By verify_Msg = By.xpath("//div[@class='toast-message ng-star-inserted']");

    public void Z2D_Click_BasicInfo() {
        ElementActions.click(driver, Basic_Info);
    }

    public void Z2D_Save_Report() {
        ElementActions.click(driver, Save_Report);
    }

    public void Z2D_Enter_Report_Name(String Name) {
        ElementActions.waitForElementToBePresent(driver,Report_Input,5,true);
        ElementActions.type(driver, Report_Input, Name);
    }

    public void Z2D_Submit_Report() {
        ElementActions.click(driver, Submit_Report);
    }

    public void Z2D_Email_Report() {
        ElementActions.click(driver, Email_Report);
    }

    public void Z2D_Enter_Email(String Mail) {
        ElementActions.type(driver, Email_Input, Mail);
    }

    public void Z2D_Submit_Email() {
        ElementActions.click(driver, Send_Email);
    }
}
