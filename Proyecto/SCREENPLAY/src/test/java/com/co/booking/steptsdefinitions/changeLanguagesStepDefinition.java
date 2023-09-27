package com.co.booking.steptsdefinitions;

import com.co.booking.questions.ValidationLanguageEnglish;
import com.co.booking.task.ChangeLanguageEnglish;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class changeLanguagesStepDefinition {


    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Team15");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @When("the user changes the language to English")
    public void theUserChangesTheLanguageToEnglish() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageEnglish.changeEnglish());
    }

    @Then("the user observes that the page is translated into English")
    public void theUserObservesThatThePageIsTranslatedIntoEnglish() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageEnglish.compare(),
                Matchers.is(true)));
    }

    @When("the user changes the language to English UK")
    public void theUserChangesTheLanguageToEnglishUK() {

    }

    @Then("the user observes that the page is translated into English UK")
    public void theUserObservesThatThePageIsTranslatedIntoEnglishUK() {

    }

    @When("the user changes the language to French")
    public void theUserChangesTheLanguageToFrench() {

    }

    @Then("the user observes that the page is translated into French")
    public void theUserObservesThatThePageIsTranslatedIntoFrench() {

    }

    @When("the user changes the language to German")
    public void theUserChangesTheLanguageToGerman() {

    }

    @Then("the user observes that the page is translated into German")
    public void theUserObservesThatThePageIsTranslatedIntoGerman() {
    }

    @When("the user changes the language to Portuguese")
    public void theUserChangesTheLanguageToPortuguese() {

    }

    @Then("the user observes that the page is translated into Portuguese")
    public void theUserObservesThatThePageIsTranslatedIntoPortuguese() {

    }

    @When("the user changes the language to Portuguese PT")
    public void theUserChangesTheLanguageToPortuguesePT() {

    }

    @Then("the user observes that the page is translated into Portuguese PT")
    public void theUserObservesThatThePageIsTranslatedIntoPortuguesePT() {

    }

    @When("the user changes the language to Italian")
    public void theUserChangesTheLanguageToItalian() {

    }

    @Then("the user observes that the page is translated into Italian")
    public void theUserObservesThatThePageIsTranslatedIntoItalian() {

    }

    @When("the user changes the language to Japanese")
    public void theUserChangesTheLanguageToJapanese() {

    }

    @Then("the user observes that the page is translated into Japanese")
    public void theUserObservesThatThePageIsTranslatedIntoJapanese() {

    }

    @When("the user changes the language to Mandarin")
    public void theUserChangesTheLanguageToMandarin() {

    }

    @Then("the user observes that the page is translated into Mandarin")
    public void theUserObservesThatThePageIsTranslatedIntoMandarin() {

    }

    @When("the user changes the language to Russian")
    public void theUserChangesTheLanguageToRussian() {

    }

    @Then("the user observes that the page is translated into Russian")
    public void theUserObservesThatThePageIsTranslatedIntoRussian() {

    }

    @When("the user changes the language to Greek")
    public void theUserChangesTheLanguageToGreek() {

    }

    @Then("the user observes that the page is translated into Greek")
    public void theUserObservesThatThePageIsTranslatedIntoGreek() {

    }

    @When("the user changes the language to Polish")
    public void theUserChangesTheLanguageToPolish() {

    }

    @Then("the user observes that the page is translated into Polish")
    public void theUserObservesThatThePageIsTranslatedIntoPolish() {

    }

    @When("the user changes the language to Filipino")
    public void theUserChangesTheLanguageToFilipino() {

    }

    @Then("the user observes that the page is translated into Filipino")
    public void theUserObservesThatThePageIsTranslatedIntoFilipino() {

    }

}
