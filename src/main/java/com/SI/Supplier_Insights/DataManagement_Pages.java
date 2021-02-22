package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataManagement_Pages {
    private final WebDriver driver;

    public DataManagement_Pages(WebDriver driver) {
        this.driver = driver;
    }
    // Dashboard_Page
    public By High_Risk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[1]");
    public By Medium_Risk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[2]");
    public By Low_Risk = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[3]");
    public By Countries = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[1]/div[4]");
    public By Public_Companies = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[1]");
    public By Private_Companies = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[2]");
    public By Subsidiary_Companies = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[3]");
    public By Alerts = By.xpath("//*[@id='z2-2cols-sub-2cols-left']/div[1]/div[2]/div[4]");
    public By Table_Count = By.xpath("//*[@id=\"z2tableA-contain\"]/div[2]/div[2]/div[2]/span[2]");
    public By Total_Supplier_Graph = By.xpath("//div[contains(text(),'Total Suppliers')]");
    public By Supplier_Status_Graph = By.xpath("//div[contains(text(),'Supplier Status')]");

    // Report_Page
    public By Basic_Info = By.xpath("//label[@for='chkCat_0']");
    public By Save_Report = By.xpath("//button[@class='z2actionbtnA z2actionbtnleft mr-05'][1]");
    public By Report_Input = By.xpath("//input[@placeholder='Report Name.']");
    public By Submit_Report = By.xpath("/html/body/ngb-modal-window/div/div/div/div/div[2]/button");
    public By Email_Report = By.xpath("//button[@Class='z2actionbtnA z2actionbtnleft mr-05'][2]");
    public By Email_Input = By.xpath("//input[@placeholder='Email..']");
    public By Send_Email = By.xpath("/html/body/ngb-modal-window/div/div/div/div/div[2]/button");
    public By verify_Msg = By.xpath("//div[@class='toast-message ng-star-inserted']");

    //Scrub_Page
    public By Total_Supplier = By.xpath("//td[@Class='text-center'][1]");
    public By Exact_Match = By.xpath("//td[@Class='text-center'][2]");
    public By No_Match = By.xpath("//td[@Class='text-center'][3]");
    public By Corrected = By.xpath("//td[@Class='text-center'][4]");
    public By ignored = By.xpath("//td[@Class='text-center'][5]");
    public By Add_Supplier_Btn = By.xpath("//a[@data-target='#ScrubAddSuppliers']");
    public By Input_Text = By.xpath("//*[@id=\"ScrubAddSuppliers\"]/div/div/div[2]/div/div/div[1]/div/div/ng-autocomplete/div/div[1]/input");
    public By Suggestion_Supplier = By.xpath("//*[@id=\"ScrubAddSuppliers\"]/div/div/div[2]/div/div/div[1]/div/div/ng-autocomplete/div[1]/div[2]/ul/li[1]/div/a");
    public By Save_btn = By.xpath("//*[@id=\"ScrubAddSuppliers\"]/div/div/div[3]/button[1]");
    public By Remove_Supplier = By.xpath("//tbody/tr[1]/td[11]/div[1]/a[3]");
    public By Add_Note = By.xpath("//div[@id='scrub_list']//tr[1]/td[11]//a[4]");
    public By Text_Area = By.xpath("//*[@id=\"scrubAddNote\"]/div/div/div[2]/textarea");
    public By Add_Success = By.xpath("//*[@id=\"scrubAddNote\"]/div/div/div[3]/button[1]");
    public By Close_Add_Note = By.xpath("//*[@id=\"scrubAddNote\"]/div/div/div[1]/button");
    public By last_page = By.xpath("//*[@id=\"scrub_list\"]/div[2]/div[3]/div/pagination-component/ngb-pagination/ul/li[16]/a");
    public By Count_Supplier_Table = By.xpath("//*[@id=\"scrub_list\"]/div[2]/div[2]/div[2]/span[2]");


    // Dashboard_Page M
    public void Z2D_Open_High_Risk() { ElementActions.click(driver, High_Risk); }
    public void Z2D_Open_Medium_Risk() { ElementActions.click(driver, Medium_Risk); }
    public void Z2D_Open_Low_Risk() { ElementActions.click(driver, Low_Risk); }
    public void Z2D_Open_Countries() {
        ElementActions.click(driver, Countries);
    }
    public void Z2D_Open_Public_Companies() { ElementActions.click(driver, Public_Companies); }
    public void Z2D_Open_Private_Companies() { ElementActions.click(driver, Private_Companies); }
    public void Z2D_Subsidiary_Companies() { ElementActions.click(driver, Subsidiary_Companies); }
    public void Z2D_Open_Alerts() { ElementActions.click(driver, Alerts); }

    // Report_Page M
    public void Z2D_Click_BasicInfo() {
        ElementActions.click(driver, Basic_Info);
    }
    public void Z2D_Save_Report() {
        ElementActions.click(driver, Save_Report);
    }
    public void Z2D_Enter_Report_Name(String Name) {
        ElementActions.waitForElementToBePresent(driver,Report_Input,5,true);
        ElementActions.type(driver, Report_Input, Name);
    }
    public void Z2D_Submit_Report() {
        ElementActions.click(driver, Submit_Report);
    }
    public void Z2D_Email_Report() {
        ElementActions.click(driver, Email_Report);
    }
    public void Z2D_Enter_Email(String Mail) {
        ElementActions.type(driver, Email_Input, Mail);
    }
    public void Z2D_Submit_Email() {
        ElementActions.click(driver, Send_Email);
    }

    //Scrub_Page M
    public void Z2D_Click_Add_Supplier() {
        ElementActions.click(driver, Add_Supplier_Btn);
    }
    public void Z2D_Add_Supplier_Name(String name) { ElementActions.type(driver, Input_Text, name); }
    public void Z2D_Click_Save() {
        ElementActions.click(driver, Save_btn);
    }
    public void Z2D_Click_To_Remove_Supplier() { ElementActions.click(driver, Remove_Supplier); }
    public void Z2D_Select_Supplier() {
        ElementActions.click(driver, Suggestion_Supplier);
    }
    public void Z2D_Add_Note() {
        ElementActions.click(driver, Add_Note);
    }
    public void Z2D_Enter_Text(String Text) {
        ElementActions.type(driver, Text_Area, Text);
    }
    public void Z2D_Save_Note() {
        ElementActions.click(driver, Add_Success);
    }
    public void Z2D_CloseAddNote() {
        ElementActions.click(driver, Close_Add_Note);
    }
    public void Z2D_Get_Last_Page() {
        ElementActions.click(driver, last_page);
    }

}
