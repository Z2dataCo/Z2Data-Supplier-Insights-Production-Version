package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class Browse_Page {
    WebDriver driver;

    public Browse_Page(WebDriver driver) {
        this.driver = driver;
    }
//Browse_By_Industry_Page
    public By Search_input_Industry_Page = By.xpath("//input[@placeholder='Search within Industries']");
    public By Product_Name_Industry_Page = By.xpath("//a[@ng-reflect-router-link='/Company/1291160']");
    public By IndustryIndustry_Page = By.partialLinkText("3D Printing & Additi");
    public By CheckBox_Supplier_Industry_Page = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Save_Btn_Industry_Page = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[2]/div[1]/div[1]/a[3]");

    //Browse_By_Name_Page
    public By Search_Input_Name_Page = By.xpath("//input[@placeholder='Search For Supplier']");
    public By Search_Btn_Name_Page = By.xpath("//a[@Class='input-group-text btn btn-info white']");
    public By Link_For_Supplier_Name_Page = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/tbody/tr[1]/td[2]/a");
    public By Supplier_Type_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[3]");
    public By Total_Revenue_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[4]");
    public By Market_Cap_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[5]");
    public By Net_Income_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[6]");
    public By Of_Employees_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[7]");
    public By Supplier_Score_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[8]");
    public By Supplier_Logo = By.xpath("//*[@id=\"js-bodyWrapper\"]/nav/div/div[1]/a/img[1]");
    public By Search_Result_Name_Page = By.xpath("//a[normalize-space()='3M Company']");
    //Browse_By_Product_Page
    public By Search_Input_Product_Page = By.xpath("//input[@placeholder='Search within Products']");
    public By Chemicals_Arrow = By.xpath("//*[@id=\"z2-2cols\"]/div/div[2]/div[2]/div/div/div[2]/ul/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[1]/div/tree-node-wrapper/div/tree-node-expander/span");
    public By Diversified_Chemicals = By.xpath("//*[@id=\"z2-2cols\"]/div/div[2]/div[2]/div/div/div[2]/ul/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[1]/div/tree-node-children/div/tree-node-collection/div/tree-node[2]/div/tree-node-wrapper/div/div/tree-node-content/a");
    public By Checkbox = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Save_Search = By.xpath("//a[@class='btn btn-outline-z2 float-left mr-03'][3]");
    public By Verify_Msg =By.xpath("//div[@aria-label='Suppliers Added Successfuly']");


    public void Z2D_Click_On_Industry() {
        ElementActions.click(driver, IndustryIndustry_Page);
    }

    public void Z2D_Select_Supplier() { ElementActions.click(driver, CheckBox_Supplier_Industry_Page); }

    public void Z2D_SaveInfo() {
        ElementActions.click(driver, Save_Btn_Industry_Page);
    }

    //Browse_By_Name_Page
    public void Z2D_Supplier_Search(String value) {
        ElementActions.type(driver, Search_Input_Name_Page, value);
    }
    public String is_Matched ( ){
       String Text =   driver.findElement(Search_Result_Name_Page).getText();
       return Text;

    }

    public void Z2D_Click_Search_Result_Name_Page() {
        ElementActions.click(driver, Search_Result_Name_Page);
        //ElementActions.waitForElementToBePresent(driver,Supplier_Type_Tbl,10,true);
    }

    public void Z2D_Click_On_Link() {
        ElementActions.click(driver, Link_For_Supplier_Name_Page);
    }

    public void Assert_On_New_Tap() {
        Browse_Page browse_Obj = new Browse_Page(driver);
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(1));
        ElementActions.waitForElementToBePresent(driver,Supplier_Logo,10,true);
        Assert.assertTrue(driver.findElement(browse_Obj.Supplier_Logo).isDisplayed());
        driver.close();
        driver.switchTo().window(tab2.get(0));
    }

    //Browse_By_Product_Page
    public void Z2D_Enter_Product_Name (String Value){
        ElementActions.type(driver, Search_Input_Product_Page,Value);
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
