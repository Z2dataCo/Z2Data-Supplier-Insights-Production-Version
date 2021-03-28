package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Browse_By_Product_Page {
    WebDriver driver;

    public Browse_By_Product_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By Search_Input = By.xpath("//input[@placeholder='Search within Products']");
    public By Chemicals_Arrow = By.xpath("//tree-node[1]//tree-node-wrapper[1]//tree-node-expander[1]");
    public By Diversified_Chemicals = By.xpath("//span[normalize-space()='Diversified Chemicals']");
    public By Checkbox = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Save_Search = By.xpath("//a[@class='btn btn-outline-z2 float-left mr-03'][normalize-space()='Save']");
    public By Verify_Msg =By.xpath("//div[@aria-label='Suppliers Added Successfuly']");


    public void Z2D_Enter_Product_Name (String Value){
        ElementActions.type(driver, Search_Input,Value);
    }

    public void Click_On_Arrow(){
        ElementActions.click(driver, Chemicals_Arrow);
    }

    public void Select_Product(){
        ElementActions.click(driver, Diversified_Chemicals);
    }

    public void Select_Supplier(){
        ElementActions.click(driver,Checkbox);
    }

    public void Save_Information(){
        ElementActions.click(driver, Save_Search);
    }

}
