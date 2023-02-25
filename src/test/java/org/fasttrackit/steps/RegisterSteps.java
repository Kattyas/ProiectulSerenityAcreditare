package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{

    @Step
    public void navigateToMyAccount(){
        homePage.clickMyAccountField();
    }

    @Step
    public void typeUserEmail(String email) {
        accountPage.setEmailField(email);
    }
    @Step
    public void typePassword(String password) {
        accountPage.setPasswordField(password);
    }

    @Step
    public void clickRegister() {
        accountPage.clickRegisterButton();
    }
    @Step
    public void verifyRegisterWithSameAccount() {
        Assert.assertEquals("Error: An account is already registered with your email address. Please log in.",
                accountPage.getErrorText());
    }



















}
