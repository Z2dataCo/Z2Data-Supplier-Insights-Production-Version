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
    public By ChemicalsArrow = By.xpath("//*[@id=\"z2-2cols\"]/div/div[2]/div[2]/div/div/div[2]/ul/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[1]/div/tree-node-wrapper/div/tree-node-expander/span");
    public By DiversifedChemicals = By.xpath("//*[@id=\"z2-2cols\"]/div/div[2]/div[2]/div/div/div[2]/ul/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[1]/div/tree-node-children/div/tree-node-collection/div/tree-node[2]/div/tree-node-wrapper/div/div/tree-node-content/a");
    public By Checkbox = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Save_Search = By.xpath("//a[@class='btn btn-outline-z2 float-left mr-03'][3]");
    public By Verify_Msg =By.xpath("//div[@aria-label='Suppliers Added Successfuly']");


    public void Z2D_Enter_Product_Name (String Value){
        ElementActions.type(driver, Search_Input,Value);
    }

    public void Click_On_Arrow(){
        ElementActions.click(driver,ChemicalsArrow);
    }

    public void Select_Product(){
        ElementActions.click(driver,DiversifedChemicals);
    }

    public void Select_Supplier(){
        ElementActions.click(driver,Checkbox);
    }

    public void Save_Information(){
        ElementActions.click(driver, Save_Search);
    }


}
