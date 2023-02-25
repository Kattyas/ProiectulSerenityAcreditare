package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BillingAddressesPage extends BasePage{

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameField;
    @FindBy(css = ".form-row-last .input-text")
    private WebElementFacade lastNameField;
    @FindBy(css = "p #billing_address_1")
    private WebElementFacade streetAddressField;
    @FindBy(css = "p #billing_city")
    private WebElementFacade cityField;
    @FindBy(id = "billing_state")
    private WebElementFacade stateField;
    @FindBy(id = "billing_postcode")
    private WebElementFacade postcodeField;
    @FindBy(css = ".validate-phone input")
    private WebElementFacade phoneField;
    @FindBy(css = "#billing_email_field .input-text")
    private WebElementFacade emailField;
    @FindBy(css = "p .button")
    private WebElementFacade saveAddressButton;
    @FindBy(css = "div .woocommerce-message")
    private WebElementFacade addressMessage;







    public void setFirstNameField(String value){
        typeInto(firstNameField,value);
    }
    public void setLastNameField(String value){
        typeInto(lastNameField,value);
    }
    public void setStreetAddressField(String value){
        typeInto(streetAddressField,value);
    }
    public void setCityField(String value){
        typeInto(cityField,value);
    }
    public void setStateField(String value){
        typeInto(stateField,value);
    }
    public void setPostcodeField(String value){
        typeInto(postcodeField,value);
    }
    public void setPhoneField(String value){
        typeInto(phoneField,value);
    }
    public void setEmailField(String value){
        typeInto(emailField,value);
    }
    public void clickSaveAddressButton(){
        clickOn(saveAddressButton);
    }
    public String getAddressText(){
        return addressMessage.getText();
    }












}
