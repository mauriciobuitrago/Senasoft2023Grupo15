package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {

    public static final Target CLOSE_POPPUP_BUTTON = Target.the("Clic para cerrar anuncio")
            .locatedBy("//button [@class = 'a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    public static final Target BTN_REGISTER = Target.the("Clic boton de registro")
            .locatedBy("//a[@data-testid='header-sign-up-button']");





}
