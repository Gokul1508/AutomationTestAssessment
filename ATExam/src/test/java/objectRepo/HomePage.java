package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(linkText = "Best Sellers"),
            @FindBy(className = "nav-a  ")
    })
    private WebElement bestSellerButton;

    @FindBy(xpath = "//div[.=\"American Tourister 32 Ltrs Black Casual Backpack (AMT FIZZ SCH BAG 02 - BLACK)\"]")
    private WebElement firstItem;

    @FindBy(partialLinkText = "Elect")
    private WebElement electricalButton;

    @FindBy(css = "input#nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(name = "submit.buy-now")
    private WebElement buyNowButton;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;

    @FindBy(name = "proceedToRetailCheckout")
    private WebElement proceedToBuy;


    @FindAll({
            @FindBy(tagName = "a"),
            @FindBy(id = "nav-logo-sprites")
    })
    private WebElement homeButton;

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getBuyNowButton() {
        return buyNowButton;
    }

    public WebElement getBestSellerButton() {
        return bestSellerButton;
    }

    public WebElement getFirstItem() {
        return firstItem;
    }

    public WebElement getProceedToBuy() {
        return proceedToBuy;
    }

    public WebElement getHomeButton() {
        return homeButton;
    }

    public WebElement getElectricalButton() {
        return electricalButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
