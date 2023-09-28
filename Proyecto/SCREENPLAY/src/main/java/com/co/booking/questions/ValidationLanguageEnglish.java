package com.co.booking.questions;

import com.co.booking.userinterfaces.LanguagePage;
import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidationLanguageEnglish implements Question <String> {


    @Override
    public String answeredBy(Actor actor) {
        return Visibility.of(LanguagePage.LANGUAGE_US).viewedBy(actor).asString();
    }

    public static ValidationLanguageEnglish compare () {
        return new ValidationLanguageEnglish();
    }
}
