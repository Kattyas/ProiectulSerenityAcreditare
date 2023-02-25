package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{


    @FindBy(id = "reg_email")
    private WebElementFacade emailField;
    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;
    @FindBy(css = ".register .woocommerce-Button")
    private WebElementFacade registerButton;
    @FindBy(id = "username")
    private WebElementFacade usernameField;
    @FindBy(id = "password")
    private WebElementFacade loginPasswordField;
    @FindBy(css = ".login button")
    private WebElementFacade loginButton;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessage;








    public void setEmailField(String value) {
        typeInto(emailField, value);
    }
    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }
    public void clickRegisterButton() {
        clickOn(registerButton);
    }
    public void typeUsernameField(String value){
        typeInto(usernameField,value);
    }
    public void typePasswordField(String value){
        typeInto(loginPasswordField, value);
    }
    public void clickLoginButton() {
        clickOn(loginButton);
    }
    public String getErrorText(){
        return errorMessage.getText();
    }







}
