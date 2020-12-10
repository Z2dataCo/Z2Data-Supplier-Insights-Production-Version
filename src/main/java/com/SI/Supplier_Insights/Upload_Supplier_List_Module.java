package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Upload_Supplier_List_Module {
    private final WebDriver driver;

    public Upload_Supplier_List_Module(WebDriver driver) {
        this.driver = driver;
    }

    public By Upload_Supplier_Btn = By.xpath("//Button[@class='header-rightaction']");
    public By BOM_Upload = By.xpath("//span[@class='bomupload-emph']");
    public By Next_step1 = By.xpath("//*[@id=\"DivUploadBomFile\"]/div[2]/div/button");
    public By Tbl_Header = By.xpath("//span[@Class='colmapnameHead']");
    public By Tbl_Supplier = By.linkText("Supplier");
    public By Tbl_HQ = By.linkText("HQ");
    public By Next_Step2 = By.xpath("//button[@Class='bomupload-next btnNext-step2']");


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
        ElementActions.click(driver, Tbl_Supplier);
    }

    public void Z2D_Click_Next_for_Mapping() {
        ElementActions.click(driver, Next_Step2);
    }
}
