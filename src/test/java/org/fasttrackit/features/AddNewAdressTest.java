package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class AddNewAdressTest extends BaseTest{

    @Test
    public void addNewAddressTest(){
        addNewAdressSteps.navigateToMyAccount();
        addNewAdressSteps.typeUsername(Constants.USER_NAME);
        addNewAdressSteps.typePassword(Constants.USER_PASS);
        addNewAdressSteps.clickLogin();
        addNewAdressSteps.clickAddresses();
        addNewAdressSteps.clickBillingAddressEdit();
        addNewAdressSteps.typeFirstName("Cata");
        addNewAdressSteps.typeLastName("Kata");
        addNewAdressSteps.typeStreetAddress("adress");
        addNewAdressSteps.typeCity("Bucuresti");
        addNewAdressSteps.typePostcode("111111");
        addNewAdressSteps.typePhone("07400");
        addNewAdressSteps.typeEmailAddress(Constants.USER_NAME);
        addNewAdressSteps.clickSaveAddress();
        addNewAdressSteps.verifyIsAddedSuccesfully();
    }












}
