package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
    private WebDriver driver;
    public String URL_for_Navigation = "https://si.z2data.com";

    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    public JavascriptExecutor jse;

    public void Navigate_To_URL_for_Navigation() {
        driver.navigate().to(URL_for_Navigation);
    }
    public void Tear_Down() {
        BrowserActions.closeCurrentWindow(driver);
    }

    public By Verify_Redirect = By.xpath("//*[@id=\"main_start_page\"]/div/h2");
    public By Verify_Open = By.xpath("/html/body/div/div/div/div[1]/div[2]/form/button");
    public By Input_Text_Box = By.id("Username");
    public By Input_Pass = By.id("Password");
    public By SignIn_Btn = By.name("button");

    public void Z2D_SignIn() {
        ElementActions.type(driver, Input_Text_Box, "m.sultan@z2data.com");
        ElementActions.type(driver, Input_Pass, "M.sultan@z2data.com");
        ElementActions.click(driver, SignIn_Btn);


    }
}

