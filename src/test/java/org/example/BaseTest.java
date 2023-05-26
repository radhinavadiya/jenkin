package org.example;

import org.example.BasePage;
import org.example.DriverManager;
import org.example.Utils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    DriverManager driverManager = new DriverManager();
    @BeforeMethod
public void setup(){
    driverManager.openBrowser();}
    @AfterMethod
public void tearDown(){
    driverManager.closeBrowser();


    }
}
