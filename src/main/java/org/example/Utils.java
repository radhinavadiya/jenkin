package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Utils extends BasePage {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public static void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public static void wait(By by, int timeInSec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}