package com.tests.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;

public class CheckoutPage {

    public static final Target BTN_CHECKOUT = Button.withNameOrId("Checkout");
    public static final Target TXT_NAME = InputField.withNameOrId("first-name");
    public static final Target TXT_LAST_NAME = InputField.withNameOrId("lastName");
    public static final Target TXT_POST_CODE = InputField.withNameOrId("postal-code");
    public static final Target BTN_CONTINUE = Button.withNameOrId("continue");

}
