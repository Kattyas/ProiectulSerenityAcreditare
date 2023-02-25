package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(css = "label .search-field")
    private WebElementFacade searchField;
    @FindBy(css = ".search-submit")
    private WebElementFacade searchButton;
    @FindBy(id = "menu-item-122")
    private WebElementFacade myAccountField;
    @FindBy(css = "#menu-item-123 a")
    private WebElementFacade shopField;










    public void setSearchField(String value) {
        typeInto(searchField, value);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }
    public void clickMyAccountField(){
        clickOn(myAccountField);
    }
    public void clickShopField(){
        clickOn(shopField);
    }












}
