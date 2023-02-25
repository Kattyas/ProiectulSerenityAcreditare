package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerTest(){
        registerSteps.navigateToMyAccount();
        registerSteps.typeUserEmail(Constants.USER_NAME);
        registerSteps.typePassword(Constants.USER_PASS);
        registerSteps.clickRegister();
    }
    @Test
    public void registerWithExitingAccountTest(){
        registerSteps.navigateToMyAccount();
        registerSteps.typeUserEmail(Constants.USER_NAME);
        registerSteps.typePassword(Constants.USER_PASS);
        registerSteps.clickRegister();
        registerSteps.clickRegister();
        registerSteps.verifyRegisterWithSameAccount();
    }









}
