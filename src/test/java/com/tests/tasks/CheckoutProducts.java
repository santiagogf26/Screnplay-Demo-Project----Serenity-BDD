package com.tests.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.tests.ui.CheckoutOverviewPage.BTN_FINISH;
import static com.tests.ui.CheckoutPage.*;
import static com.tests.ui.ProductsPage.BTN_SHOP_CART;

public class CheckoutProducts {

    public static Performable completeForm(){
        return Task.where("{0} Completing checkout form",
                Click.on(BTN_SHOP_CART),
                Click.on(BTN_CHECKOUT),
                Enter.theValue("Swag labs").into(TXT_NAME),
                Enter.theValue("Test User").into(TXT_LAST_NAME),
                Enter.theValue("000111").into(TXT_POST_CODE),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)
                );
    }
}
