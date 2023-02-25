package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AddNewAdressSteps extends BaseSteps{

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
    public void clickAddresses(){
        myAccountPage.clickAddresses();
    }
    @Step
    public void clickBillingAddressEdit(){
        addressesPage.clickBillingAddress();
    }
    @Step
    public void typeFirstName(String firstname){
        billingAddressesPage.setFirstNameField(firstname);
    }
    @Step
    public void typeLastName(String lastname){
        billingAddressesPage.setLastNameField(lastname);
    }
    @Step
    public void typeStreetAddress(String address){
        billingAddressesPage.setStreetAddressField(address);
    }
    @Step
    public void typeCity(String city){
        billingAddressesPage.setCityField(city);
    }
    @Step
    public void typeState(String state){
        billingAddressesPage.setStateField(state);
    }
    @Step
    public void typePostcode(String postcode){
        billingAddressesPage.setPostcodeField(postcode);
    }
    @Step
    public void typePhone(String phone){
        billingAddressesPage.setPhoneField(phone);
    }
    @Step
    public void typeEmailAddress(String email){
        billingAddressesPage.setEmailField(email);
    }
    @Step
    public void clickSaveAddress(){
        billingAddressesPage.clickSaveAddressButton();
    }

    @Step
    public void verifyIsAddedSuccesfully() {
        Assert.assertEquals("Address changed successfully." , billingAddressesPage.getAddressText());
    }























}
