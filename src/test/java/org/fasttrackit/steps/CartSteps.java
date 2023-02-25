package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;


public class CartSteps extends BaseSteps{

    @Step
    public void navigateToShopPage(){
        homePage.clickShopField();
    }
    @Step
    public void selectProduct(){
        shopPage.clickOnBeanie();
    }
    @Step
    public void clickAddToCart() {
        productPage.clickAddToCartButton();
    }
    @Step
    public void verifyProductWasAddedToCart() {
        productPage.hasBeenProductAddedToCart();
    }
    @Step
    public void clickRemove(){
        cartPage.removeProduct();
    }
    @Step
    public void verifyProductWasRemoved() {
        cartPage.hasBeenProductRemoved();
    }
    @Step
    public void verifyProductStillInCart(String product){
        cartPage.isStillProductInCart(product);
    }
    @Step
    public void selectProductCap(){
        shopPage.clickOnCap();
    }
    @Step
    public void verifyFirstProductStillInCart(String product){
        cartPage.isStillProductBeanieInCart(product);
    }
    @Step
    public void verifySecondProductStillInCart(String product){
        cartPage.isStillProductCapInCart(product);
    }


























}
