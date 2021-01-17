package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing_Page {
    private final WebDriver driver;

    public Landing_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By My_Supplier = By.id("aMySuppliers");
    public By Browse = By.xpath("//li[@style='position:relative;']");
    public By Browser_By_Industry = By.xpath("//a[@Class='d-flex align-items-center px-1 py-2 closeChild'][1]");
    public By Advanced_Search = By.xpath("//a[@ng-reflect-router-link='/AdvancedSearch']");
    public By Compare = By.id("comparecur");
    public By Browse_By_Name = By.xpath("//a[@Class='d-flex align-items-center px-1 py-2 closeChild'][3]");
    public By Browse_By_Product = By.xpath("//a[@Class='d-flex align-items-center px-1 py-2 closeChild'][2]");
    public By Submit_Ticket = By.xpath("//i[@Class='icon-Support-Ticket mr-05']");
    public By Subject = By.xpath("//*[@id=\"dropbg\"]/div/div/div[2]/div[2]/div[2]/input");
    public By issue_Area = By.xpath("//*[@id=\"dropbg\"]/div/div/div[2]/div[3]/div[2]/textarea");
    public By Send_Ticket = By.xpath("//*[@id=\"dropbg\"]/div/div/div[2]/button");
    public By Z2D_Logo = By.xpath("/html/body/app-root/parentroute-component/app-z2dataapp/div/div[1]/div[1]/a/img");
    public By Search_Input = By.id("txtMainBarSearch");
    public By Search_Value = By.cssSelector("div[class='z2-searchbox clearfix'] li:nth-child(1) a:nth-child(1)");
    public By Save_Btn = By.xpath("//*[@id=\"z2page-head-bar\"]/div/button");
    public By Create_Alert = By.xpath("//body//app-root//div[1]//div[1]//app-create-alert[1]//button[1]");
    public By Verify_MSG = By.xpath("//*[@id=\"toast-container\"]/div/div[2]");
    public By Search_Button = By.id("btnautoSearch");
    public By Supplier_Name = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[4]/table/tbody/tr[1]/td[3]");

    public void Z2D_Open_My_Supplier() {
        ElementActions.click(driver, My_Supplier);
    }

    public void Z2D_Open_Browse_Tab() {
        ElementActions.click(driver, Browse);
        //ElementActions.click(driver, Browse);
    }

    public void Z2D_Open_Advanced_Search_Tab() {
        ElementActions.click(driver, Advanced_Search);
    }


    public void Z2D_Open_Compare_Tab() {
        ElementActions.click(driver, Compare);
    }

    public void Z2D_Open_Browse_By_Industry() {
        ElementActions.click(driver, Browser_By_Industry);
    }

    public void Z2D_Browse_By_Name() {
        ElementActions.click(driver, Browse_By_Name);
    }

    public void Z2D_Browse_By_Product() {
        ElementActions.click(driver, Browse_By_Product);
    }

    public void Z2D_Click_Submit_Ticket() {
        ElementActions.click(driver, Submit_Ticket);
    }

    public void Z2D_Ticket_Subject(String subject) {
        ElementActions.type(driver, Subject, subject);
    }

    public void Z2D_Ticket_Description(String Text) {
        ElementActions.type(driver, issue_Area, Text);
    }

    public void Z2D_Send_Ticket() {
        ElementActions.click(driver, Send_Ticket);
    }

    public void BackToLanding() {
    driver.get("https://suppliers.z2data.com/DataManagement/List");
       //ElementActions.click(driver, Z2D_Logo);
    }


    public void Z2D_Enter_Supplier_Name(String Suppname) {
        ElementActions.type(driver, Search_Input, Suppname);
    }

    public void Z2D_Select_Search_Value() {
        ElementActions.waitForElementToBePresent(driver,Search_Button,5,true);
        ElementActions.click(driver, Search_Button);
        ElementActions.waitForElementToBePresent(driver, Supplier_Name,5,true);
        ElementActions.click(driver, Supplier_Name);
    }

    public void Z2D_Click_On_Save_Button() { ElementActions.click(driver, Save_Btn); }
}
