package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LogoutTest extends BaseTest{

    @Test
    public void logoutTest(){
        logoutSteps.navigateToMyAccount();
        logoutSteps.typeUsername(Constants.USER_NAME);
        logoutSteps.typePassword(Constants.USER_PASS);
        logoutSteps.clickLogin();
        logoutSteps.clickLogout();
    }












}
