package com.co.booking.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.co.booking.steps.loginStep;
public class loginStepDefinition {
    @Steps
    loginStep loginStep;

    // Open Browser
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        loginStep.openBrowser();

    }

    // Login Succesful
    @When("the user enters the credentials")
    public void theUserEntersTheCredentials() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginStep.SENDKEYSINPUTMAIL();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginStep.CLICKENTERMAILBUTTON();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginStep.SENDKEYSPASSWORD();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginStep.CLICKBUTTONPASS();

    }

    @Then("the user will observe the user page")
    public void theUserWillObserveTheUserPage() {
        loginStep.CLICKBUTTONACCOUNT();
        loginStep.CLICKBUTTONMANAGEACCOUNT();
    }

    // Failed login due to insertion of numerical data
    @When("the user enters numbers in email")
    public void theUserEntersNumbersInEmail() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.SENDKEYS_INPUTMAIL_NUMBER();
        loginStep.CLICKENTERMAILBUTTON();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // the user enter special characters in email

    @When("the user enter special characters in email")
    public void theUserEnterSpecialCharactersInEmail() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //

    // Error Message
    @Then("The user will see an error on the page")
    public void TheUserWillSeeAnErrorOnThePage() {
        loginStep.FIND_HEADER_MESSAGEERROR();
    }

    //
}
