package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopPage extends BasePage{

    @FindBy(css = ".post-48 h2")
    private WebElementFacade selectBeanie;
    @FindBy(css = ".header-search .fa")
    private WebElementFacade selectSearchField;
    @FindBy(css = ".search-field")
    private WebElementFacade typeIntoSearchField;
    @FindBy(css = "input[type=submit]:nth-child(2)")
    private WebElementFacade selectSearchButton;
    @FindBy(css = "#primary .price")
    private List<WebElementFacade> listOfPrices;
    @FindBy(css = "select.orderby")
    private WebElementFacade orderByDropdown;
    @FindBy(css = ".post-60 h2")
    private WebElementFacade selectCap;







    public void clickOnBeanie(){
        clickOn(selectBeanie);
    }
    public void clickOnSearchField(){
        clickOn(selectSearchField);
    }
    public void setTypeIntoSearchField(String value){
        typeInto(typeIntoSearchField, value);
    }
    public void clickToSearch(){
        clickOn(selectSearchButton);
    }
    public void selectPriceFromDropdown(){
        orderByDropdown.selectByIndex(4);
    }
    public boolean isPriceAscending(){
        int firstPrice = getIntFromPrice(listOfPrices.get(0).getText());
        int secondPrice = getIntFromPrice(listOfPrices.get(listOfPrices.size()-1).getText());
        return firstPrice <= secondPrice;
    }
    public void clickOnCap(){
        clickOn(selectCap);
    }







}
