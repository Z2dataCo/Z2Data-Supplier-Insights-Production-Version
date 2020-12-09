package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.codehaus.groovy.classgen.asm.LambdaWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Z2D_DashBoardPage {
    WebDriver driver;
    public Z2D_DashBoardPage(WebDriver driver){
        this.driver = driver;
    }

    public By HighRisk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[1]");
    public By MediumRisk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[2]");
    public By LowRisk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[3]");
    public By Countries = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[4]");
    public By PublicCompanies = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[1]");
    public By PrivateCompaines = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[2]");
    public By Subsidary_Companies = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[3]");
    public By Alerts = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[4]");
    public By TotalSupplier =By.xpath("//td[@Class='text-center'][1]");
    public By ExactMatch=By.xpath("//td[@Class='text-center'][2]");
    public By NoMatch=By.xpath("//td[@Class='text-center'][3]");


public void Z2D_OpenHighRisk(){
    ElementActions.click(driver,HighRisk);
}
public void Z2D_OpenMediumRisk(){
    ElementActions.click(driver,MediumRisk);
}
public void Z2D_OpenLowRisk(){
    ElementActions.click(driver, LowRisk);
}
public void Z2D_OpenCountries(){
    ElementActions.click(driver,Countries);
}
public void Z2D_OpenPublicCompanies(){
    ElementActions.click(driver,PublicCompanies);
}
public void Z2D_OpenPrivateCompanies(){
    ElementActions.click(driver,PrivateCompaines);
}
public void Z2D_Subsidary_Companies(){
    ElementActions.click(driver,Subsidary_Companies);
}
public void Z2D_OpenAlerts(){
    ElementActions.click(driver,Alerts);
}

}
