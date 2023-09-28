package com.co.booking.steptsdefinitions;

import com.co.booking.questions.ValidationLanguageEnglish;
import com.co.booking.questions.ValidationLanguageEnglishUK;
import com.co.booking.task.ChangeLanguageEnglish;
import com.co.booking.task.ChangeLanguageEnglishUK;
import com.co.booking.task.ChangeLanguageFrench;
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

    // Change to English

    @When("the user changes the language to English")
    public void theUserChangesTheLanguageToEnglish() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageEnglish.changeEnglish());
    }

    @Then("the user observes that the page is translated into English")
    public void theUserObservesThatThePageIsTranslatedIntoEnglish() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageEnglish.compare()
                , Matchers.is("Find your next stay")));
    }

    // Change to English UK

    @When("the user changes the language to English UK")
    public void theUserChangesTheLanguageToEnglishUK() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageEnglishUK.changeEnglishUK());
    }

    @Then("the user observes that the page is translated into English UK")
    public void theUserObservesThatThePageIsTranslatedIntoEnglishUK() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageEnglishUK.compare()
                , Matchers.is("Search low prices on hotels, homes and much more...")));
    }

    // Change to French

    @When("the user changes the language to French")
    public void theUserChangesTheLanguageToFrench() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeLanguageFrench.changeEnglishFrench());
    }

    @Then("the user observes that the page is translated into French")
    public void theUserObservesThatThePageIsTranslatedIntoFrench() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLanguageEnglishUK.compare()
                , Matchers.is("Search low prices on hotels, homes and much more...")));
    }

    // Change to German

    @When("the user changes the language to German")
    public void theUserChangesTheLanguageToGerman() {

    }

    @Then("the user observes that the page is translated into German")
    public void theUserObservesThatThePageIsTranslatedIntoGerman() {
    }

    // Change to Portuguese Brazil

    @When("the user changes the language to Portuguese")
    public void theUserChangesTheLanguageToPortuguese() {

    }

    @Then("the user observes that the page is translated into Portuguese")
    public void theUserObservesThatThePageIsTranslatedIntoPortuguese() {

    }

    // Change to Portuguese Portugal

    @When("the user changes the language to Portuguese PT")
    public void theUserChangesTheLanguageToPortuguesePT() {

    }

    @Then("the user observes that the page is translated into Portuguese PT")
    public void theUserObservesThatThePageIsTranslatedIntoPortuguesePT() {

    }

    // Change to Italian

    @When("the user changes the language to Italian")
    public void theUserChangesTheLanguageToItalian() {

    }

    @Then("the user observes that the page is translated into Italian")
    public void theUserObservesThatThePageIsTranslatedIntoItalian() {

    }

    // Change to Japanese

    @When("the user changes the language to Japanese")
    public void theUserChangesTheLanguageToJapanese() {

    }

    @Then("the user observes that the page is translated into Japanese")
    public void theUserObservesThatThePageIsTranslatedIntoJapanese() {

    }

    // Change to Mandarin

    @When("the user changes the language to Mandarin")
    public void theUserChangesTheLanguageToMandarin() {

    }

    @Then("the user observes that the page is translated into Mandarin")
    public void theUserObservesThatThePageIsTranslatedIntoMandarin() {

    }

    // Change to Greek

    @When("the user changes the language to Greek")
    public void theUserChangesTheLanguageToGreek() {

    }

    @Then("the user observes that the page is translated into Greek")
    public void theUserObservesThatThePageIsTranslatedIntoGreek() {

    }

    // Change to Polish

    @When("the user changes the language to Polish")
    public void theUserChangesTheLanguageToPolish() {

    }

    @Then("the user observes that the page is translated into Polish")
    public void theUserObservesThatThePageIsTranslatedIntoPolish() {

    }

    // Change to Filipino

    @When("the user changes the language to Filipino")
    public void theUserChangesTheLanguageToFilipino() {

    }

    @Then("the user observes that the page is translated into Filipino")
    public void theUserObservesThatThePageIsTranslatedIntoFilipino() {

    }

}
