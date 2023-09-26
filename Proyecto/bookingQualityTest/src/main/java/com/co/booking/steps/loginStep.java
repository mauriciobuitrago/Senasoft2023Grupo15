package com.co.booking.steps;

import com.co.booking.pageobject.loginPage;

public class loginStep {

    loginPage loginPage = new loginPage();

    public void openBrowser() {
        loginPage.open();
    }
    public void CLOSEPOPPUPBUTTON() {
        loginPage.getDriver().findElement(loginPage.getCLOSE_POPPUP_BUTTON()).click();
    }
    public void CLICKLOGINBUTTON() {
        loginPage.getDriver().findElement(loginPage.getLOGIN_BUTONN()).click();
    }
    public void SENDKEYSINPUTMAIL() {
        loginPage.getDriver().findElement(loginPage.getINPUT_MAIL()).sendKeys("estebax89@gmail.com");
    }
    public void CLICKENTERMAILBUTTON() {
        loginPage.getDriver().findElement(loginPage.getENTER_MAIL_BUTTON()).click();
    }
    public void SENDKEYSPASSWORD() {
        loginPage.getDriver().findElement(loginPage.getINPUT_PASSWORD()).sendKeys("AMb967JUAN?*12");
    }
    public void CLICKBUTTONPASS() {
        loginPage.getDriver().findElement(loginPage.getENTER_PASS_BUTTON()).click();
    }
    public void CLICKBUTTONACCOUNT() {
        loginPage.getDriver().findElement(loginPage.getBUTTONACCOUNT()).click();
    }
    public void CLICKBUTTONMANAGEACCOUNT() {
        loginPage.getDriver().findElement(loginPage.getBUTTON_MANAGEACCOUNT()).click();
    }

}
