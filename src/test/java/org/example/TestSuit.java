package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationResult registrationResult = new RegistrationResult();
    registrationDetails details = new registrationDetails();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    MailPage mailPage = new MailPage();

    @Test
    public void verifyRegisterShouldBeSuccessfullydone() {
        homePage.clickOnRegisterButton();
        details.fillRegisterDetails();
        registrationResult.registersuccess();
    }
@Test
public void verifyMailShouldBeSentSuccessfully(){
    homePage.clickOnRegisterButton();
    details.fillRegisterDetails();
clickOnElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    homePage.clickonComputer();
    buildYourComputerPage.buildOwnComputer();
    mailPage.productRefferedMailResult();
}
}