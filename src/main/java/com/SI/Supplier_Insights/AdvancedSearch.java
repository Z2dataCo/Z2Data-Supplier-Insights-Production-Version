package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvancedSearch {
    WebDriver driver;
public AdvancedSearch(WebDriver driver){
    this.driver = driver;
}


    public By Supp1 = By.xpath("//tbody/tr[1]/td[1]/input[1]");
    public By Supp2 = By.xpath("//tbody/tr[2]/td[1]/input[1]");
    public By Supp3 = By.xpath("//tbody/tr[3]/td[1]/input[1]");
    public By Supp4 = By.xpath("//tbody/tr[4]/td[1]/input[1]");
    public By Compare_btn = By.xpath("//a[@class='btn btn-outline-z2 float-left mr-03'][2]");


    public void Z2D_SelectSupp1() {
        ElementActions.click(driver, Supp1);
    }

    public void Z2D_SelectSupp2() {
        ElementActions.click(driver, Supp2);
    }

    public void Z2D_SelectSupp3() {
        ElementActions.click(driver, Supp3);
    }

    public void Z2D_SelectSupp4() {
        ElementActions.click(driver, Supp4);

    }

    public void Z2DCompare_AdavncedSearch() {
        ElementActions.click(driver, Compare_btn);
    }
}
