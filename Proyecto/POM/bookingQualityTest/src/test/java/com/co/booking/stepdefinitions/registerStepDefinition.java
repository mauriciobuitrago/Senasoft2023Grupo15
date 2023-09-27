package com.co.booking.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.co.booking.steps.registerStep;

public class registerStepDefinition {
    @Steps
    registerStep registerStep;

    @Given("He is on the registration page")
    public void heIsOnTheRegistrationPage() {
        registerStep.openBrowser();
    }

    @When("He enters the data from the form")
    public void heEntersTheDataFromTheForm() {
        registerStep.CLICK_POP_UP();
        registerStep.CLICK_BUTTONSINGUP();
        registerStep.SENDKEYS_INPUTMAIL();
        registerStep.CLICK_BUTTONCONTINUEMAIL();
        registerStep.SENDKEYS_INPUTPASS();
        registerStep.SEND_INPUTCONFIRMPASS();
        registerStep.CLICK_BUTTONCREATEACCOUNT();
    }

    @Then("He will enter the user page")
    public void heWillEnterTheUserPage() {
        registerStep.VALIDATION_HEADERYOURACCOUNT();
    }
}
