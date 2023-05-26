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

    }
}