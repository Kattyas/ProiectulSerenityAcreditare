package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps{



    @Step
    public void navigateToCart(){
        productPage.clickToCart();
    }
    @Step
    public void clickToCheckout(){
        cartPage.proceedToCheckout();
    }
    @Step
    public void placeOrder() {
        checkoutPage.clickPlaceOrder();
        waitABit(5000);
    }
    @Step
    public void verifyOrder(){
        checkoutPage.hasBeenOrderReceived();
    }


























}
