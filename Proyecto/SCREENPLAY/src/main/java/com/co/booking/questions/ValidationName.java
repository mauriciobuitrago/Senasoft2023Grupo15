package com.co.booking.questions;

import com.co.booking.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationName implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MenuComponent.VALIDATE_ACCOUNT).viewedBy(actor).asString();
    }

    public static ValidationName compare ()
    {
        return new ValidationName();
    }
}
