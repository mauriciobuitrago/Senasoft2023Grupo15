package com.co.booking.questions;

import com.co.booking.userinterfaces.LanguagePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationLanguageFrench implements Question <String> {


    @Override
    public String answeredBy(Actor actor) {

        return Text.of(LanguagePage.LANGUAGE_French).viewedBy(actor).asString();
    }

    public static ValidationLanguageFrench compare () {
        return new ValidationLanguageFrench();
    }
}
