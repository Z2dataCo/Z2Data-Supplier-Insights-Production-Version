package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
    public By Search_Value = By.xpath("/html/body//parentroute-component//div/div[1]/div[1]/div/div[2]/ul/li[1]");
    public By Save_Btn = By.xpath("//body//supplier-details-component/div[1]/div[1]/button");
    public By Create_Alert = By.xpath("//body//app-root//div[1]//div[1]//app-create-alert[1]//button[1]");
    public By Verify_MSG = By.xpath("//*[@id=\"toast-container\"]/div/div[2]");
    public By Search_Button = By.id("btnautoSearch");
    public By Supplier_Name = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[4]/table/tbody/tr[1]/td[3]");
    public By Overall_Score = By.xpath("//*[@id=\"CompanySupplierScorecard\"]/div[1]/div[2]/div/div[1]");

    public void Z2D_Open_My_Supplier() {
        ElementActions.click(driver, My_Supplier);
    }

    public void Z2D_Open_Browse_Tab() {
        ElementActions.click(driver, Browse);
        ElementActions.click(driver, Browse);
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
    public void Z2D_Enter_Supplier_Name(String Suppname) {
        ElementActions.type(driver, Search_Input, Suppname);
        ElementActions.waitForElementToBePresent(driver,Search_Value,5,true);
        //ElementActions.hover(driver,Search_Value);
        ElementActions.click(driver,Search_Value);
    }

    public void Z2D_Select_Search_Value() {
        //ElementActions.waitForElementToBePresent(driver,Search_Button,5,true);
        ElementActions.click(driver, Search_Button);
        ElementActions.waitForElementToBePresent(driver, Supplier_Name,5,true);
        ElementActions.click(driver, Supplier_Name);
    }

    public void Z2D_Click_On_Save_Button() { ElementActions.click(driver, Save_Btn); }

    //Upload_Supplier_List_Page

    public By Upload_Supplier_Btn = By.xpath("//Button[@class='header-rightaction']");
    public By BOM_Upload = By.xpath("//span[@class='bomupload-emph']");
    public By Next_step1 = By.xpath("//*[@id=\"DivUploadBomFile\"]/div[2]/div/button");
    public By Tbl_Header = By.xpath("//span[@Class='colmapnameHead']");
    public By Tbl_Supplier = By.xpath("//body/div[@id='dropbg']/div[2]/ul/li[1]/a");
    public By Tbl_HQ = By.xpath("//body/div[@id='dropbg']/div[2]/ul/li[3]/a");
    public By Next_Step2 = By.xpath("//button[@Class='bomupload-next btnNext-step2']");
    public By Finish = By.id("btnSaveBom");


    public void Z2D_Click_on_Upload_File() {
        ElementActions.click(driver, Upload_Supplier_Btn);
        ElementActions.click(driver, BOM_Upload);
    }

    public void Z2D_Upload_BOM_File() throws AWTException {
        StringSelection strSelection = new StringSelection(System.getProperty("user.dir") + "\\Testdata\\Sample of list of suppliers.xlsx");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(strSelection, null);
        Robot robot = new Robot();
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void Z2D_Click_Next_for_Upload() {
        ElementActions.click(driver, Next_step1);
    }

    public void Z2D_BOM_Mapping() {
        ElementActions.click(driver, Tbl_Header);
        ElementActions.click(driver, Tbl_HQ);
        ElementActions.click(driver, Tbl_Header);
        ElementActions.click(driver, Tbl_Supplier);
    }

    public void Z2D_Click_Next_for_Mapping() {
        ElementActions.click(driver, Next_Step2);
    }

    public void Z2D_ClickFinish(){
        ElementActions.click(driver,Finish);
    }

}
