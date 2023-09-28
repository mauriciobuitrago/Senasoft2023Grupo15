package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RecordDataUserPage {

    public static final Target TXT_FIRSTNAME = Target.the("Ingresar promer nombre")
            .locatedBy("//input[@id='firstname']");
    public static final Target TXT_LASTNAME = Target.the("Ingrear apellido")
            .locatedBy("//input[@id='lastname']");
    public static final Target TXT_EMAIL = Target.the("Ingresar Email")
            .locatedBy("//input[@id='email']");
    public static final Target TXT_NUMBER = Target.the("Ingresar Numero de telefono")
            .locatedBy("//input[@id='phone']");
    public static final Target R_BTN_TYPER_RESERVATION = Target.the("Escoger boton la reserva es para mi")
            .locatedBy("//input[@id='notstayer_false']");
    public static final Target TXT_COMPLETE_NAME = Target.the("Ingresar nombres y apellidos completos")
            .locatedBy("//input[@id='guest_name_225137905_379954105_0_42_0']");
    public static final Target BTN_SELECT_TIME = Target.the("Selecione la hora de llegada")
            .locatedBy("//select[@id='checkin_eta_hour']");
    public static final Target OP_10 = Target.the("Seleccion de valor hora de llegada")
            .locatedBy("//select[@id='checkin_eta_hour']//option[@value='10']");
    public static final Target BTN_NEXT = Target.the("Clic boton siguiente y ultimos datos")
            .locatedBy("//div[@class='bui-group__item']//button[@type='submit']");
}
