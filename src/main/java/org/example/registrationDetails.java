package org.example;

import io.cucumber.core.runtime.TimeServiceEventBus;
import org.openqa.selenium.By;

import java.sql.Timestamp;

public class registrationDetails extends Utils {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());


    public void fillRegisterDetails(){
        clickOnElement(By.className("ico-register"));
        driver.findElement(By.id("FirstName")).sendKeys("TestFirstName");
        driver.findElement(By.id("LastName")).sendKeys("TestLastName");
        driver.findElement(By.name("Email")).sendKeys("TestEmail@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test1234");
        clickOnElement(By.id("register-button"));
    }
}
