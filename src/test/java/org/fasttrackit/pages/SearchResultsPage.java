package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage{


    @FindBy(css = "#primary p")
    private WebElementFacade searchMessage;
    @FindBy(css = ".container h1")
    private List<WebElementFacade> listOfProductNames;





    public String getSearchMessage(){
        return searchMessage.getText();
    }
    public boolean isProductInList(String productName){
        waitFor(listOfProductNames.get(0));

        for (WebElementFacade element : listOfProductNames){
            if (element.getText().equalsIgnoreCase(productName)){
                element.click();
                return true;
            }
        }
        return false;
    }



























}
