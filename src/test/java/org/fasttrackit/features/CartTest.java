package org.fasttrackit.features;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTest(){
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
    }
    @Test
    public void removeAProductFromCart(){
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
        checkoutSteps.navigateToCart();
        cartSteps.clickRemove();
        cartSteps.verifyProductWasRemoved();
    }
    @Test
    public void checkCartAfterLogout(){
        loginSteps.doLogin(Constants.USER_NAME, Constants.USER_PASS);
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
        logoutSteps.navigateToMyAccount();
        logoutSteps.clickLogout();
        loginSteps.doLogin(Constants.USER_NAME, Constants.USER_PASS);
        checkoutSteps.navigateToCart();
        cartSteps.verifyProductStillInCart("Beanie");
    }
    @Test
    public void checkCartAfterLogin(){
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
        cartSteps.navigateToShopPage();
        cartSteps.selectProductCap();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
        loginSteps.doLogin(Constants.USER_NAME, Constants.USER_PASS);
        checkoutSteps.navigateToCart();
        cartSteps.verifyFirstProductStillInCart("Beanie");
        cartSteps.verifySecondProductStillInCart("Cap");
    }















}
