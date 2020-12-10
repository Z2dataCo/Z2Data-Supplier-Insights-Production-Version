package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard_Page {
    private final WebDriver driver;
    public Dashboard_Page(WebDriver driver){
        this.driver = driver;
    }

    public By High_Risk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[1]");
    public By Medium_Risk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[2]");
    public By Low_Risk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[3]");
    public By Countries = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[4]");
    public By Public_Companies = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[1]");
    public By Private_Companies = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[2]");
    public By Subsidiary_Companies = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[3]");
    public By Alerts = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[4]");




public void Z2D_Open_High_Risk(){
    ElementActions.click(driver, High_Risk);
}
public void Z2D_Open_Medium_Risk(){
    ElementActions.click(driver, Medium_Risk);
}
public void Z2D_Open_Low_Risk(){
    ElementActions.click(driver, Low_Risk);
}
public void Z2D_Open_Countries(){
    ElementActions.click(driver,Countries);
}
public void Z2D_Open_Public_Companies(){
    ElementActions.click(driver, Public_Companies);
}
public void Z2D_Open_Private_Companies(){
    ElementActions.click(driver, Private_Companies);
}
public void Z2D_Subsidiary_Companies(){
    ElementActions.click(driver, Subsidiary_Companies);
}
public void Z2D_Open_Alerts(){
    ElementActions.click(driver,Alerts);
}

}
