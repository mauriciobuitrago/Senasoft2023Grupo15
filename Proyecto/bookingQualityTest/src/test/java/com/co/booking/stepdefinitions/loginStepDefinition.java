package com.co.booking.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.co.booking.steps.loginStep;
public class loginStepDefinition {
    @Steps
    loginStep loginStep;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        loginStep.openBrowser();

    }
    @When("the user enters the credentials")
    public void theUserEntersTheCredentials() {
        loginStep.CLOSEPOPPUPBUTTON();
        loginStep.CLICKLOGINBUTTON();
        loginStep.SENDKEYSINPUTMAIL();
        loginStep.CLICKENTERMAILBUTTON();
        loginStep.SENDKEYSPASSWORD();
        loginStep.CLICKBUTTONPASS();

    }
    @Then("Then the user will observe the user page")
    public void thenTheUserWillObserveTheUserPage() {
        loginStep.CLICKBUTTONACCOUNT();
        loginStep.CLICKBUTTONMANAGEACCOUNT();
    }
}
