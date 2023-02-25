package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AddressesPage extends BasePage{

    @FindBy(css = ".u-column1 a")
    private WebElementFacade editBillingAddress;









    public void clickBillingAddress(){
        clickOn(editBillingAddress);
    }


}
