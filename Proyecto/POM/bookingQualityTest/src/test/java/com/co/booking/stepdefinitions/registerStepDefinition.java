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

    }

    @When("He enters the data from the form")
    public void heEntersTheDataFromTheForm() {

    }

    @Then("He will enter the user page")
    public void heWillEnterTheUserPage() {

    }
}
