package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowseByProduct {
    WebDriver driver;

    public BrowseByProduct(WebDriver driver) {
        this.driver = driver;
    }

    public By SearchInput = By.xpath("//input[@placeholder='Search within Products']");
    public By ChemicalsArrow = By.xpath("//*[@id=\"z2-2cols\"]/div/div[2]/div[2]/div/div/div[2]/ul/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[1]/div/tree-node-wrapper/div/tree-node-expander/span");
    public By DiversifedChemicals = By.xpath("//*[@id=\"z2-2cols\"]/div/div[2]/div[2]/div/div/div[2]/ul/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[1]/div/tree-node-children/div/tree-node-collection/div/tree-node[2]/div/tree-node-wrapper/div/div/tree-node-content/a");
    public By Checkbox = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By SaveSearch = By.xpath("//a[@class='btn btn-outline-z2 float-left mr-03'][3]");
    public By VerifyMsg=By.xpath("//div[@aria-label='Suppliers Added Successfuly']");


    public void Z2D_EnterProductName (String Value){
        ElementActions.type(driver,SearchInput,Value);
    }

    public void ClickOnArrow(){
        ElementActions.click(driver,ChemicalsArrow);
    }

    public void SelectProduct(){
        ElementActions.click(driver,DiversifedChemicals);
    }
    public void SelectSupplier(){
        ElementActions.click(driver,Checkbox);
    }

    public void SaveInforamtion(){
        ElementActions.click(driver,SaveSearch);
    }


}
