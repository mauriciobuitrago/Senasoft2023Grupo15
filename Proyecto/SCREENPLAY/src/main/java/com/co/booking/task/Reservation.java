package com.co.booking.task;

import com.co.booking.userinterfaces.LoginPage;
import com.co.booking.userinterfaces.MenuComponent;
import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Reservation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.CLOSE_POPPUP_BUTTON),
                Click.on(MenuComponent.BTN_LOGIN),
                Enter.theValue("andres.estudio.123@gmail.com").into(RegisterPage.TXT_EMAIL),
                Click.on(RegisterPage.BTN_CONTINUE_REGISTER),
                Enter.theValue("Prueba123456").into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN),
                Click.on(MenuComponent.LGO_BOOKING));
        try {
            Thread.sleep(300000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static Reservation enterCredentialsReservation() {
        return Tasks.instrumented(Reservation.class);
    }

}
