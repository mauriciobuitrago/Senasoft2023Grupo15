package com.co.booking.steptsdefinitions;

import com.co.booking.questions.ValidationEmail;
import com.co.booking.questions.ValidationEmptyField;
import com.co.booking.questions.ValidationName;
import com.co.booking.task.*;
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
    @Then("the user can see their account settings")
    public void TheUserCanSeeTheirAccountSettings() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationName.compare()
                , Matchers.is("Tu cuenta")));
    }

    @When("the user entered numerical credentials in Email")
    public void theUserEnteredNumericalCredentialsInEmail() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterFailNumbers.enterCredentialsNumbers());
    }
    @Then("the user may see a warning")
    public void theUserMaySeeAWarning() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationEmail.compare()
                , Matchers.is("Comprueba si el e-mail que has introducido es correcto")));
    }

    @When("the user entered special characters in the Email")
    public void theUserEnteredSpecialCharactersInTheEmail() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterFailSpecialcharacters.enterCredentialsSpecial());
    }

    @When("The user did not enter data in the Email")
    public void theUserDidNotEnterDataInTheEmail() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterFailEmptyEmail.enterEmptyEmail());
    }


    @Then("the user can see a warning about the field")
    public void theUserCanSeeAWarningAboutTheField() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationEmptyField.compare()
                , Matchers.is("Continuar con e-mail")));
    }
}
