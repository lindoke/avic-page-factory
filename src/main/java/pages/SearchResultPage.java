package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage{

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//img[@title='Уценка']")
    private List<WebElement> discountedProductsList;


    public List<WebElement> getDiscountedProductsList(){
        return discountedProductsList;
    }

    public int getDiscountedProductsListSize(){
        return getDiscountedProductsList().size();
    }

    public String getFieldAttribute(String value){
        return searchInput.getAttribute(value);
    }
}
