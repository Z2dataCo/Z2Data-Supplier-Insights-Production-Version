package com.SI.Supplier_Insights;

import org.testng.annotations.Test;

import java.awt.*;

public class A_UploadSuppliersList extends SI_Test_Base {

    String FilePath=System.getProperty("user.dir") + "\\Testdata\\Sample of list of suppliers.xlsx";
    UploadSupplierList supplierList;
    @Test
    public void UploadSuppList() throws AWTException, InterruptedException {
        supplierList = new UploadSupplierList(driver);
        supplierList.ClickToUploadFile();
        supplierList.UploadFile(FilePath);
        supplierList.ClickNext();
        supplierList.Mapping();
        supplierList.ClickNext_2();
    }
}
