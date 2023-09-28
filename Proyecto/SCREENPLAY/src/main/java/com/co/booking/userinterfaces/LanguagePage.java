package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LanguagePage {

    // OPTION - ENGLISH US LANGUAGE

    public static final Target BTN_ENGLISH_US = Target.the("English (US)").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'English (US)')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO ENGLISH

    public static final Target LANGUAGE_US = Target.the("en-us").
            locatedBy("//* [contains(text(), 'Find your next stay')]");

    /////////////////////---------------------

    // OPTION - ENGLISH UK LANGUAGE

    public static final Target BTN_ENGLISH_UK = Target.the("English (UK)").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'English (UK)')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO ENGLISH UK

    public static final Target LANGUAGE_UK = Target.the("en-gb").
            locatedBy("//* [contains(text(), 'Search low prices on hotels, homes and much more...')]");

    /////////////////////---------------------

    // OPTION - French LANGUAGE

    public static final Target BTN_ENGLISH_French = Target.the("Français").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Français')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO French

    public static final Target LANGUAGE_French = Target.the("fr").
            locatedBy("//html [@lang = 'fr']");

    /////////////////////---------------------

    // OPTION - PORTUGUESE LANGUAGE

    public static final Target BTN_PORTUGUESBR = Target.the("Português (BR)").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Português (BR)')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO PORTUGUESE

    public static final Target LANGUAGE_PORTUGUESBR = Target.the("pt-br").
            locatedBy("//html [@lang = 'pt-br']");

    /////////////////////---------------------

    // OPTION - PORTUGUESE PT LANGUAGE

    public static final Target BTN_PortuguêspPT = Target.the("Português (PT)").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Português (PT)')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO PortuguêspPT

    public static final Target LANGUAGE_PortuguêspPT = Target.the("pt-pt").
            locatedBy("//html [@lang = 'pt-pt']");

    /////////////////////---------------------

    // OPTION - ITALIAN LANGUAGE

    public static final Target BTN_ITALIANO = Target.the("Italiano").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Italiano')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO ITALIANO

    public static final Target LANGUAGE_ITALIANO = Target.the("it").
            locatedBy("//html [@lang = 'it']");

    /////////////////////---------------------

    // OPTION - JAPANESE LANGUAGE

    public static final Target BTN_JAPANESE = Target.the("Italiano").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Italiano')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO JAPANESE

    public static final Target LANGUAGE_JAPANESE = Target.the("ja").
            locatedBy("//html [@lang = 'ja']");

    /////////////////////---------------------

    // OPTION - MANDARIN LANGUAGE

    public static final Target BTN_MANDARIN = Target.the("简体中文").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'简体中文')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO MANDARIN

    public static final Target LANGUAGE_MANDARIN = Target.the("zh-cn").
            locatedBy("//html [@lang = 'zh-cn']");

    /////////////////////---------------------

    // OPTION - GREEK LANGUAGE

    public static final Target BTN_GREEK = Target.the("Ελληνικά").locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Ελληνικά')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO GREEK

    public static final Target LANGUAGE_GREEK = Target.the("el").
            locatedBy("//html [@lang = 'el']");

    /////////////////////---------------------

    // OPTION - POLISH LANGUAGE

    public static final Target BTN_POLISH = Target.the("Polski").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Polski')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO POLISH

    public static final Target LANGUAGE_POLISH = Target.the("pl").
            locatedBy("//html [@lang = 'pl']");

    /////////////////////---------------------

    // OPTION - FILIPINO LANGUAGE

    public static final Target BTN_FILIPINO = Target.the("Filipino").
            locatedBy("//button [@data-testid = 'selection-item']//span [contains(text(),'Filipino')]");

    // CONFIRMATION OF CHANGE OF LANGUAGE TO FILIPINO

    public static final Target LANGUAGE_FILIPINO = Target.the("tl").
            locatedBy("//html [@lang = 'tl']");

    /////////////////////---------------------

}
