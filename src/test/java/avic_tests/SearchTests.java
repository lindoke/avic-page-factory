package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest{

    private String KEYWORD_TO_SEARCH = "test";
    private String ATTRIBUTE_NAME = "value";
    private int AMOUNT_OF_DISCOUNTED_PRODUCTS = 5;


    @Test
    public void checkEqualsSearchInputAndValue(){
        getHomePage().searchByKeyword(KEYWORD_TO_SEARCH);
        getHomePage().implicitWait(10);
        Assert.assertEquals(getSearchResultPage().getFieldAttribute(ATTRIBUTE_NAME), KEYWORD_TO_SEARCH);
    }

    @Test
    public void checkAmountOfDiscountedProducts(){
        getHomePage().clickOnDiscountLink();
        getHomePage().implicitWait(10);
        Assert.assertEquals(getSearchResultPage().getDiscountedProductsListSize(),
                AMOUNT_OF_DISCOUNTED_PRODUCTS);
    }
}
