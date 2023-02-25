package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(css = ".cart button")
    private WebElementFacade addToCartButton;
    @FindBy(id = "primary")
    private WebElementFacade addedToCartMessage;
    @FindBy(id = "menu-item-124")
    private WebElementFacade cartButton;




    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public void hasBeenProductAddedToCart() {
        addedToCartMessage.shouldContainText(" has been added to your cart.");
    }
    public void clickToCart(){
        clickOn(cartButton);
    }














}
