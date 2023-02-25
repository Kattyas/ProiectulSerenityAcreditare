package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class LogoutSteps extends BaseSteps{

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
    public void clickLogout(){
        myAccountPage.clickLogoutButton();
    }












}
