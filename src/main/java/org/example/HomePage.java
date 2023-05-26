package org.example;
import org.openqa.selenium.By;
import java.time.Duration;
public class HomePage extends Utils {
    public void clickOnRegisterButton() {
        clickOnElement(By.className("ico-register"));
    }public void clickonComputer() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //CLICK ON buld your comuter
        clickOnElement(By.xpath("//*[text()='Build your own computer']"));

    }public void logIn() {
        clickOnElement(By.className("ico-login"));
        //enter email
        sendText(By.id("Email"), "TestEmail@gmail.com");
        //add passwordd
        sendText(By.id("Password"), "Test1234");
        //click on login button
        clickOnElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
    }
}