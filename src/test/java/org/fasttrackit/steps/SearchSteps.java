package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchForKeyword(String keyword){
        homePage.setSearchField(keyword);
    }
    @Step
    public void clickSearchIcon(){
        homePage.clickSearchButton();
    }
    @Step
    public void verifyProductIsInList(String productName){
        Assert.assertTrue(searchResultsPage.isProductInList(productName));
    }
    @Step
    public void goToSearchField(){
        shopPage.clickOnSearchField();
    }
    @Step
    public void typeOnSearchField(String value){
        shopPage.setTypeIntoSearchField(value);
    }
    @Step
    public void clickToSearch(){
        shopPage.clickToSearch();
    }
    @Step
    public void isNonExistentProductInShop(){
        Assert.assertEquals("No products were found matching your selection." , searchResultsPage.getSearchMessage());
    }
    @Step
    public void sortProductsByPrice(){
        shopPage.selectPriceFromDropdown();
    }
    @Step
    public void productsAreSortedByAscendingPrice(){
        Assert.assertTrue("Not ascending price" ,shopPage.isPriceAscending());
    }




















}
