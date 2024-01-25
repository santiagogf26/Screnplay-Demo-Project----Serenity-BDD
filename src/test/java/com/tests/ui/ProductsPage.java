package com.tests.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class ProductsPage {

    public static final Target BTN_ADD_TO_SHOP_CART= Target.the("Button to add products to Shopping Cart")
            .locatedBy("//div[@class='inventory_item_name ' and contains(text(),'{0}')]" +
                    "/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']/button[text()='Add to cart']");
    public static final Target BTN_SHOP_CART= PageElement.withCSSClass("shopping_cart_link");
}
