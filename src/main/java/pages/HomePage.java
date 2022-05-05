package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(@class, 'button-reset')]")
    private WebElement searchButton;

    @FindBy(xpath = "(//a[@href='/discount'])[1]")
    private WebElement discountedProductsButton;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword (final String keyword){
        searchInput.sendKeys(keyword);
        searchButton.click();

}

    public WebElement getSearchInput(){
        return searchInput;
    }

    public void clickOnDiscountLink(){
        discountedProductsButton.click();
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
