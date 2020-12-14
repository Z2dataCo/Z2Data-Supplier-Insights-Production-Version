package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupplierPage {
    WebDriver driver;

    public SupplierPage(WebDriver driver) {
        this.driver = driver;
    }

    public By Export_Btn = By.xpath("//*[@id=\"z2tableA-contain\"]/div[2]/div[2]/div[1]/a[4]");
    public By Supp1 = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Supp2 = By.xpath("//tbody/tr[2]/td[1]/input[1]");
    public By SemiConFilter = By.xpath("//label[@for=\"chk_SupplierIndustries_0\"]");
    public By SuppScore = By.xpath("//label[@for=\"chk_SupplierScores_0\"]");
    public By ManageColumns = By.xpath("//button[@class=\"z2actionbtnA z2actionbtnleft btn-managecolslink_draged\"]");
    public By HideAll = By.xpath("//div[@class='d-flex justify-content-between mb-05']//a[2]");
    public By SaveColumnSetting = By.xpath("//button[@class='btn btn-outline-z2 mr-03']");
    public By Exit = By.xpath("/html/body/ngb-modal-window/div/div/div/div/div[1]/div[2]");
    public By VerifyMsg = By.xpath("//div[@Class='toast-message ng-star-inserted']");
    public By Save_Btn = By.xpath("//i[@class='la la-save']");

    public void Z2D_SelectSupp1() {
        ElementActions.click(driver, Supp1);
    }


    public void Z2D_SelectSupp2() {
        ElementActions.click(driver, Supp2);
    }

    public void ExportFile() {
        ElementActions.click(driver, Export_Btn);
    }

    public void Z2D_SelectFilter() {
        ElementActions.click(driver, SemiConFilter);
    }

    public void Z2D_SuppScore() {
        ElementActions.click(driver, SuppScore);
    }

    public void Z2D_Click_ManageColumn() {
        ElementActions.click(driver, ManageColumns);
    }

    public void Z2D_ClickHideAll() {
        ElementActions.click(driver, HideAll);
    }

    public void Z2D_SaveSetting() {
        ElementActions.click(driver, SaveColumnSetting);
    }

    public void Z2D_Exit() {
        ElementActions.click(driver, Exit);
    }

    public void Z2D_ClickSave(){
        ElementActions.click(driver,Save_Btn);
    }
}
