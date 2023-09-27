package com.co.booking.task;

import com.co.booking.userinterfaces.MenuComponent;
import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterFailNumbers implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(MenuComponent.CLOSE_POPPUP_BUTTON));
        actor.attemptsTo(Click.on(MenuComponent.BTN_REGISTER));
        actor.attemptsTo(Enter.theValue("123456789").into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Click.on(RegisterPage.BTN_CONTINUE_REGISTER));
    }

    public static RegisterFailNumbers enterCredentialsNumbers ()
    {
        return Tasks.instrumented(RegisterFailNumbers.class);
    }
}
