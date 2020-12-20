package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing_Page {
    private final WebDriver driver;

    public Landing_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By MySupplier = By.id("aMySuppliers");
    public By Browse = By.xpath("//li[@style='position:relative;']");
    public By BrowserByIndustry = By.xpath("//a[@Class='d-flex align-items-center px-1 py-2 closeChild'][1]");
    public By AdvancedSearch = By.xpath("//a[@ng-reflect-router-link='/AdvancedSearch']");
    public By Compare = By.id("comparecur");
    public By BrowseByName = By.xpath("//a[@Class='d-flex align-items-center px-1 py-2 closeChild'][3]");
    public By BrowseByProduct = By.xpath("//a[@Class='d-flex align-items-center px-1 py-2 closeChild'][2]");
    public By SubmitTicket = By.xpath("//i[@Class='icon-Support-Ticket mr-05']");
    public By Subject = By.xpath("//*[@id=\"dropbg\"]/div/div/div[2]/div[2]/div[2]/input");
    public By issueArea = By.xpath("//*[@id=\"dropbg\"]/div/div/div[2]/div[3]/div[2]/textarea");
    public By SendTicket = By.xpath("//*[@id=\"dropbg\"]/div/div/div[2]/button");
    public By Z2DLogo = By.xpath("/html/body/app-root/parentroute-component/app-z2dataapp/div/div[1]/div[1]/a/img");
    public By SearchInput = By.id("txtMainBarSearch");
    public By Search_Value = By.cssSelector("div[class='z2-searchbox clearfix'] li:nth-child(1) a:nth-child(1)");
    public By Save_Btn = By.xpath("//*[@id=\"z2page-head-bar\"]/div/button");
    public By CreateAlert = By.xpath("//body//app-root//div[1]//div[1]//app-create-alert[1]//button[1]");

    public void Z2D_Open_My_Supplier() {
        ElementActions.click(driver, MySupplier);
    }

    public void Z2D_Open_Browse_Tab() {
        ElementActions.click(driver, Browse);
        ElementActions.click(driver, Browse);
    }

    public void Z2D_Open_Advanced_Search_Tab() {
        ElementActions.click(driver, AdvancedSearch);
    }


    public void Z2D_Open_Compare_Tab() {
        ElementActions.click(driver, Compare);
    }

    public void Z2D_Open_Browse_By_Industry() {
        ElementActions.click(driver, BrowserByIndustry);
    }

    public void Z2D_BrowseByName() {
        ElementActions.click(driver, BrowseByName);
    }

    public void Z2D_BrowseByProduct() {
        ElementActions.click(driver, BrowseByProduct);
    }

    public void Z2D_Click_Submit_Ticket() {
        ElementActions.click(driver, SubmitTicket);
    }

    public void Z2D_Ticket_Subject(String subject) {
        ElementActions.type(driver, Subject, subject);
    }

    public void Z2D_Ticket_Description(String Text) {
        ElementActions.type(driver, issueArea, Text);
    }

    public void Z2D_Send_Ticket() {
        ElementActions.click(driver, SendTicket);
    }

    public void BackToLanding() {
        ElementActions.click(driver, Z2DLogo);
    }

    public void Z2D_Enter_Supplier_Name(String Suppname) {
        ElementActions.type(driver, SearchInput, Suppname);
    }

    public void Z2D_Select_Search_Value() {
        ElementActions.click(driver, Search_Value);
    }

    public void Z2D_Click_On_Save_Button() {
        ElementActions.click(driver, Save_Btn);
    }
}
