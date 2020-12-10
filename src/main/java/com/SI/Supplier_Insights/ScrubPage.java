package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScrubPage {
    WebDriver driver;

    public ScrubPage(WebDriver driver) {
        this.driver = driver;
    }

    public By Total_Supplier = By.xpath("//td[@Class='text-center'][1]");
    public By Exact_Match = By.xpath("//td[@Class='text-center'][2]");
    public By No_Match = By.xpath("//td[@Class='text-center'][3]");
    public By Corrected = By.xpath("//td[@Class='text-center'][4]");
    public By ignored = By.xpath("//td[@Class='text-center'][5]");
    public By AddSupplier_Btn = By.xpath("//a[@data-target='#ScrubAddSuppliers']");
    public By InputText = By.xpath("//*[@id=\"ScrubAddSuppliers\"]/div/div/div[2]/div/div/div[1]/div/div/ng-autocomplete/div/div[1]/input");
    public By SuggestionSupplier = By.xpath("//*[@id=\"ScrubAddSuppliers\"]/div/div/div[2]/div/div/div[1]/div/div/ng-autocomplete/div[1]/div[2]/ul/li[1]/div/a");
    public By Save_btn = By.xpath("//*[@id=\"ScrubAddSuppliers\"]/div/div/div[3]/button[1]");
    public By Remove_Supplier = By.xpath("//*[@id=\"scrub_list\"]/div[3]/table/tbody/tr[1]/td[11]/div/a[3]");
    public By AddNote = By.xpath("//*[@id=\"scrub_list\"]/div[3]/table/tbody/tr/td[11]/div/a[4]");
    public By TextArea = By.xpath("//*[@id=\"scrubAddNote\"]/div/div/div[2]/textarea");
    public By AddSuccess = By.xpath("//*[@id=\"scrubAddNote\"]/div/div/div[3]/button[1]");
    public By CloseAddNote = By.xpath("//*[@id=\"scrubAddNote\"]/div/div/div[1]/button");
    public By lastpage = By.xpath("//*[@id=\"scrub_list\"]/div[2]/div[3]/div/pagination-component/ngb-pagination/ul/li[16]/a");


    public void Z2D_ClickAddSupplier() {
        ElementActions.click(driver, AddSupplier_Btn);
    }

    public void Z2D_AddSupplierName(String name) {
        ElementActions.type(driver, InputText, name);

    }

    public void Z2D_ClickSave() {
        ElementActions.click(driver, Save_btn);
    }

    public void Z2D_ClickToRemoveSupplier() {
        ElementActions.click(driver, Remove_Supplier);

    }

    public void Z2D_SelectSupplier() {
        ElementActions.click(driver, SuggestionSupplier);
    }


    public void Z2D_AddNote() {
        ElementActions.click(driver, AddNote);
    }

    public void Z2D_EnterText(String Text) {
        ElementActions.type(driver, TextArea, Text);
    }

    public void Z2D_SaveNote() {
        ElementActions.click(driver, AddSuccess);
    }

    public void Z2D_CloseAddNote() {
        ElementActions.click(driver, CloseAddNote);
    }

    public void Z2D_GetLastPage(){
        ElementActions.click(driver,lastpage);
    }
}
