package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy (id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = ".woocommerce-order")
    private WebElementFacade orderMessage;








    public void clickPlaceOrder() {
        clickOn(placeOrderButton);
        waitForAllTextToAppear();
    }

    public void hasBeenOrderReceived(){
        orderMessage.shouldContainText("Thank you. Your order has been received.");

    }













}
