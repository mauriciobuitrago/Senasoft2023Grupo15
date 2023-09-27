package com.co.booking.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/register.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.co.booking.stepdefinitions"
)
public class registerRunner {
}
