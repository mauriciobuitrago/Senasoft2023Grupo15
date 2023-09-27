package com.co.booking.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/ ")
public class registerPage extends PageObject {

    // CLOSEPOPPUPBUTTON
    By CLOSEPOPPUPBUTTON = org.openqa.selenium.By.xpath("//button [@class = 'a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");

    // Sing Up Button
    By BUTTONSINGUP = By.xpath("//a [@data-testid = 'header-sign-up-button']");

    // INPUT MAIL REGISTRATION
    By INPUTMAIL = By.xpath("//input [@id = 'username']");

    // BUTTON CONTINUE WITH EMAIL
    By BUTTONCONTINUEMAIL = By.xpath("//button [@class = 'Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");

    // INPUT PASSWORD
    By INPUTPASS = By.xpath("//input [@id = 'new_password']");

    // INPUT CONFIRM PASSWORD
    By INPUTCONFIRMPASS = By.xpath("//input [@id = 'confirmed_password']");

    // BUTTON CREATE ACCOUNT
    By BUTTONCREATEACCOUNT = By.xpath("//button [@class = 'Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");

    // HEADER "YOUR ACCOUNT"
    By HEADERACCOUNT = By.xpath("//div [contains(text(),'Tu cuenta')]");


    // PAGE ELEMENTS - GET AND SETTER


    public By getCLOSEPOPPUPBUTTON() {
        return CLOSEPOPPUPBUTTON;
    }

    public void setCLOSEPOPPUPBUTTON(By CLOSEPOPPUPBUTTON) {
        this.CLOSEPOPPUPBUTTON = CLOSEPOPPUPBUTTON;
    }

    public By getBUTTONSINGUP() {
        return BUTTONSINGUP;
    }

    public void setBUTTONSINGUP(By BUTTONSINGUP) {
        this.BUTTONSINGUP = BUTTONSINGUP;
    }

    public By getINPUTMAIL() {
        return INPUTMAIL;
    }

    public void setINPUTMAIL(By INPUTMAIL) {
        this.INPUTMAIL = INPUTMAIL;
    }

    public By getBUTTONCONTINUEMAIL() {
        return BUTTONCONTINUEMAIL;
    }

    public void setBUTTONCONTINUEMAIL(By BUTTONCONTINUEMAIL) {
        this.BUTTONCONTINUEMAIL = BUTTONCONTINUEMAIL;
    }

    public By getINPUTPASS() {
        return INPUTPASS;
    }

    public void setINPUTPASS(By INPUTPASS) {
        this.INPUTPASS = INPUTPASS;
    }

    public By getINPUTCONFIRMPASS() {
        return INPUTCONFIRMPASS;
    }

    public void setINPUTCONFIRMPASS(By INPUTCONFIRMPASS) {
        this.INPUTCONFIRMPASS = INPUTCONFIRMPASS;
    }

    public By getBUTTONCREATEACCOUNT() {
        return BUTTONCREATEACCOUNT;
    }

    public void setBUTTONCREATEACCOUNT(By BUTTONCREATEACCOUNT) {
        this.BUTTONCREATEACCOUNT = BUTTONCREATEACCOUNT;
    }

    public By getHEADERACCOUNT() {
        return HEADERACCOUNT;
    }

    public void setHEADERACCOUNT(By HEADERACCOUNT) {
        this.HEADERACCOUNT = HEADERACCOUNT;
    }
}

