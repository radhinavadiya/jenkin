package org.example;
import org.testng.Assert;

import org.openqa.selenium.By;

import java.time.Duration;

public class RegistrationResult extends Utils {
    public void registersuccess(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        String message = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        //print message
        System.out.println(message);
        //Assertion
        Assert.assertEquals( message, "Your registration completed");

    }
}
