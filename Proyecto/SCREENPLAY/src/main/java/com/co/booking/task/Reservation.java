package com.co.booking.task;

import com.co.booking.userinterfaces.MenuComponent;
import com.co.booking.userinterfaces.ReservationRecordPage;
import com.co.booking.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Scroll;

public class Reservation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.CLOSE_POPPUP_BUTTON));
        actor.attemptsTo(Scroll.to(SearchPage.BTN_SCROLL));
        actor.attemptsTo(Click.on(SearchPage.TXT_SEARCH));
        actor.attemptsTo(Click.on(SearchPage.BTN_OPTION));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(SearchPage.BTN_FIRSTSDAY));
        actor.attemptsTo(Click.on(SearchPage.BTN_SECONDDAY));
        actor.attemptsTo(Click.on(SearchPage.BTN_CALENDAR));
        actor.attemptsTo(Click.on(SearchPage.BTN_PERSON));
        actor.attemptsTo(Click.on(SearchPage.BTN_VALOR_PERSON));
        actor.attemptsTo(DoubleClick.on(SearchPage.BTN_VALOR_CHILDREN));
        actor.attemptsTo(Click.on(SearchPage.BTN_YEAR_FIRST_CHILDREN));
        actor.attemptsTo(Click.on(SearchPage.OP_YEAR_FIRST_CHILDREN));
        actor.attemptsTo(Click.on(SearchPage.BTN_YEAR_SECOND_CHILDREN));
        actor.attemptsTo(Click.on(SearchPage.OP_YEAR_SECOND_CHILDREN));
        actor.attemptsTo(Click.on(SearchPage.BTN_VALOR_BEDROOMS));




    }

    public static Reservation enterCredentialsReservation() {
        return Tasks.instrumented(Reservation.class);
    }

}
