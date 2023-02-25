package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutTest() {
        loginSteps.doLogin(Constants.USER_NAME, Constants.USER_PASS);
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
        checkoutSteps.navigateToCart();
        checkoutSteps.clickToCheckout();
        checkoutSteps.placeOrder();
        checkoutSteps.verifyOrder();
    }
    @Test
    public void checkoutTest2(){
        loginSteps.doLogin(Constants.USER_NAME, Constants.USER_PASS);
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
        cartSteps.navigateToShopPage();
        cartSteps.selectProductCap();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
        checkoutSteps.navigateToCart();
        checkoutSteps.clickToCheckout();
        checkoutSteps.placeOrder();
        checkoutSteps.verifyOrder();
    }


















}
