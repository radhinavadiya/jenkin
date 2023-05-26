package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static java.time.Duration.ofSeconds;

public class MailPage extends Utils {
        public void productRefferedMailResult() {
           // driver.manage().timeouts().implicitlyWait(ofSeconds(2));

            String s = getTextFromElement(By.xpath("//div[@class='result']"));
            //print msg
            System.out.println(s);
            Assert.assertEquals(s,"Your message has been sent.");

        }

}
