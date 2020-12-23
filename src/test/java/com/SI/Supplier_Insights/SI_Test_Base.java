package com.SI.Supplier_Insights;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SI_Test_Base {
    public static WebDriver driver;
    @BeforeSuite
    public void StartDriver() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        //new ChromeOptions().addArguments("--headless")
        BrowserActions.navigateToURL(driver, "https://suppliers.z2data.com/");
        login();
    }

    public static void Switch_Tabs() {
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(0));
        driver.close();
        driver.switchTo().window(tab2.get(1));
    }

    public static void login() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Z2D_SignIn();
    }

    public static void WaitAllElement() { driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }

    public static void DeleteCookies() {
        driver.manage().deleteAllCookies();
    }

    public static void Refresh() { driver.navigate().refresh(); }

    @AfterMethod
    public void Back_To_Landing(ITestResult result) {
        Landing_Page landingPage = new Landing_Page(driver);
        String filename = new SimpleDateFormat("ddMMyyHHmm").format(new Date());
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(source, new File(System.getProperty("user.dir") + "/Screenshots/" + result.getName() + filename + ".png"));
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }
        WaitAllElement();
        String URL = driver.getCurrentUrl();
        // driver.navigate().to("https://si.z2data.com/");
        if (ITestResult.SUCCESS == result.getStatus()) {
            System.out.println("[Scenario Pass]:" + result.getMethod().getMethodName() + URL);
        } else if (ITestResult.FAILURE == result.getStatus()) {
            System.out.println("[Scenario Fail]:" + result.getMethod().getMethodName() + URL);
        } else {
            System.out.println("[Scenario Skipped]:" + result.getMethod().getMethodName() + URL);
        }
        landingPage.BackToLanding();
    }

    @AfterSuite
    public void TearDown() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Tear_Down();
    }

    @BeforeMethod
    public void WaitElement() {
        Refresh();
        WaitAllElement();
    }

    public void Switch() {
        ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(0));
        WaitAllElement();
        driver.switchTo().window(tab2.get(1));
        WaitAllElement();
        driver.switchTo().window(tab2.get(0));
    }
}
