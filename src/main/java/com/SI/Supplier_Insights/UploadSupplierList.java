package com.SI.Supplier_Insights;

import com.shaft.cli.FileActions;
import com.shaft.gui.element.ElementActions;
import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadSupplierList {
    private WebDriver driver;

    public UploadSupplierList(WebDriver driver) {
        this.driver = driver;
    }

    public By UploadSupplier_Btn = By.xpath("//Button[@class='header-rightaction']");
    public By ClickToUploadSupp = By.xpath("//span[@class='bomupload-emph']");
    public By Next_step1 = By.xpath("//*[@id=\"DivUploadBomFile\"]/div[2]/div/button");
    public By Tbl_Header = By.xpath("//span[@Class='colmapnameHead']");
    public By Tbl_Supplier = By.linkText("Supplier");
    public By Tbl_HQ = By.linkText("HQ");
    public By Next_Step2 = By.xpath("//button[@Class='bomupload-next btnNext-step2']");


    public void ClickToUploadFile() {
        ElementActions.click(driver, UploadSupplier_Btn);
        ElementActions.click(driver, ClickToUploadSupp);
    }

    public void UploadFile(String FilePath) throws AWTException {
        StringSelection strSelection = new StringSelection(FilePath);
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

    public void ClickNext() {
        ElementActions.click(driver, Next_step1);
    }

    public void Mapping() {
        ElementActions.click(driver, Tbl_Header);
        ElementActions.click(driver, Tbl_HQ);
        ElementActions.click(driver, Tbl_Supplier);
    }

    public void ClickNext_2() {
        ElementActions.click(driver, Next_Step2);
    }
}
