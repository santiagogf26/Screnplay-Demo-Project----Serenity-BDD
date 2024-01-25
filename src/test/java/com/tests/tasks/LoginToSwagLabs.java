package com.tests.tasks;


import com.tests.ui.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginToSwagLabs {

    private static String userName = System.getProperty("user_name");
    private static String password = System.getProperty("password");

    public static Performable withCredentials(String username, String password) {
        return Task.where("{0} opens the Sauce Demo home page ",
                Open.browserOn().thePageNamed("pages.testPage"),
                Enter.theValue(username).into(LoginPage.USERNAME),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static Performable asAStandardUser() {
        return withCredentials(userName, password);
    }

}
