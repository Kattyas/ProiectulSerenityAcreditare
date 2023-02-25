package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps{

    @Step
    public void navigateToMyAccount(){
        homePage.clickMyAccountField();
    }
    @Step
    public void typeUsername(String username) {
        accountPage.typeUsernameField(username);
    }
    @Step
    public void typePassword(String password) {
        accountPage.typePasswordField(password);
    }
    @Step
    public void clickLogin() {
        accountPage.clickLoginButton();
    }
    @Step
    public void userIsLoggedIn(String username) {
        myAccountPage.userIsLoggedIn(username);
    }

    @Step
    public void doLogin(String username, String password){
        navigateToMyAccount();
        typeUsername(username);
        typePassword(password);
        clickLogin();
    }
    @Step
    public void checkErrorMessage(){
        Assert.assertEquals("ERROR: Invalid username. Lost your password?" , accountPage.getErrorText());
    }

























}
