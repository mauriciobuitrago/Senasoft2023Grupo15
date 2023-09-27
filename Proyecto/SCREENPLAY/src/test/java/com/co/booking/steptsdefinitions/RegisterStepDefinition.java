package com.co.booking.steptsdefinitions;

import com.co.booking.questions.ValidationName;
import com.co.booking.task.Register;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import com.co.booking.task.Register;

public class RegisterStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Team15");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("the user is on the register page")
    public void theUserIsOnTheRegisterPage() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
    }

    @When("the user entered your credentials")
    public void theUserEnteredYourCredentials() {
    OnStage.theActorInTheSpotlight().attemptsTo(Register.enterCredentials());

    }
    @Then("Then the user can see their account settings")
    public void thenTheUserCanSeeTheirAccountSettings() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationName.compare()
                , Matchers.is("Tu cuenta")));
    }
}
