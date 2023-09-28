package com.co.booking.task;

import com.co.booking.userinterfaces.LanguagePage;
import com.co.booking.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ChangeLanguageGerman implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.CLOSE_POPPUP_BUTTON),
                Click.on(MenuComponent.BTN_SELECTLANGUAGE),
                Click.on(LanguagePage.BTN_DEUTSH));

    }

    public static ChangeLanguageGerman changeLanguageGerman () {
        return Tasks.instrumented(ChangeLanguageGerman.class);
    }

}
