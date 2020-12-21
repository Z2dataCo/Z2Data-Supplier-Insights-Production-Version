package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class Browse_By_Name_Page {
    WebDriver driver;

    public Browse_By_Name_Page(WebDriver driver) {
        this.driver = driver;
    }

    public By SearchInput = By.xpath("//input[@placeholder='Search For Supplier']");
    public By Search_Btn = By.xpath("//a[@Class='input-group-text btn btn-info white']");
    public By LinkForSupplier = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/tbody/tr[1]/td[2]/a");
    public By SupplierType_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[3]");
    public By TotalRevenue_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[4]");
    public By MarketCap_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[5]");
    public By NetIncome_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[6]");
    public By OfEmployees_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[7]");
    public By SupplierScore_Tbl = By.xpath("//*[@id=\"browse_name\"]/div[3]/table/thead/tr/th[8]");
    public By Supplier_Logo = By.xpath("//*[@id=\"js-bodyWrapper\"]/nav/div/div[1]/a/img[1]");


    public void Z2D_SupplierSearch(String value) {
        ElementActions.type(driver, SearchInput, value);
    }

    public void Z2D_ClickSearch() {
        ElementActions.click(driver, Search_Btn);
    }

    public void Z2D_ClickOnLink() {
        ElementActions.click(driver, LinkForSupplier);
    }
    public void Assert_On_New_Tap() throws InterruptedException {
        Browse_By_Name_Page browse_ByName_Obj = new Browse_By_Name_Page(driver);
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(0));
        driver.switchTo().window(tab2.get(1));
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(browse_ByName_Obj.Supplier_Logo).isDisplayed());
        driver.switchTo().window(tab2.get(0));

    }


}
