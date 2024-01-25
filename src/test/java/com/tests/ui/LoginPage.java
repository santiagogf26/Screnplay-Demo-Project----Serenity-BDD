package com.tests.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;

public class LoginPage {

    public static Target USERNAME = InputField.withNameOrId("user-name");
    public static Target PASSWORD = InputField.withNameOrId("password");
    public static Target LOGIN_BUTTON = Button.withText("Login");

}
