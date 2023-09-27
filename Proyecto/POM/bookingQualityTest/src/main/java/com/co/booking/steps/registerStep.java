package com.co.booking.steps;
import com.co.booking.pageobject.registerPage;
import net.thucydides.core.annotations.Step;

public class registerStep {
    registerPage registerPage = new registerPage();

    // OPEN BROWSER
    @Step
    public void openBrowser() {
        registerPage.open();
    }

    // CLOSE POP-UP MESSAGE
    @Step
    public void CLICK_POP_UP() {
        registerPage.getDriver().findElement(registerPage.getCLOSEPOPPUPBUTTON()).click();
    }

    // CLICK ON SING UP
    @Step
    public void CLICK_BUTTONSINGUP() {
        registerPage.getDriver().findElement(registerPage.getBUTTONSINGUP()).click();
    }

    // INSERT EMAIL
    @Step
    public void SENDKEYS_INPUTMAIL() {
        registerPage.getDriver().findElement(registerPage.getINPUTMAIL()).sendKeys("jagarcia8578@soy.sena.edu.co");
    }

    // CLICK ON BUTTON CONTINUE MAIL
    @Step
    public void CLICK_BUTTONCONTINUEMAIL() {
        registerPage.getDriver().findElement(registerPage.getBUTTONCONTINUEMAIL()).click();
    }

    // INSERT PASSWORD
    @Step
    public void SENDKEYS_INPUTPASS() {
        registerPage.getDriver().findElement(registerPage.getINPUTPASS()).sendKeys("Prueba123456");
    }

    // PASSWORD CHECK
    @Step
    public void SEND_INPUTCONFIRMPASS() {
        registerPage.getDriver().findElement(registerPage.getINPUTCONFIRMPASS()).sendKeys("Prueba123456");
    }

    // CLICK BUTTON CREATE ACCOUNT
    @Step
    public void CLICK_BUTTONCREATEACCOUNT() {
        registerPage.getDriver().findElement(registerPage.getBUTTONCREATEACCOUNT()).click();
    }

    // HEADER "YOUT ACCOUNT"
    @Step
    public void VALIDATION_HEADERYOURACCOUNT() {
            registerPage.getDriver().findElement(registerPage.getHEADERACCOUNT());
    }
}
