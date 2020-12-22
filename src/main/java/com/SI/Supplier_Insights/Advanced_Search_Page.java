package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Advanced_Search_Page {
    WebDriver driver;

    public Advanced_Search_Page(WebDriver driver) {
        this.driver = driver;
    }


    public By Supp1 = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Supp2 = By.xpath("//tbody/tr[2]/td[1]/input[1]");
    public By Supp3 = By.xpath("//tbody/tr[3]/td[1]/input[1]");
    public By Supp4 = By.xpath("//tbody/tr[4]/td[1]/input[1]");
    public By Compare_btn = By.xpath("//a[@class='btn btn-outline-z2 float-left mr-03'][2]");
    public By Save_Btn = By.xpath("//i[@Class='la la-save']");
    public By ddl_Saved = By.xpath("//a[@data-z2dropdownsmenus='saved-menu']");
    public By Company_Name = By.xpath("//thead/tr[1]/td[1]");
    public By Remove = By.xpath("//i[@Class='fas fa-times mr-03']");
    public By Strong_Filter = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[1]/table/tbody/tr/td[1]/div/div[1]/label/span");
    public By Clear = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[2]/div[1]/div[1]/a[1]");
    public By Public_Filter = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/label[1]/span[1]");
    public By Supp_Logo = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[4]/table/tbody/tr[1]/td[2]");
    public By Compare = By.xpath("//i[@class='z2iconfont icon-Compare mr-03']");
    public By Last_Filter = By.xpath("//*[@id=\"z2tableA-contain\"]/div/div[1]/table/thead/tr/th[9]");


    public void Z2D_Select_Supp1() {
        ElementActions.click(driver, Supp1);
    }

    public void Z2D_Select_Supp2() {
        ElementActions.click(driver, Supp2);
    }

    public void Z2D_Select_Supp3() {
        ElementActions.click(driver, Supp3);
    }

    public void Z2D_Select_Supp4() {
        ElementActions.click(driver, Supp4);
    }

    public void Z2D_Compare_Advanced_Search() {
        ElementActions.click(driver, Compare_btn);
    }

    public void Z2D_ClickSave() {
        ElementActions.click(driver, Save_Btn);
    }

    public void Open_Drop_Down_List() {
        ElementActions.click(driver, ddl_Saved);
    }

    public void Z2D_Select_All() {
        ElementActions.click(driver, Company_Name);
    }

    public void Z2D_Click_Remove() {
        ElementActions.click(driver, Remove);
    }

    public void Z2D_Click_Compare() {
        ElementActions.click(driver, Compare);
    }

    public void Z2D_Select_Strong_Filter() {
        ElementActions.click(driver, Strong_Filter);
    }

    public void Z2D_Clear_Check_Box() {
        ElementActions.click(driver, Clear);

    }

    public void Z2D_Select_Public_Filter() {
        ElementActions.click(driver, Public_Filter);
    }

    public void Z2D_Supplier_Profile() {
        ElementActions.click(driver, Supp_Logo);
    }



}


