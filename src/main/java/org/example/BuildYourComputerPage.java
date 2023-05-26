package org.example;

import org.openqa.selenium.By;

public class BuildYourComputerPage extends Utils{

        public void buildOwnComputer() {
            //click on send email
            clickOnElement(By.xpath("(//button[@type='button'])[4]"));
            sendText(By.className("friend-email"), "friends123@gmail.com");
            //type your mail
             sendText(By.className("your-email"), "TestEmail@gmail.com");
            // click on send email
            clickOnElement(By.name("send-email"));
            //catch message

        }

    }


