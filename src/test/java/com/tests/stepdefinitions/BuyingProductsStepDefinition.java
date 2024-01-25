package com.tests.stepdefinitions;

import com.tests.tasks.AddingProducts;
import com.tests.tasks.CheckoutProducts;
import com.tests.tasks.LoginToSwagLabs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static com.tests.ui.CheckoutCompletePage.LBL_CHECKOUT_FINISHED;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyingProductsStepDefinition {

    @Given("{actor} login to SwagLabs app")
    public void login_to_swag_labs_app(Actor actor) {
        actor.wasAbleTo(LoginToSwagLabs.asAStandardUser());

    }
    @When("adding products to the Shopping car")
    public void adding_products_to_the_shopping_car(List<Map<String, String>> products) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(AddingProducts.toCart(products));

    }
    @When("complete the purchase form")
    public void complete_the_purchase_form() {
        theActorInTheSpotlight().attemptsTo(CheckoutProducts.completeForm());

    }
    @Then("{actor} can complete his purchase and view the message {string}")
    public void can_complete_his_purchase_and_view_the_message(Actor actor, String completePurchaseMessage) {
       actor.attemptsTo(Ensure.that(LBL_CHECKOUT_FINISHED).text().contains(completePurchaseMessage));

    }
}
