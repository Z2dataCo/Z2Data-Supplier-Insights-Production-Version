package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Supplier_Page {
    WebDriver driver;

    public Supplier_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By Export_Btn = By.xpath("//*[@id=\"z2tableA-contain\"]/div[2]/div[2]/div[1]/a[4]");
    public By Supp1 = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Supp2 = By.xpath("//tbody/tr[2]/td[1]/input[1]");
    public By Semi_Con_Filter = By.xpath("//label[@for=\"chk_SupplierIndustries_0\"]");
    public By Supp_Score = By.xpath("//label[@for=\"chk_SupplierScores_0\"]");
    public By Manage_Columns = By.xpath("//button[@class=\"z2actionbtnA z2actionbtnleft btn-managecolslink_draged\"]");
    public By Hide_All = By.xpath("//div[@class='d-flex justify-content-between mb-05']//a[2]");
    public By Save_Column_Setting = By.xpath("//button[@class='btn btn-outline-z2 mr-03']");
    public By Exit = By.xpath("/html/body/ngb-modal-window/div/div/div/div/div[1]/div[2]");
    public By Verify_Msg = By.xpath("//div[@Class='toast-message ng-star-inserted']");
    public By Save_Btn = By.xpath("//i[@class='la la-save']");

    public void Z2D_Select_Supp1() {
        ElementActions.click(driver, Supp1);
    }

    public void Z2D_Select_Supp2() {
        ElementActions.click(driver, Supp2);
    }

    public void Export_File() {
        ElementActions.click(driver, Export_Btn);
    }

    public void Z2D_Select_Filter() {
        ElementActions.click(driver, Semi_Con_Filter);
    }

    public void Z2D_Supp_Score() {
        ElementActions.click(driver, Supp_Score);
    }

    public void Z2D_Click_Manage_Column() {
        ElementActions.click(driver, Manage_Columns);
    }

    public void Z2D_Click_HideAll() {
        ElementActions.click(driver, Hide_All);
    }

    public void Z2D_Save_Setting() {
        ElementActions.click(driver, Save_Column_Setting);
    }

    public void Z2D_Exit() {
        ElementActions.click(driver, Exit);
    }

    public void Z2D_Click_Save(){
        ElementActions.click(driver,Save_Btn);
    }
}
