package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReservationRecordPage {

    // three stars
    public static final Target BTN_THREESTARS = Target.the("3 estrellas...")
            .locatedBy("//div [@data-filters-item = 'class:class=3']//input [@name = 'class=3']");

    //

}
