package com.tests.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static com.tests.ui.ProductsPage.BTN_ADD_TO_SHOP_CART;


public class AddingProducts {
    public static Performable toCart(List<Map<String, String>> productName) {
        return Task.where("{0} adding productos to shop cart",
                actor -> {
                    IntStream.range(0, productName.size())
                            .forEach(
                                    (product) ->actor.attemptsTo(
                                            Click.on(BTN_ADD_TO_SHOP_CART.of(
                                                    String.valueOf(productName.get(product).get("products"))))
                                    ));
                }
        );
    }
}
